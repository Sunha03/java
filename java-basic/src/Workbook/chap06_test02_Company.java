package Workbook;

public class chap06_test02_Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company cp = new Company(100);
		System.out.println("�� �⺻�� �� : " + cp.getIncome() + " ���� : " + cp.getAfterTaxIncome());
		System.out.println("�� ���ʽ� �� : " + cp.getBonus() + " ���� : " + cp.getAfterTaxBonus());
		System.out.println("�� ���޾� �� : " + (cp.getAfterTaxIncome() + cp.getAfterTaxBonus()));
	}

}
