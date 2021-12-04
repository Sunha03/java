package Workbook;

import java.util.*;

public class chap05_test07_Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int sumPrice = 0;
		double sumDiscountPrice = 0;
		Book[] bookArray = new Book[3];
		for(int i=0;i<bookArray.length;i++) {
			bookArray[i] = new Book();
			
			System.out.println("책 이름, 가격, 할인율을 차례대로 입력해 주세요.");
			bookArray[i].setBookName(sc.next());
			
			int price = sc.nextInt();
			double discountPrice = sc.nextDouble();
			bookArray[i].setBookPrice(price);
			bookArray[i].setBookDiscountRate(discountPrice);
			
			sumPrice += price;
			sumDiscountPrice += bookArray[i].getDiscountBookPrice();
		}
		
		for(int i=0;i<bookArray.length;i++) {
			bookArray[i].print();
		}
		
		System.out.println("책 가격의 합 : " + sumPrice + "원");
		System.out.println("할인된 책 가격의 합 : " + sumDiscountPrice + "원");
	}

}
