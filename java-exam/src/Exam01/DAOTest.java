package Exam01;

import java.util.Scanner;

public class DAOTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("******?????????ý???********");
		System.out.println("1. ????????");
		System.out.println("2. ????????");
		System.out.println("3. ????????");
		System.out.print("???ϴ? ?۾??? ?????ϼ???:");
		int choice  = key.nextInt();
		show(choice);
		
		/*long temp = (int)3.9;
		System.out.println(temp);
		temp = temp%2;
		System.out.println(temp);*/
	}
	public static void show(int choice){
		MenuUI ui = new MenuUI();
		switch(choice){
			case 1:
				ui.insertMenu();
				break;
			case 2:
				ui.updateMenu();
				break;
			case 3:
				ui.deleteMenu();
				break;
		}
	}
}
