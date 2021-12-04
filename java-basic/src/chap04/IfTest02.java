package chap04;

import java.util.Scanner;
//If else문과 Scanner 
//Scanner 클래스(API)의 사용방법 
//=> 프로그램 실행 중간에 값을 입력받을 수 있는 기능들을 제공 
//Scanner로 점수를 입력 받아 90점 이상이면 '통과'를 출력하고 
//90점 미만이면 '제시함'을 클릭하세요.
public class IfTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner key =new Scanner(System.in);
   
     
      int intVal = key.nextInt();
      if(intVal>=90) {
    	  System.out.println("통과");
      }
      else {
    	  System.out.println("재시험");
      }
	
	
	}

}
