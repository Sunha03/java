package Workbook;

public class chap06_test04_Student2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double ageSum = 0, heightSum = 0, weightSum = 0;
		Student2[] st = new Student2[3];
		st[0] = new Student2("홍길동", 15, 171, 81);
		st[1] = new Student2("한사람", 13, 183, 72);
		st[2] = new Student2("임꺽정", 16, 175, 65);
		
		System.out.println("이름\t나이\t신장\t몸무게");
		for(int i=0;i<st.length;i++) {
			ageSum += st[i].age;
			heightSum += st[i].height;
			weightSum += st[i].weight;
			System.out.println(st[i].name + "\t" + st[i].age + "\t" + st[i].height + "\t" + st[i].weight);
		}
		System.out.println("나이의 평균 : " + Math.round((double)(ageSum / st.length) * 100d) / 100d);
		System.out.println("신장의 평균 : " + Math.round((double)(heightSum / st.length) * 100d) / 100d);
		System.out.println("몸무게의 평균 : " + Math.round((double)(weightSum / st.length) * 100d) / 100d);
	}

}
