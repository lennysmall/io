package kr.ac.busanit.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Buffer {

	public static void main(String[] args) throws IOException{
		BufferedReader in = null;
		ArrayList<Student> list = new ArrayList<Student>();

		in = new BufferedReader(new FileReader(SampleFileWrite.FILENAME));

		String line;
		while ((line = in.readLine())!=null) {
			System.out.println(line);
		}
		if(in != null)
			in.close();
		

	}
}



