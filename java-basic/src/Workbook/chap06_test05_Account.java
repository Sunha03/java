package Workbook;

public class chap06_test05_Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Account account = new Account();
		account.setAccount("441-0290-1203");
		account.setBalance(500000);
		account.setInterestRate(7.3);*/
		
		Account account = new Account("441-10290-1203", 500000, 7.3);
		
		//���� ��
		account.printBalance();
		
		//���� ��(20000�� �Ա�)
		account.deposit(20000);
		account.printBalance();
		account.printInterestRate();
	}

}
