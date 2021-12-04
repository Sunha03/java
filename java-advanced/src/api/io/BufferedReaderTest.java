package api.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//advancedJava ������Ʈ ������ ����� test.txt ���� �а�, �ֿܼ� ���
public class BufferedReaderTest {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			//1. ���� ����
			/*fr = new FileReader("src/data/test.txt");		//�⺻ ��Ʈ��
			br = new BufferedReader(fr);				//���� ��Ʈ��*/
			//BufferedReader�� ������Ʈ������ ���õ����Ϳ� ���� �Ұ�
			//> ���� �����͸� ���� �� �ִ� �⺻ ��Ʈ���� �����ؼ� �Ѱ���� ��
			br = new BufferedReader(new FileReader("src/api/io/FileTest01.java"));
			
			//2. ���� �׼���
			int count = 0;		//���� �ð�
			long start = System.nanoTime();
			
			while(true) {
				int data = br.read();
				
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
				if(br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
