package api.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//advancedJava ������Ʈ ������ ����� test.txt ���� �а�, �ֿܼ� ���
public class FileReaderTest {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			//1. ���� ����
			fr = new FileReader("src/api/io/FileTest01.java");
			
			//2. ���� �׼���
			int count = 0;		//���� �ð�
			long start = System.nanoTime();
			
			while(true) {
				int data = fr.read();
				
				if(data == -1)
					break;
				System.out.print((char)data);
				
				count++;
			}
			
			long end = System.nanoTime();
			System.out.println("���� Ƚ�� : " + count);
			System.out.println("���� �ð� : " + (end - start));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//3. ���� �ݱ�
				if(fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
