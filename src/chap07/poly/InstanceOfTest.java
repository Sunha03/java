package chap07.poly;

/*
 * 객체의 타입을 검사하고 작업할 수 있다.
 * instanceof연산자 이용
 */
class AA {
	
}

interface IA {
	
}

public class InstanceOfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubA obj = new SubA();
		//obj가 SuperA타입이라면 if블록 실행
		//	   = SuperA의 하위인가?
		System.out.println("-----------------------------");
		if(obj instanceof SuperA) {
			System.out.println("SuperA타입이다.");
		}
		else {
			System.out.println("SuperA타입 아니다.");
		}
		
		System.out.println("-----------------------------");
		if(obj instanceof InterA) {
			System.out.println("InterA타입이다.");
		}
		else {
			System.out.println("InterA타입 아니다.");
		}
		
		System.out.println("-----------------------------");
		if(obj instanceof InterB) {
			System.out.println("SuperB타입이다.");
		}
		else {
			System.out.println("SuperB타입 아니다.");
		}
		
		System.out.println("-----------------------------");
		if(obj instanceof IA) {
			System.out.println("IA타입이다.");
		}
		else {
			System.out.println("IA타입 아니다.");
		}
	}

}
