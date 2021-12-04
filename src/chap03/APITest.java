package chap03; //chae03 폴더를 작성하고 이 안에 API.class를 생성한다.
//기본으로 인식하는 패키지는 java.lang패키지 기본적으로 인식하므로 다른 패키지에 존재하는 클래스를 사용하는 경우 어떤 패키지에 있는지 인식시키는 작업을 해야 한다.
import java.io.File;
import java.util.ArrayList;
import java.util.Random; //Random 클래스만 인식 시키기 

//API 사용하기 - 참조형 변수 선언 
public class APITest {

	public static void main(String[] args) {
		// 1. API에서 제공하는 클래스를 자바 프로그램안에서 사용하기 위해  메모리에 올리는 작업 
           String str = new String();
           StringBuffer sb = new StringBuffer();
           File file = new File("test.txt");
           new Random();
           
           ArrayList list = new ArrayList();
           //ctrl shift o 를 눌러 자동 import
           //ArrayList = new ArrayList();
           // 올리는 작업 - JVM이 인식하는 작업 공간에 할당 
           //사용명클래스명 변수 = new 사용명 클래스 명()
           //-----
           // 타입으로 사용된다. 
           // 객체의 메소드 사용하기 위해 메모리에 올려놓은 것의 메소드 사용하기 
           String str2 = new String("java programming");

           char returval = str2.charAt(0); 
           System.out.println("실행결과 =>" +returval);
           //i love you 라는 문자열을 이용해서 String 객체를 생성하고 
           //이 문자열의 길이를 다음과 같은 형식으로 클릭하세요
           //[출력안내]
           //문자열의 길이 =>____
           String str3 = new String(" I Love you");
           int returval2 = str3.length();
           System.out.println("실행결과=>" +returval2);
           //Str3.length())
           
           
           
           
           
           
           //Random 클래스를 이용해서 작업
	       //- nextint 메소드 호출해서 랜덤값을 출력 
	       
	       //[출력형태]
	
	
	
	
	
	}
	
	
	
	

}
