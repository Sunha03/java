package api.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		//FileTest01.java ���� copy �ϱ�
		//1. FileReader�� �а�, FileWriter�� ���
		//2. src/data/copy_result.txt�� ����
		//3. �ֿܼ� ���
		
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
