package chap07;

public class CheckingAccount extends Account {
	private String cardNo;
	
	public CheckingAccount() {
		
	}
	
	public CheckingAccount(String account, String ownerName, int balance, String cardNo) {
		super(account, ownerName, balance);
		this.cardNo = cardNo;
	}
	
	public void pay(int amount, String cardNo) {
		int b = getBalance();
		//문자열 비교는 무조건 equals 사용, == (X)
		//if(this.cardNo == cardNo && b >= amount) {		//(X) > '==' : 주소 값 비교
		//if(this.cardNo.compareTo(cardNo) == 0 && b >= amount) {		//(O)
		if(this.cardNo.equals(cardNo) && b >= amount) {		//(O)
			setBalance(b - amount);
		}
		else {
			System.out.println("지불이 불가능합니다.");
		}
	}
}
