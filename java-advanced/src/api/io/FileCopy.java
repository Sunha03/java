package api.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		//FileTest01.java 파일 copy 하기
		//1. FileReader로 읽고, FileWriter로 출력
		//2. src/data/copy_result.txt로 생성
		//3. 콘솔에 출력
		
		FileWriter fw = new FileWriter("src/data/copy_result.txt", true);
		FileReader fr = new FileReader("src/api/io/FileTest01.java");
		
		while(true) {
			int ch = fr.read();
			fw.write(ch);
			
			System.out.print((char)ch);
			
			if(ch == -1)
				break;
		}
		
		if(fw != null)
			fw.close();
		if(fr != null)
			fr.close();
	}
}
