package kr.ac.busanit.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SampleFile {
	public static void main(String[] args) {
		try {
			FileReader fis = new FileReader(SampleFileWrite.FILENAME);
			  //캐릭터 단위 처리는 글자깨짐 , 파일인풋스트림말고 파일리더로 쓸것
			int ch;
			while((ch=fis.read())>=0){
				System.out.print((char)ch);   //이전에 \n때문에  자동으로 출바뀜출력이 됨. 텍스트파일에 들어있음
			}
			fis.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
