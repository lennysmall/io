package kr.ac.busanit.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SampleFileRead {
	public void readData(){
		ArrayList<Student> list = new ArrayList<Student>();

		try {
			FileReader fr = new FileReader(SampleFileWrite.FILENAME);
			int ch = 0;
			String data = "";
			try {
				while((ch=fr.read()) >0){
					if(ch!='\n'){
						data += (char)ch;
					}else{
						String[] split = data.split(",");
						String name = split[0];
						int kor = Integer.parseInt(split[1]);
						int eng = Integer.parseInt(split[2]);
						int math = Integer.parseInt(split[3]);

						Student s= new Student(name, kor, eng, math);
						list.add(s);
						data="";
					}
				}// end of while
				fr.close();
				show(list);

			} catch (IOException e) {
				e.printStackTrace(); 	
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void show(List<Student> list){
		for(Student s : list){
			System.out.println(s);
		}

	}
	public static void main(String[] args) {
		new SampleFileRead().readData();
	}
}
