package linuxcheck;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class linuxpath {
	
	
	
	public static void main(String[] args) throws IOException {
		
		// Define the file path
        String filePath = "folder"+File.separator+"test.txt";

        try {
            // Create a File object
            File file = new File(filePath);

            // Create a FileWriter object
            FileWriter writer = new FileWriter(file);

            // Write some text to the file
            writer.write("This is a test file created using Java.");

            // Close the FileWriter
            writer.close();

            System.out.println("File created successfully at: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error creating file: " + e.getMessage());
        }
	    
	       
}}
