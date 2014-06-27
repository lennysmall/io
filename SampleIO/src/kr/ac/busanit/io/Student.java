package kr.ac.busanit.io;

public class Student {
	String name;
	int kor;
	int eng;
	int math;
	public Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	@Override
	public String toString() {
		return name+","+kor+","+eng+","+math; //이 형태로 저장
	}
}
