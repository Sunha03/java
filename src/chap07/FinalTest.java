package chap07;

final class FinalSuper {
	public void display() {
		System.out.println("super display");
	}
}

/*class FinalSub extends FinalSuper {		//final 클래스는 상속이 불가능
	static final int NUM = 100;		//static fianl 변수명은 대문자로

	@Override		//어노테이션에게 알려주기 위해
	public final void display() {
		System.out.println("display");
	}
	
}*/

public class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*FinalSub obj = new FinalSub();
		//obj.NUM = 1000;			//상수이므로 값 수정 불가
		System.out.println(FinalSub.NUM);
		//obj.display();			//final 메소드는 오버라이딩할 수 없음 */
	}

}
