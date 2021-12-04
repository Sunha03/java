package chap07;

/*
 * < ��� ���迡�� �����ڰ� ���� Ư¡ >
 * 1. Ŭ������ ��� ������ �޼ҵ��� ù ��° ���忡�� �θ� Ŭ������ �⺻ �����ڸ� ȣ���ϴ� ��ɹ��� �����Ǿ� ����
 * 	  > �θ� Ŭ������ �޸𸮿� �Ҵ�Ǿ�� ����� �� �����Ƿ� 
 *    > �θ��� �����ڸ� ȣ���ϴ� ����� super(...)
 *      super()�� �θ��� �Ű����� ���� �⺻ ������
 *    > �̹� �ٸ� �����ڸ� ȣ���ϴ� ��쿡�� super()�� �� �� ����
 *      this()�� ȣ���ϴ� ��� super()�� ȣ���� �� ����
 * 2. ��� Ŭ������ �ֻ��� Ŭ������ java.lang.Object Ŭ������
 * 	  > �ڹٿ��� ����Ǵ� ��� ��ü�� ���� ������ Ư¡�� ������ Ŭ������ ��� �ް� �ִ� Ŭ������ ���� ��� �����Ϸ��� �ڵ����� ����ϵ��� ��
 * 3. �θ� Ŭ������ ���ǵǾ� �ִ� ��������� ���� �����ؾ� �ϴ� ��쿡�� ���� Ŭ�������� ���޵� �� �ֵ��� ������
 * 	    ���� Ŭ�������� ���޵� �� �ֵ��� ������
 *    super(��1, ��2, ...)�� ���� ������
 *    > �θ��� �Ű������� �ִ� �����ڸ� ȣ���ϴ� ���
 */

class SuperA /*java.lang.Object*/ {
	String name;
	int age;
	
	SuperA() {
		//super();		//�����Ǿ� ����
	}
	
	SuperA(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}

class SubA extends SuperA {
	String addr;
	int point;
	
	SubA() {
		//super();			//��� ������ �޼ҵ��� ù ��° ���忡�� super() ȣ��
	}
	
	SubA(String addr) {
		//super();
		this.addr = addr;
	}
	
	SubA(String name, int age, String addr, int point) {
		//super();			//(X)
		//this(addr);			//�̹� ���ǵǾ� �ִ� �Ǵٸ� �����ڸ� ȣ��
		/*this.name = name;
		this.age = age;*/
		super(name, age);		//�θ��� �Ű����� 2�� �����ڸ� ȣ�� : SuperA(String, int)
		this.addr = addr;
		this.point = point;
	}
}

public class IngeritanceTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubA obj = new SubA("Jang", 35, "Seoul", 1000);
		System.out.println(obj.name + ", " + obj.addr + ", " + obj.age + ", " + obj.point);
	}

}
