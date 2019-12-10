package Workbook;

public class Account {
	public String account;
	public int balance;
	public double interestRate;
	
	public void setAccount(String account) {
		this.account = account;
	}
	
	public String getAccount() {
		return account;
	}
	
	public int getBalance() {
		return balance;
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
		System.out.println("계좌 정보 : " + account + " 현재 잔액 : " + balance);
	}
	
	public void printInterestRate() {
		System.out.println("이자 : " + calculateInterest());
	}
}
