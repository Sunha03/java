package chap06;
//Ŭ������ �����ϰ� ��������� �����ϴ� ���
// - ��������� ������ ���� Ư���� ��츦 �����ϰ� �ʱⰪ�� ���� �ʴ´�.
// - �ʱⰪ�� �������� �ʾƵ� �������� null, �������� 0, �Ǽ����� 0.0, boolean�� false
// - ��������� ������ �� ���� �����ڸ� �߰��ؼ� ������ ������ �� �ִ�.
// 		public 
// 		default
// 		protected
// 		private
// Ŭ������ �޼ҵ�� �ܺο��� ����ϴ� public���� �������ְ�, �Ϲ�Ŭ���������� ��������� �ܺο��� �������� ���ϵ��� private���� ����.
// ����(������)�� ���� ��������������, �޼ҵ带 ���� �������� �� �ֵ��� ���α׷��� �ۼ��ض�.
// Ŭ������ ������ �� ��������� private���� �����ؼ� �ܺο��� ������ �� ������ ������ �����ϰ� public�޼ҵ带 ���ؼ� ������ �� �ֵ��� ����.
public class Person { 
	public String name; // Ŭ������ Ư���� ��Ÿ���� ������, Ŭ���� ����� �ٷ� �Ʒ� => class�� ��ǥ�ϴ� ���� => ��� ����or�ʵ�
	public String addr; //(default) // Ư���� ��Ȳ�� �ƴϸ� �ʱⰪ�� ���� �ʴ´�!
	public int age; // �ڹٿ��� �� �� �ִ� ��� ������ Ÿ���� ��� �����ϴ�!
	
	// ��� ��������� private���� ����Ǿ� �ֱ� ������ ���� �����ϴ� �޼ҵ�� ���� ������ �� �̴� �޼ҵ尡 �ʿ��ϴ�.
	// �̷� ������ �ϴ� �޼ҵ带 �����ϴ� ���
	
	//�⺻ ������
	public Person() {
		//�ڵ�
	}
	
	public Person(String name, String addr, int age) {
		this.name = name;
		this.addr = addr;
		this.age = age;
	}

	// name ������ ���� �����ϴ� �޼ҵ�
	// - �޼ҵ�� : set + ���������(ù ���ڸ� �빮�ڷ� �ٲ�) -> return�� void
	//           setName
	public void setName(String name) {		//setter �޼ҵ�
		this.name = name;
	}
	
	//name ������ ����� ���� ȣ���ϴ� ������ �Ѱ��� �޼ҵ�
	//�޼ҵ�� : get + ���������(ù ���ڸ� �빮�ڷ� �ٲ�)
	//		  getName
	public String getName() {
		return name;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}
}
