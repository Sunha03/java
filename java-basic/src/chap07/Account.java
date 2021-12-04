package chap07;

public class Account {
	private String account;
	private int balance;
	private String ownerName;
	private double interestRate;
	
	//�⺻ ������
	public Account() {
		
	}
	
	//������
	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public Account(String account, String ownerName, int balance) {
		this.account = account;
		this.balance = balance;
		this.ownerName = ownerName;
	}
	
	public String getAccount() {
		return account;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setAccount(String account) {
		this.account = account;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double calculateInterest() {
		return balance * interestRate * 0.01;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) {
		balance -= money;
	}
	
	public void printBalance() {
		System.out.println("���� ���� : " + account + " ���� �ܾ� : " + balance);
	}
	
	public void printInterestRate() {
		System.out.println("���� : " + calculateInterest());
	}
}
