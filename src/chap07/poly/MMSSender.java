package chap07.poly;
public class MMSSender extends Sender {
	int length;
	
	public MMSSender(String name,int length){
		super(name);
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void print() {
		//MMSSender������ ó���Ǵ� ������ ��� ó��
		System.out.println(length + "�� " + name + "���ۿϷ�");
	}
}
