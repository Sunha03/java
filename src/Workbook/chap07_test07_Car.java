package Workbook;

public class chap07_test07_Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] car = new Car[2];
		car[0] = new L3("L3", "1500", 50, 25, 0);
		car[1] = new L5("L5", "2000", 75, 35, 0);
		
		System.out.println("vehicleName\tengineSize\toilTank\toilSize\tdistance\ttemperature");
		for(int i=0;i<car.length;i++) {
			System.out.print(car[i].getName() + "\t\t" + car[i].getEngine() + "\t\t" 
		+ car[i].getOilTank() + "\t" + car[i].getOilSize() + "\t" + car[i].getDistance() + "\t\t");
			if(car[i] instanceof L3)
				System.out.println(((L3)car[i]).getTempGage());
			else if(car[i] instanceof L5)
				System.out.println(((L5)car[i]).getTempGage());
		}
		
		System.out.println("vehicleName\tengineSize\toilTank\toilSize\tdistance\ttemperature");
		for(int i=0;i<car.length;i++) {
			car[i].setOil(25);
			
			System.out.print(car[i].getName() + "\t\t" + car[i].getEngine() + "\t\t" 
					+ car[i].getOilTank() + "\t" + car[i].getOilSize() + "\t" + car[i].getDistance() + "\t\t");
						if(car[i] instanceof L3)
							System.out.println(((L3)car[i]).getTempGage());
						else if(car[i] instanceof L5)
							System.out.println(((L5)car[i]).getTempGage());
		}
		
		System.out.println("vehicleName\tengineSize\toilTank\toilSize\tdistance\ttemperature");
		for(int i=0;i<car.length;i++) {
			car[i].go(80);
			
			System.out.print(car[i].getName() + "\t\t" + car[i].getEngine() + "\t\t" 
					+ car[i].getOilTank() + "\t" + car[i].getOilSize() + "\t" + car[i].getDistance() + "\t\t");
						if(car[i] instanceof L3)
							System.out.println(((L3)car[i]).getTempGage());
						else if(car[i] instanceof L5)
							System.out.println(((L5)car[i]).getTempGage());
		}
		
	}

}
