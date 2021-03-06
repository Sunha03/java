package chap05;

//2차원배열 작성 연습
public class Array2DTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2차원 배열의 선언과 생성
		int[][] myarr = new int[2][3];
		//2차원배열의 초기화
		myarr[0][0] = 100;
		myarr[1][1] = 200;
		//myarr[2][2] = 300;		//Exception 발생
	
		System.out.println("myarr의 2번째 요소가 참조하는 배열의 0번 요소의 값 : " + myarr[1][0]);
		System.out.println("myarr의 1번째 요소가 참조하는 배열의 0번 요소의 값 : " + myarr[0][0]);
		
		//다차원 배열의 요소의 개수
		System.out.println("배열의 개수 => " + myarr.length);
		System.out.println("myarr의 1번 요소가 참조하는 배열의 요소의 개수 => " + myarr[0].length);
		System.out.println("myarr의 2번 요소가 참조하는 배열의 요소의 개수 => " + myarr[1].length);
		//전체 배열의 요소를 액세스 하기
		for(int outer=0;outer<2;outer++) {
			for(int i=0;i<3;i++) {
				System.out.println(myarr[outer][i]);
			}
		}
		//전체 배열의 요소를 액세스 하기
		for(int outer=0;outer<myarr.length;outer++) {
			for(int i=0;i<myarr[outer].length;i++) {
				System.out.println(myarr[outer][i]);
			}
		}
	}

}
