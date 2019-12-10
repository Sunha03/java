package chap05;

//지역변수 : { } 안에서 선언된 변수
//		  선언된 블럭이 종료되면 메모리에서 해제
//		 1) 선언된 블럭 내부에서만 사용이 가능
//		 2) 반드시 초기화 작업을 해야 함
public class LocalVariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 90;
		int sum;
		if(num >= 90) {
			String str = new String("합격");
			//sum += 100;		//sum 변수는 main 메소드 블록에서 선언된 지역변수이므로
								//초기화 작업을 하지 않고 사용할 수 없음
		}
		//System.out.println(str);	//str변수는 if 블록에서 선언되었으므로
									//if 블록 밖에서는 접근할 수 없음
	}

}
