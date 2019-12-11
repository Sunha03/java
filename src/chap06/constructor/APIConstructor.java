package chap06.constructor;

import java.io.File;
import java.io.FileInputStream;

//API의 클래스에 정의된 생성자 메소드 확인하기
public class APIConstructor {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		byte[] data1 = {65, 66, 67, 68, 69};
		char[] data2 = {'a', 'b', 'c', 'd', 'e'};
		String str = new String();		//String str = "";
		String str1 = new String("java");
		String str2 = new String(data1);
		String str3 = new String(data1, 2, 2);
		String str4 = new String(data2);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 + " 의 길이 : " + str1.length());
		System.out.println(str2 + " 의 길이 : " + str2.length());
		System.out.println(str3 + " 의 길이 : " + str3.length());
		System.out.println(str4 + " 의 길이 : " + str4.length());
		
		
		File file = new File("test.txt");
		System.out.println(file.getName());
		
		FileInputStream fileInputStream = new FileInputStream("test.txt");
		System.out.println((char)fileInputStream.read());
	}

}