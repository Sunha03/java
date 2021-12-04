package chap05;

//况农合 p14 7锅 巩力
public class ArrayWorkshop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0;i<=100;i++) {
			if(i % Integer.parseInt(args[0]) == 0)
				sum += i;
		}
		
		System.out.println("args : " + args[0]);
		System.out.println("sum = " + sum);
	}

}
