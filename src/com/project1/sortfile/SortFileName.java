package com.project1.sortfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class SortFileName {

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
	public void deleteFile(String fileToBeDeleted) {
		
		try {
			File f = new File(fileToBeDeleted);
			if(f.delete()) {
				System.out.println(f.getName() + " is deleted");
			} else {
				System.out.println("Failed");
				throw new FileNotFoundException();
				//System.out.println("Failed To delete file");
			}
		} catch (Exception e) {
			System.out.println("" + e.toString());
		}
	}
	
	//Option (D) - Search for user specified file from directory
	public void findFile(String fileName, File file) {
		File[] list = file.listFiles();
		if(list!=null) {
			for(File fils: list) {
				if(fils.isDirectory()) {
					findFile(fileName, fils);
				} else if(fileName.equalsIgnoreCase(fils.getName())) {
					System.out.println(fileName+ " was found in "+fils.getParentFile());
				} 
			}
		}else {
			System.out.println("FNF! File Not Found");
		}
	}

}
