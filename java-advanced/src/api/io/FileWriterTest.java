package api.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) throws IOException {
		//File 출력은 매개변수로 전달된 파일이 있으면 > 해당 파일을 열고 작업
		//없는 경우 > 새로 파일 생성 + 작업
		//1. 파일 open
		//FileWriter fw = new FileWriter("src/data/output.txt");
		
		//write 메소드가 호출될 때마다 파일에 내용을 추가 > append mode를 true
		FileWriter fw = new FileWriter("src/data/output2.txt", true);
		
		//2. 파일 액세스
		fw.write(97);		//int 데이터
		fw.write("문자열쓰기\n");
		fw.write("test\n");
		
		//3. 파일 close
		if(fw != null)
			fw.close();
	}
}
