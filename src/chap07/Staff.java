package chap07;

public class Staff extends Person {
	private String dept;
	
	public Staff() {
		
	}

	public Staff(String name, int age, String dept) {
		super(name, age);
		/*this.name = name;
		this.age = age;*/
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void print() {
		super.print();		//부모 클래스인 Person 클래스의 print 메소드 호출
		System.out.println(", 부서 : " + getDept());
	}
}
