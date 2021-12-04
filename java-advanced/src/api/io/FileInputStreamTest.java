package api.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//advancedJava ������Ʈ ������ ����� test.txt ���� �а�, �ֿܼ� ���
public class FileInputStreamTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			//1. ���� ����
			fis = new FileInputStream("src/data/test.txt");
			//2. ���� �׼���
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
				//3. ���� �ݱ�
				if(fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}