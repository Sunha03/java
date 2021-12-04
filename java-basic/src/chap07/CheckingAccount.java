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
		//���ڿ� �񱳴� ������ equals ���, == (X)
		//if(this.cardNo == cardNo && b >= amount) {		//(X) > '==' : �ּ� �� ��
		//if(this.cardNo.compareTo(cardNo) == 0 && b >= amount) {		//(O)
		if(this.cardNo.equals(cardNo) && b >= amount) {		//(O)
			setBalance(b - amount);
		}
		else {
			System.out.println("������ �Ұ����մϴ�.");
		}
	}
}
