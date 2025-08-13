package com.ndk.lldpractice.utilities;

import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;

public class PdfPageRemover {

    private static final String pdfFilePath = "";
    private static final String outputFilePath = "";

    public static void main(String[] args) throws IOException {
        int pageNumberToRemove = 2; // Page numbers are 0-indexed.
        try (PDDocument pdDocument = PDDocument.load(new File(pdfFilePath))) {
            // Check if the document is not empty.
            if (pdDocument.getNumberOfPages() > 0) {
                // Remove the first page.
                pdDocument.removePage(pageNumberToRemove);
                // Save the modified document to a new file.
                pdDocument.save(outputFilePath);
                System.out.println("Requested page removed successfully.");
            } else {
                System.out.println("The PDF document is empty.");
            }
        }
    }
}
