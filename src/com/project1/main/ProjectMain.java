package com.project1.main;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.project1.developerdetails.DeveloperDetails;
import com.project1.sortfile.*;

import javax.swing.JOptionPane;

public class ProjectMain {

	public static void main(String[] args) throws IOException {
		
		
		System.out.println("Welcome \n Project 1: Virtual Key for your repositories");
		
		DeveloperDetails dd = new DeveloperDetails();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" "+ dd.displayDeveloperDetails());
		
		SortFileName sfile = new SortFileName();
		boolean boolContinue= true;
		
		System.out.println("\nEnter your desired path");
		String dirPath = scanner.nextLine();
		
		do
		{
			System.out.println("Choose (A) for displaying the list of files" + "\n"+
					"Choose (B) to enter,search or delete files" + "\n"+
					"Choose (X) to terminate the program" + "\n");
			char charSelection = scanner.next().charAt(0);

			switch(charSelection)
			{
			case 'a':
			case 'A':
			{
				System.out.println("These are the list of files:");
				File[] fileArray = sfile.sortDirFiles(dirPath);
				
				for(File file: fileArray)
				{

					System.out.println(file.getName());
				}
				break;
			}

			case 'b':
			case 'B':
			{
				
				boolean boolSecondMenu =true;
				
				

				System.out.println("Choose (E) for entering a new file"+ "\n"+
						"Choose (S) to search a new file" + "\n"+
						"Choose (D) to delete a file" + "\n"+
						"Choose (M) to return to main menu");
				char charFileOption = scanner.next().charAt(0);
				switch(charFileOption)
				{
				case 'e':
				case 'E':
				{
					System.out.println("Created new file");
					String fileName = scanner.nextLine();
					fileName = fileName + ".txt";
					sfile.addNewFile(fileName);
					break;

				}
				case 's':
				case 'S':
				{

					break;

				}
				case 'd':
				case 'D':
				{

					break;

				}
				case 'm':
				case 'M':
				{
					

					break;
				}

				}
				break;
				
			

			}

			case 'x':
			case 'X':
			{
				System.out.println("Bye");
				boolContinue = false;
				break;
			}
			}

		}while(boolContinue);
		//sfile.userOptions();
		
	}

}
