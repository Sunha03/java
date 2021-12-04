package chap07;

public class Teacher extends Person {
	private String subject;
	public Teacher() {
		
	}
	
	public Teacher(String name, int age, String subject) {
		super(name, age);
		/*this.name = name;
		this.age = age;*/
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void print() {
		super.print();		//�θ� Ŭ������ Person Ŭ������ print �޼ҵ� ȣ��
		System.out.println(", ���� : " + getSubject());
	}
}