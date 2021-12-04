package Workbook;

public class chap05_test05 {
	public static int calcSum(int a, int b, int c, int d) {
		return a + b + c + d;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[4];
		for(int i=0;i<4;i++)
			score[i] = Integer.parseInt(args[i]);

		//합계 구하기
		int sum = calcSum(score[0], score[1], score[2], score[3]);
		double avg = (double) sum / 4;
		
		System.out.println("sum = " + sum);
		System.out.println("avg : " + avg);
		if(avg >= 90 && avg <= 100)
			System.out.println("A학점");
		else if(avg >= 70 && avg < 90)
			System.out.println("B학점");
		else if(avg >= 50 && avg < 70)
			System.out.println("C학점");
		else if(avg >= 30 && avg < 50)
			System.out.println("D학점");
		else
			System.out.println("F학점");
	}

}
