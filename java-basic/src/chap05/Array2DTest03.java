package chap05;

//2���� �迭�� ����� ������ �ʱ�ȭ
public class Array2DTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] myarr = {
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15}
		};		// = int[][] myarr = new int[3][5];
		
		int[][] myarr2 = {
				{1, 2, 3},
				{6, 7, 8, 9},
				{11, 12, 13, 14, 15}
		};		// = int[][] myarr2 = new int [3][];
		
		//myarr�� myarr2�� �迭�� �迭�� ����� ���� ����ϱ�
		for(int i=0;i<myarr.length;i++) {
			for(int j=0;j<myarr[i].length;j++) {
				System.out.print(myarr[i][j] + " ");
			}System.out.println();
		}
		
		for(int i=0;i<myarr2.length;i++) {
			for(int j=0;j<myarr2[i].length;j++) {
				System.out.print(myarr2[i][j] + " ");
			}System.out.println();
		}
		
		
	}

}
