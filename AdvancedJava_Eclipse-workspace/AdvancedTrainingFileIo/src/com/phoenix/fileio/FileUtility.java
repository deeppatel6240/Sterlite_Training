package com.phoenix.fileio;

import java.io.File;
import java.io.IOException;

public class FileUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// file creation
			File file = new File("hello.txt");
			System.out.println("File Created: " + file.createNewFile());
			
			// dir creation
			File dir = new File("DeepFileIoPractice");
			System.out.println("Directory Created: " + dir.mkdir());
			
			//file inside directory
			File f1 = new File(dir, "hello.txt");
			System.out.println("File Created: " + f1.createNewFile());
			
			// file creation
			File f2 = new File(dir, "welcome.txt");
			
			// rename file name
			System.out.println("Renaming file " + f1.getName() + " to " +
									f2.getName() + ": " +
									f1.renameTo(f2));
			
			// delete file
			File f3 = new File("welcome.txt");
			System.out.println("Deleted file: " + f3.delete());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
