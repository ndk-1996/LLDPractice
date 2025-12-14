package com.ndk.lldpractice.socket;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleSocketClient {

    private static final Logger log = LogManager.getLogger(SimpleSocketClient.class);

    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("localhost", 2000)) {
            log.info("Client created successfully");
            log.info("Client connected to server: {}", socket.getRemoteSocketAddress());

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader socketBufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);

            int numOfMessages = 10;
            while (numOfMessages > 0) {
                log.info("Enter the message to send to server...");
                String message = bufferedReader.readLine();
                printWriter.println(message);

                String messageFromServer = socketBufferedReader.readLine();
                log.info("Received reply from server: {}", messageFromServer);

                numOfMessages--;
            }
        }
    }
}
