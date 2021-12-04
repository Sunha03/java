package chap06.constructor;

public class MyConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기본 생성자를 호출해서 객체를 생성한 후 setter 메소드를 이용해서 값 초기화하기
		/*MyConstructor obj = new MyConstructor();
		obj.setName("장동건");
		obj.setId("jang");
		obj.setPass("1234");*/
		
		//매개변수가 3개 있는 생성자 메소드를 호출하면서 값을 초기화하기
		//MyConstructor(String, String, String) 호출 됨
		MyConstructor obj = new MyConstructor("Kim", "k1357", "P");
		
		System.out.println(obj.getName() + ", " + obj.getId() + ", " + obj.getPass());
		
		//매개변수가 4개 있는 생성자 메소드를 호출하면서 값을 초기화하기
		//MyConstructor(String, String, String, String) 호출 됨
		MyConstructor obj3 = new MyConstructor("Kim", "k1357", "P", "Candy");
		
		System.out.println(obj3.getName() + ", " + obj3.getId() + ", " + obj3.getPass() 
							+ ", " + obj3.getNickname());
		
		//매개변수가 6개 있는 생성자 메소드를 호출하면서 값을 초기화하기
		//MyConstructor(String, String, String, String) 호출 됨
		MyConstructor obj4 = new MyConstructor("Kim", "k1357", "P", "Candy", "Seoul", 1000);
		
		System.out.println(obj4.getName() + ", " + obj4.getId() + ", " + obj4.getPass() 
									+ ", " + obj4.getNickname() + ", " + obj4.getPoint());
	}

}
