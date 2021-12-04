package api.io;

import java.io.File;
import java.text.SimpleDateFormat;

//폴더의 내부를 탐색
public class FileTest02 {
	public static void main(String[] args) {
		//c:\iot\iotest 폴더의 하위 폴더/파일 출력
		//[출력형태]
		//a -----------------[폴더]
		//b -----------------[폴더]
		//ArrayTest01.java ------------[파일 : (파일 사이즈)]
		//.
		//.
		//.
		
		//마지막 접속한 날짜(년/월/일)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		File file = new File("c:/iot/iotest");
		File[] files = file.listFiles();
		for(int i=0;i<files.length;i++) {
			System.out.print(files[i].getName() + " ------------ ");
			if(files[i].isDirectory())
				System.out.println("[폴더]");
			else if(files[i].isFile())
				System.out.print("[파일 : " + files[i].length() + "] ");
			System.out.println("마지막 수정(" + sdf.format(files[i].lastModified()) + ")");
		}
		
	}
}
