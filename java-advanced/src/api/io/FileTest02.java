package api.io;

import java.io.File;
import java.text.SimpleDateFormat;

//������ ���θ� Ž��
public class FileTest02 {
	public static void main(String[] args) {
		//c:\iot\iotest ������ ���� ����/���� ���
		//[�������]
		//a -----------------[����]
		//b -----------------[����]
		//ArrayTest01.java ------------[���� : (���� ������)]
		//.
		//.
		//.
		
		//������ ������ ��¥(��/��/��)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		
		File file = new File("c:/iot/iotest");
		File[] files = file.listFiles();
		for(int i=0;i<files.length;i++) {
			System.out.print(files[i].getName() + " ------------ ");
			if(files[i].isDirectory())
				System.out.println("[����]");
			else if(files[i].isFile())
				System.out.print("[���� : " + files[i].length() + "] ");
			System.out.println("������ ����(" + sdf.format(files[i].lastModified()) + ")");
		}
		
	}
}
