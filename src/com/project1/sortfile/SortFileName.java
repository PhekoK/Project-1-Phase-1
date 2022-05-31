package com.project1.sortfile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class SortFileName {

	String dirPath = null;
	Scanner sc = new Scanner(System.in);

	public void enterFilePath() {

		System.out.println("\nPlease enter a file path below: ");
		Scanner sc = new Scanner(System.in);

		dirPath = sc.nextLine(); // use nextLine() instead of next()
		if (!dirPath.isEmpty()) {
			System.out.println("You entered file path: " + dirPath);

		} else if (dirPath.isEmpty()) {
			System.out.println("You have not entered a directory path. Why?");
		} else {
			throw new IllegalArgumentException();
		}

		sc.close();
	}

	/*
	 * public void userOptions() { System.out.
	 * println(" Input (A) to display list of file names in ascending order" +
	 * "\n Input (B) Add, Delete, or Search files in current directory" +
	 * " \n Input (X) To terminate program ");
	 * 
	 * char inputOption = sc.next().charAt(0);
	 * 
	 * try { switch(inputOption) { case 'a': case 'A':
	 * System.out.println("Your sorted list below: "); sortDirFiles(); break; case
	 * 'b': case 'B': System.out.println( " \n Input (N) Add new file to path " +
	 * " \n Input (D) Delete file from path " +
	 * " \n Input (S) Search file from the main directory \n " +
	 * "Input (M) Back to menu"); //Nested switch statement after displaying sorted
	 * list char charSelect = sc.next().charAt(0); switch(charSelect) { case 'n':
	 * case 'N': //add new file code System.out.println("Add new file"); case 'd':
	 * case 'D': //delete existing file code
	 * 
	 * case 's': case 'S': //search file in directory code
	 * 
	 * case 'm': case 'M': //Back to main menu option code
	 * 
	 * } case 'X': case 'x': System.out.println("Bye!");
	 * JOptionPane.showMessageDialog(null, "You have exited the program"); break;
	 * default: System.out.println("Invalid option"); }
	 * 
	 * if(inputOption == 'A' || inputOption == 'a') { sortDirFiles();
	 * 
	 * } else if (inputOption == 'B' || inputOption == 'b') { //SOme code } else
	 * if(inputOption == 'X' || inputOption == 'x') {
	 * System.out.println("You closed the program"); //break; } else {
	 * System.out.println("Invalid Option."); }
	 * 
	 * } catch (Exception e) { throw new IllegalArgumentException(); }
	 * 
	 * }
	 */

	// Option (A) - Sort files in ascending order
	public File[] sortDirFiles(String dirPath) {
		File fileDir = new File(dirPath);
		File[] myFiles = null;
		if (fileDir.isDirectory()) {
			myFiles = fileDir.listFiles();
			// sort
			Arrays.sort(myFiles);
		}
		return myFiles;
	}

	// Option (N) - Add new file to existing directory list
	public void addNewFile(String newFile) {
		//File dirName = new File(dirPath);
        try {
		File file = new File (newFile);
		if(file.createNewFile()) {
			System.out.println("New file added: " + file.getName());
		} else {
			System.out.println("File already exists");
		}
		} catch (Exception e) {
			System.out.println("Error while adding file " + e.toString());
		}
		

	}

}
