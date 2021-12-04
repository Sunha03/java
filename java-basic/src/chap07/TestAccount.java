package chap07;

import java.util.*;

public class TestAccount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CheckingAccount acc1 = 
			new CheckingAccount("111-222-333","장동건"
					,1000000,"1234-5647-8888");
		acc1.pay(500000, "1234-5678-8888");
		System.out.println("현재잔액====>"+acc1.getBalance());
		
		String cardNo = sc.next();
		acc1.pay(500000, cardNo);			//"1234-5647-8888"
		System.out.println("현재잔액====>"+acc1.getBalance());
		
	}
	
}
