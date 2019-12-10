package chap06;
// MyMethod클래스에서 정의한 메소드를 사용하는 클래스
// 데이터를 private으로 설정했기 때문에, 메소드를 이용하여 데이터를 엑세스하기 위해서 메소드를 생성하였다.
public class MyMethodTest {
	public static void main(String[] args) {
		System.out.println("**********프로그램시작**********");
		MyMethod m = new MyMethod();
		//1. 매개변수가 없고 void인 메소드의 호출
		m.display();
		System.out.println("++++++++++step1+++++++++");
		m.display();
		System.out.println("++++++++++step2+++++++++");
		m.display();
		
		//2. 매개변수가 한 개, 리턴값이 없는 메소드의 호출
		m.display("♬");
		m.display("☎");
		m.display("★");
		
		//3. 매개변수가 두 개, 리턴값이 없는 메소드의 호출
		m.display("▲", 3);
		m.display("◐", 9);
		m.display("㉿", 15); //display(String, int) - 이와 같은 유형의 display를 찾는 것이다.
		System.out.println("**********프로그램종료**********");
		
		//4. 매개변수와 리턴값이 있는 메소드의 호출
		//메소드를 호출하는 경우, 리턴값이 존재하는 메소드라면 
		// ① 리턴값과 동일한 타입의 변수를 선언해서 저장해 주어야 한다!!
		// ② 메소드의 매개변수로 전달할 수 있다.
		
		int result = m.add(100, 200);
		System.out.println("메소드 호출 결과=>"+result); // ①
		System.out.println("메소드 호출 결과=>"+m.add(200,300)); // ② 다른 메소드안의 매개변수가 되었다.
	}
}
