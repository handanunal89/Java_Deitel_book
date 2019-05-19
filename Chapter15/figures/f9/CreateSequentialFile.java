/**
 *Figures 15.9 -  CreateSequentialFile
 * 
 * Author: Handan Unal
 * 
 */
package figures.f9;

import java.awt.desktop.OpenFilesEvent;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateSequentialFile {

	private static ObjectOutputStream output;

	public static void main(String[] args) {

		openFile();
		addRecords();
		closeFile();

	}

	public static void openFile() {
		try {
			output = new ObjectOutputStream(Files.newOutputStream(Paths.get("clients.ser")));
		} catch (IOException ioException) {
			System.err.println("Error opening file. Terminating.");
			System.exit(1); // terminate
		}

	}

	private static void addRecords() {
		Scanner input = new Scanner(System.in);

		System.out.println(
				"Please enter Account Numnber,FirstName, LastName and balance\nEnter end-of-file indicator to end the input: ");

		while (input.hasNext()) {

			try {
				Account record = new Account(input.nextInt(), input.next(), input.next(), input.nextDouble());

				output.writeObject(record);

			} catch (NoSuchElementException elementException) {
				System.err.println("Invalid input. Please try again.");
				input.nextLine(); // discard input so user can try again
			} catch (IOException ioException) {
				System.err.println("Error writing to file. Terminating.");
				break;
			}
			System.out.print("? ");
		}

	}

	private static void closeFile() {

		try {
			if (output != null) {
				output.close();
			}
		} catch (IOException ioException) {
			System.err.println("Error closing file. Terminating.");
		}

	}

}
