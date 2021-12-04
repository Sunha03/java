package chap08;

public class ExceptionTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("********** 프로그램 시작 ************");
		try {
			System.out.println(10/0);			//예외 발생
		}
		catch(Exception e) {
			System.out.println("오류 발생!!");
			System.out.println("예외 메세지 : " + e.getMessage());
		}
		System.out.println("********** 프로그램 종료 ************");
	}

}
