package api.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) throws IOException {
		//File ����� �Ű������� ���޵� ������ ������ > �ش� ������ ���� �۾�
		//���� ��� > ���� ���� ���� + �۾�
		//1. ���� open
		//FileWriter fw = new FileWriter("src/data/output.txt");
		
		//write �޼ҵ尡 ȣ��� ������ ���Ͽ� ������ �߰� > append mode�� true
		FileWriter fw = new FileWriter("src/data/output2.txt", true);
		
		//2. ���� �׼���
		fw.write(97);		//int ������
		fw.write("���ڿ�����\n");
		fw.write("test\n");
		
		//3. ���� close
		if(fw != null)
			fw.close();
	}
}
