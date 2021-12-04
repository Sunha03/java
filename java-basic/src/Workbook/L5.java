package Workbook;

public class L5 extends Car implements Temp {

	public L5() {
		
	}
	
	public L5(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}
	
	@Override
	public int getTempGage() {			//엔진 온도 측정
		return getDistance() / 5;
	}

	@Override
	public void go(int distance) {		//주행
		setDistance(getDistance() + distance);
		setOilSize(getOilSize() - distance / 8);
	}

	@Override
	public void setOil(int oilSize) {	//Oil 충전
		setOilSize(getOilSize() + oilSize);
	}

}
