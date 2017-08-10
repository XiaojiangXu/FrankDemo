package com.frank.advance;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:/Users/Administrator/Desktop/file.txt"));
		try{
			StringBuffer sb = new StringBuffer();
			String line = br.readLine();
			
			while (line != null){
				sb.append(line);
				sb.append("\n");
				line = br.readLine();
				System.out.println(line);
			}
			String everything = sb.toString();
			System.out.println(everything);
		}
		catch(IOException e){
			e.printStackTrace();
			System.out.println("IO Problem");
		}
		finally {
			br.close();
		}

	}
}