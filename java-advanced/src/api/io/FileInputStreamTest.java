package api.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//advancedJava 프로젝트 폴더에 저장된 test.txt 내용 읽고, 콘솔에 출력
public class FileInputStreamTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			//1. 파일 오픈
			fis = new FileInputStream("src/data/test.txt");
			//2. 파일 액세스
			while(true) {
				int data = fis.read();
				if(data == -1)
					break;
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//3. 파일 닫기
				if(fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
