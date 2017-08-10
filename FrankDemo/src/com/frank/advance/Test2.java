package com.frank.advance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test2 {
	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new FileReader("file.txt"));
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();				
			}
			br.close();
		}
		catch(IOException e){
			System.out.println("IO Problem");
		}
	}

}
