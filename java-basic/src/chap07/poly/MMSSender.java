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
		//MMSSender에서만 처리되는 고유한 기능 처리
		System.out.println(length + "로 " + name + "전송완료");
	}
}
