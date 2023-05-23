package com.cg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDatafromfile {
	
	public static void main(String[] args) throws IOException {
		String str="";
		
		FileReader fr=new FileReader("C:\\Z\\Text.txt");
		
		BufferedReader br=new BufferedReader(fr);
		
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
		
		br.close();
	}
	
	
	

}
