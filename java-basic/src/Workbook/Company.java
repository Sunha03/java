package Workbook;

public class Company {
	public double salary;
	public double annualIncome;
	public double afterTaxAnnualIncome;
	public double bonus;
	public double afterTaxBonus;
	
	public Company() {
		
	}
	
	public Company(double salary) {
		this.salary = salary;
	}
	
	public double getIncome() {
		annualIncome = 12 * salary;
		return annualIncome;
	}
	
	public double getAfterTaxIncome() {
		afterTaxAnnualIncome = annualIncome* 0.9;
		return afterTaxAnnualIncome;
	}
	
	public double getBonus() {
		bonus = 4 * salary * 0.2;
		return bonus;
	}
	
	public double getAfterTaxBonus() {
		afterTaxBonus = bonus * 0.945;
		return afterTaxBonus;
	}
}
