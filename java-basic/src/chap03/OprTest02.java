package chap03;

public class OprTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 100;
		int num2 = 200;
		int num3 = 100;
		//num1 변수가 +연산자 때문에
		//앞의 문자열의 영향을 받아서 문자열화 되었기 때문에 오류 발생 -> 비교연산, 사칙연산 등을 할 수 없다
		System.out.println("더한 결과 =>" +(num1+num2));
		System.out.println("num1>num2=="+(num1>num2));
		System.out.println("num1>=num2=="+(num1>=num2));
		System.out.println("num1<num2=="+(num1<num2));
		System.out.println("num1<=num2=="+(num1<=num2));
		
	
	}

}
