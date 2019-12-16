package chap08;

import java.util.*;

//여러 개의 예외가 발생한는 경우 처리
//사용자가 입력하는 값에 따라 예외가 다르게 발생함
//1. 사용자가 제대로 값을 입력 : 예외가 발생되지 않으므로 catch 블록은 실행되지 않음
//2. 사용자가 나눌 숫자에 0을 입력
//   > ArithmeticException이 발생
//   > Exception e = new ArithmeticException();
//     > 상위타입                    > 하위 타입
//3. 사용자가 숫자가 아니라 문자를 입력 
//   > InputMismatchException 발생
//   > Exception e = new InputMismatchException();
// - 다양한 Exception의 처리를 위해 catch 블록을 여러 개 정의하고 사용할 수 있음
// - 상위 타입에 속하는 Exception은 가장 나중에 정의해야 함
public class ExceptionTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		try {
			System.out.println("start");
			System.out.print("숫자를 입력하세요");
			int num1 = key.nextInt();
			System.out.print("나눌 숫자를 입력하세요");
			int num2 = key.nextInt();
			System.out.println("결과 : " + (num1 / num2));		//예외 발생
		}
		catch(InputMismatchException e) {		//Exception에 속함
			System.out.print("문자를 입력할 수 없습니다.");
		}
		catch(ArithmeticException e) {		//Exception에 속함
			System.out.print("나눌 숫자에 0을 입력할 수 없습니다.");
		}
		catch(Exception e) {		//모든 예외클래스의 상위 클래스
			System.out.println("오류 발생!!");
			System.out.println("예외 메세지 : " + e.getMessage());
		}
	}

}
