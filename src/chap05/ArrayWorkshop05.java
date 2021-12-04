package chap05;

//본교재 p197 예제5-6
public class ArrayWorkshop05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 1000, max = -1;
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		for(int i=0;i<score.length;i++) {
			if(min > score[i])
				min = score[i];
			if(max < score[i])
				max = score[i];
		}
		
		System.out.println("min = " + min);
		System.out.println("max = " + max);
	}

}
