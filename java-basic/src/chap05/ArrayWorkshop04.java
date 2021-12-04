package chap05;

//본교재 p196 예제5-5
public class ArrayWorkshop04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int[] score = {100, 88, 100, 100, 90};
		for(int i=0;i<score.length;i++) {
			sum += score[i];
		}
		
		System.out.println("sum = " + sum);
		System.out.println("avg = " + (double)sum / score.length);
	}

}
