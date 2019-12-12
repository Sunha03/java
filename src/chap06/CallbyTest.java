package chap06;

//메소드의 매개변수로 기본형과 참조형을 정의하는 경우 차이점
public class CallbyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사용할 기본형 변수와 참조형 변수의 초기화
		CallbyTest obj = new CallbyTest();
		
		int i = 100;
		int[] myarr = new int[5];
		for (int j = 0; j < myarr.length; j++) {
			myarr[j] = 100;
		}
		System.out.println("-------------- 변경 전 -------------");
		obj.display(i, myarr);
		obj.change(i, myarr);
		
		System.out.println("-------------- 변경 후 -------------");
		obj.display(i, myarr);
	}
	
	//매개변수로 전달된 num의 값과 myarr가 참조한느 배열의 요소값을 출력하는 메소드
	public void display(int num, int[] myarr) {
		System.out.println("i = " + num);
		System.out.println("myarr의 요소 값");
		for (int i = 0; i < myarr.length; i++) {
			System.out.println("myarr[" + i + "] : " + myarr[i]);
		}
	}

	//매개변수로 전달된 i와 myarr가 참조하는 배열의 요소 값을 변경하는 메소드
	public void change(int a, int[] myarr) {
		a = 200;
		myarr[1] = 200;
	}
}
