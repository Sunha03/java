package Workbook;

public class Student {
	public String name;
	public int korean;
	public int english;
	public int math;
	public int science;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setKorean(int korean) {
		this.korean = korean;
	}
	
	public int getKorean() {
		return korean;
	}
	
	public void setEnglish(int english) {
		this.english = english;
	}
	
	public int getEnglish() {
		return english;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	public int getMath() {
		return math;
	}
	public void setScience(int science) {
		this.science = science;
	}
	
	public int getScience() {
		return science;
	}
	
	public double getAvg() {
		double avg = (double)(korean + english + math + science) / 4;
		return avg;
	}
	
	public String getGrade() {
		//double avg = (double)(korean + english + math + science) / 4;
		double avg = getAvg();
		if(avg >= 90 && avg <= 100)
			return "A";
		else if(avg > 70 && avg <= 90)
			return "B";
		else if(avg > 50 && avg <= 70)
			return "C";
		else if(avg > 30 && avg <= 50)
			return "D";
		else
			return "F";
	}
	
	public void print() {
		System.out.println(getName() + " 평균 : " + getAvg() + " 학점 : " + getGrade() + "학점");
	}
}
