package chap06.constructor;

//생성자 연습
public class MyConstructor {
	private String name;
	private String id;
	private String pass;
	private String nickname;
	private String addr;
	private int point;
	
	public  MyConstructor() {
		System.out.println("기본 생성자");
	}
	
	//로그인용
	public  MyConstructor(String name, String id, String pass) {
		System.out.println("매개변수 3개 있는 생성자");
		//멤버변수(=인스턴스 변수, 객체 변수) 초기화하는 작업
		this.name = name;
		this.id = id;
		this.pass = pass;
	}
	
	//수정용
	public  MyConstructor(String name, String id, String pass, String nickname) {
		/*this.name = name;
		this.id = id;
		this.pass = pass;*/
		this(name, id, pass);		//기존의 매개변수 3개 생성자를 호출
		this.nickname = nickname;
		
		System.out.println("매개변수 4개 있는 생성자");
	}
	
	//조회용
	public  MyConstructor(String name, String id, String pass, String nickname, String addr) {
		/*this.name = name;
		this.id = id;
		this.pass = pass;
		this.nickname = nickname;*/
		this(name, id, pass, nickname);
		this.addr = addr;

		System.out.println("매개변수 5개 있는 생성자");
	}
	
	//삽입용
	public  MyConstructor(String name, String id, String pass, String nickname, String addr, int point) {
		/*this.name = name;
		this.id = id;
		this.pass = pass;
		this.nickname = nickname;
		this.addr = addr;*/
		this(name, id, pass, nickname, addr);
		this.point = point;
		
		System.out.println("매개변수 6개 있는 생성자");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
}
