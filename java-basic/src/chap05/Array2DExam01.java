package chap05;
/*
 * 2���� �迭 ����
 * 1  2  3  4  5
 * 6  7  8  9  10
 * 11 12 13 14 15
 * 16 17 18 19 20
 * 21 22 23 24 25
 * 
 * *  2  3  4  5
 * 6  *  8  9  10
 * 11 12 *  14 15
 * 16 17 18 *  20
 * 21 22 23 24 * 
 */
public class Array2DExam01 {
	public static void main(String[] args) {
		//1. 2���� �迭�� ����
		int[][] arr = new int[5][5];
		//2. 2���� �迭�� ���� ����
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j] = i * 5 + j + 1;
			}
		}
		//3. 2���� �迭�� ����� ���� ���
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j] + "\t");
			}System.out.println();
		}
		System.out.println();
		
		//4. * ���
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i == j)
					System.out.print("*\t");
				else
					System.out.print(arr[i][j] + "\t");
			}System.out.println();
		}
	}
}
