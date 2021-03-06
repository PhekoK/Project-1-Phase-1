package com.project1.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
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
					System.out.println("Name of file you want to create");
					String txtFile = scanner.next();
					
					Path p1 = Paths.get(dirPath);
					
					File f1 = new File(p1+"/"+txtFile);
					
					File f2 = new File(p1.toString());
					try {
						f1.createNewFile();
						
					} catch (Exception e) {
						System.out.println("Error creating a new file" + e.toString());
					}
					
					break;

				}
				case 's':
				case 'S':
				{
					System.out.println("Enter name of file you want to search...");
					String name = scanner.next();
					sfile.findFile(name, new File(dirPath));
					break;

				}
				case 'd':
				case 'D':
				{
					System.out.println("Which file would you like to delete? ");
					String dFile = scanner.next();
					Path p1 = Paths.get(dirPath);

					sfile.deleteFile(p1+"/"+dFile);
					break;

				}
				case 'm':
				case 'M':
				{
					System.out.println("\nBack to main menu option ...");
					break;
				}
					
				default:
					System.out.println("Wrong input. Try again");

				}
				break;

			}

			case 'x':
			case 'X':
			{
				JOptionPane.showMessageDialog(null, "Bye :)");
				System.out.println("Program terminated");
				boolContinue = false;
				break;
			}
			
			default:
				System.out.println("Invalid option. Try again");
			}

		}while(boolContinue);
		
	}

}
