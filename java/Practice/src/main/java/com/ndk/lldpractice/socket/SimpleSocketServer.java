package com.ndk.lldpractice.socket;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleSocketServer {

    private static final Logger log = LogManager.getLogger(SimpleSocketServer.class);

    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(2000)) {
            log.info("Server started, waiting for client...");
            Socket socket = serverSocket.accept();
            log.info("Client is connected");

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader socketBufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);

            int numOfMessages = 10;
            while (numOfMessages > 0) {
                String messageFromClient = socketBufferedReader.readLine();
                log.info("Message from client: {}", messageFromClient);

                log.info("Enter the reply to send to client...");
                String message = bufferedReader.readLine();
                printWriter.println(message);

                numOfMessages--;
            }
        }
    }
}
