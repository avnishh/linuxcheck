package linuxcheck;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class linuxpath {
	
	
	
	public static void main(String[] args) throws IOException {
		
	
		        String directoryPath = "folder";

		        // Print debug information
		        System.out.println("Directory path: " + directoryPath);

		        // Create the directory if it doesn't exist
		        File directory = new File(directoryPath);
		        if (!directory.exists()) {
		            System.out.println("Directory does not exist, creating it...");
		            directory.mkdirs(); // Create the directory along with any necessary parent directories
		        }

		        // Define the file path within the directory
		        String filePath = directoryPath + File.separator + "test.txt";

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
		    }
		

	       
}
