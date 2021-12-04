package chap04;
//중첩if문 정의와 사용 
//모든 제어문은 중첩 가능 
import java.util.Scanner;

//Scanner 클래스(API)의 사용방법 
//=> 프로그램 실행 중간에 값을 입력받을 수 있는 기능들을 제공 
//Scanner로 점수를 입력 받아 90점 이상이면 '통과'를 출력하고 
//90점 미만이면 '제시함'을 클릭하세요.
public class ifTest03 {

	public static void main(String[] args) {
	
      Scanner key =new Scanner(System.in);
      System.out.println("숫자:");
      int jumsu = key.nextInt();
      
   
      System.out.println("응시횟수");
      int count = key.nextInt();
      if(jumsu>=90) {
    	  System.out.println("통과");
      }
      else {
    	  if(count>3) {
    		  System.out.println("처음부터 다시 시작...");
    	  }else {
    		  System.out.println("이 과목만 재시험..");
    	  }
                 
      }
	
	
	}

}
