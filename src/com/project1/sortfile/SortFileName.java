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
	
	//Option (D) - delete file from existing directory
	public void deleteFile() {
		
	}

}
