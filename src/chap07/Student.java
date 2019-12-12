package chap07;

public class Student extends Person {
	public int korean;
	public int english;
	public int math;
	public int science;
	
	//기본 생성자
	public Student() {
		
	}
	
	//생성자
	/*public Student(String name, int korean, int english, int math, int science) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}*/
	
	public Student(String name, int korean, int english, int math, int science, int age) {
		super(name, age);		//부모의 private 멤버에 직접 액세스하지 않고 생성자 호출로 전달함
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
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
		super.print();		//부모 클래스인 Person 클래스의 print 메소드 호출
		System.out.println(" 평균 : " + getAvg() + " 학점 : " + getGrade() + "학점");
	}

}
