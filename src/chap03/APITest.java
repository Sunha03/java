package chap03; //chae03 ������ �ۼ��ϰ� �� �ȿ� API.class�� �����Ѵ�.
//�⺻���� �ν��ϴ� ��Ű���� java.lang��Ű�� �⺻������ �ν��ϹǷ� �ٸ� ��Ű���� �����ϴ� Ŭ������ ����ϴ� ��� � ��Ű���� �ִ��� �νĽ�Ű�� �۾��� �ؾ� �Ѵ�.
import java.io.File;
import java.util.ArrayList;
import java.util.Random; //Random Ŭ������ �ν� ��Ű�� 

//API ����ϱ� - ������ ���� ���� 
public class APITest {

	public static void main(String[] args) {
		// 1. API���� �����ϴ� Ŭ������ �ڹ� ���α׷��ȿ��� ����ϱ� ����  �޸𸮿� �ø��� �۾� 
           String str = new String();
           StringBuffer sb = new StringBuffer();
           File file = new File("test.txt");
           new Random();
           
           ArrayList list = new ArrayList();
           //ctrl shift o �� ���� �ڵ� import
           //ArrayList = new ArrayList();
           // �ø��� �۾� - JVM�� �ν��ϴ� �۾� ������ �Ҵ� 
           //����Ŭ������ ���� = new ���� Ŭ���� ��()
           //-----
           // Ÿ������ ���ȴ�. 
           // ��ü�� �޼ҵ� ����ϱ� ���� �޸𸮿� �÷����� ���� �޼ҵ� ����ϱ� 
           String str2 = new String("java programming");

           char returval = str2.charAt(0); 
           System.out.println("������ =>" +returval);
           //i love you ��� ���ڿ��� �̿��ؼ� String ��ü�� �����ϰ� 
           //�� ���ڿ��� ���̸� ������ ���� �������� Ŭ���ϼ���
           //[��¾ȳ�]
           //���ڿ��� ���� =>____
           String str3 = new String(" I Love you");
           int returval2 = str3.length();
           System.out.println("������=>" +returval2);
           //Str3.length())
           
           
           
           
           
           
           //Random Ŭ������ �̿��ؼ� �۾�
	       //- nextint �޼ҵ� ȣ���ؼ� �������� ��� 
	       
	       //[�������]
	
	
	
	
	
	}
	
	
	
	

}
