package api.io;

import java.io.File;

public class FileTest01 {
	public static void main(String[] args) {
		//액세스하고 싶은 파일/폴더의 위치를 File 객체 만들 때 매개변수에 정의
		//1. c:\iot\iotest
		File file1 = new File("c:/iot/iotest");
		System.out.println(file1);
		
		//2. 프로젝트 폴더 > text.txt 파일
		//	 > 경로 정의 (X) = 프로젝트 폴더
		File file2 = new File("text.txt");
		System.out.println(file2);
		
		//3. src/data 폴더 > test.txt 파일
		File file3 = new File("src/data/text.txt");		//상대 경로
		
		System.out.println("File3.canRead() : " + file3.canRead());
		System.out.println("File3.canWrite() : " + file3.canWrite());
		System.out.println("File3.getName() : " + file3.getName());
		System.out.println("File3.getAbsolutePath() : " + file3.getAbsolutePath());
		System.out.println("File3.getParent() : " + file3.getParent());
		System.out.println("File3.getPath() : " + file3.getPath());
		
		System.out.println("File1.isDirectory() : " + file1.isDirectory());
		System.out.println("File3.isDirectory() : " + file3.isDirectory());

		System.out.println("File1.isFile() : " + file1.isFile());
		System.out.println("File3.isFile() : " + file3.isFile());

		System.out.println("File3.isHidden() : " + file3.isHidden());
		System.out.println("File3.lastModified() : " + file3.lastModified());
		System.out.println("File3.length() : " + file3.length());
		file3.setReadOnly();
	}
}
