package com.assignment.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFile {
	File file = new File("SampleFiles/file.txt");
	BufferedWriter writer ;
	BufferedReader reader;
	Scanner sr = new Scanner(System.in);
	public void createFile() throws IOException {
		
		if(!file.exists())
			file.createNewFile();		
	}
	
	public void readData() throws IOException {
		
		reader = new BufferedReader(new FileReader(file));		
		String str ;
		while((str = reader.readLine())!=null)
			System.out.println(str);
		
		reader.close();
		
	} 
	public void updateData() {
		
	}
	
	public void removeData() {
		
	}
	
	public void appendData() throws IOException {

		
		writer = new BufferedWriter(new FileWriter(file,true));
		String line = sr.nextLine();
		writer.write(line);
		writer.newLine();
		writer.close();
		 System.out.println("Data successfully appended at the end of file");
		
		
		
		
	}
	
	
	public static void main(String[] args) throws IOException {
		
		TextFile pf = new TextFile();
		pf.createFile();
		pf.readData();
		pf.updateData();
		pf.removeData();
		pf.appendData();
		pf.readData();
		
		
		
	}
	

}
