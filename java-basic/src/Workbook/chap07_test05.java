package Workbook;

public class chap07_test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ltab ltab = new Ltab("Ltab", 500, "AP-01");
		Otab otab = new Otab("Otab", 1000, "AND-20");
		
		System.out.println("Mobile\tBattery\tOS");
		System.out.println("===================================");
		ltab.print();
		otab.print();
		
		System.out.println("10분 충전");
		ltab.charge(10);
		otab.charge(10);
		
		System.out.println("Mobile\tBattery\tOS");
		System.out.println("===================================");
		ltab.print();
		otab.print();
		
		System.out.println("5분 통화");
		ltab.operate(5);
		otab.operate(5);
		
		System.out.println("Mobile\tBattery\tOS");
		System.out.println("===================================");
		ltab.print();
		otab.print();
	}

}
