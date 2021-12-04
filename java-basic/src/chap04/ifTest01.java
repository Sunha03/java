package chap04;

import java.util.Random;
import java.util.Scanner;

public class ifTest01 {
	//if문과 random클래스 연습 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Random의 nextInt를 이용해서 1부터 100까지의 값을 발생시킨 후 작업 
		Random numb = new Random();
		
        int num = numb.nextInt(100);
        if(num>=90) {
        	System.out.println("만족");
        System.out.println("두 번째 만족");
        }
        System.out.println("종료");
        
        
        
        
        Scanner key =new Scanner(System.in);
        System.out.println("문자열을 입력하세요:");
         String data =key.next();
        System.out.println("키보드로 입력받은 문자열:"+data);
        System.out.print("숫자를 입력하세요:");
        int intVal = key.nextInt();
        System.out.println("입력받은 숫자=>"+intVal);
	}

}
