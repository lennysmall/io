package kr.ac.busanit.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//
public class SampleFileWrite {
	public static final String FILENAME = "d:/sample.txt";
	public void createData(){
		//Student class의 객체를 생성하고 리스트에 담는다.
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("수지", 100, 100, 100));
		list.add(new Student("박주영", 101, 101, 101));
		list.add(new Student("아이유", 95, 95, 95));

		writeData(list);

		System.out.println("처리할 내용");
		SampleFileRead.show(list);
	}
	public void writeData(List<Student> list){
		//리스트의 객체들의 데이터를 파일에 저장한다.
		try {
			FileWriter fw = new FileWriter(FILENAME, true);
			// true는 계속 추가 함. 기존내용에 추가개념 트루빼면 다시생성
			
			for(Student s : list){
				fw.write(s.toString()+"\n");
			}
			fw.close(); //자원 반납
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new SampleFileWrite().createData();
	}
}
