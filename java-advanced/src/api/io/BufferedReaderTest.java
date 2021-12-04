package api.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//advancedJava 프로젝트 폴더에 저장된 test.txt 내용 읽고, 콘솔에 출력
public class BufferedReaderTest {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			//1. 파일 오픈
			/*fr = new FileReader("src/data/test.txt");		//기본 스트림
			br = new BufferedReader(fr);				//보조 스트림*/
			//BufferedReader는 보조스트림으로 원시데이터와 연결 불가
			//> 원시 데이터를 읽을 수 있는 기본 스트림을 생성해서 넘겨줘야 함
			br = new BufferedReader(new FileReader("src/api/io/FileTest01.java"));
			
			//2. 파일 액세스
			int count = 0;		//실행 시간
			long start = System.nanoTime();
			
			while(true) {
				int data = br.read();
				
				if(data == -1)
					break;
				System.out.print((char)data);
				
				count++;
			}
			
			long end = System.nanoTime();
			System.out.println("실행 횟수 : " + count);
			System.out.println("실행 시간 : " + (end - start));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//3. 파일 닫기
				if(br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
