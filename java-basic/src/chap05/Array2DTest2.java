package chap05;

public class Array2DTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2���� �迭���� �迭�� �����ϴ� �迭�� ��Ҹ� ���� �ٸ��� ������ �� �ִ�.
		int[][] myarr = new int[3][];
		myarr[0] = new int[3];
		myarr[1] = new int[2];
		myarr[2] = new int[1];
		
		for(int outer = 0;outer < myarr.length;outer++) {
			for(int i=0;i<myarr[outer].length;i++) {
				System.out.println(myarr[outer][i]);
			}
			System.out.println();
		}
	}

}
