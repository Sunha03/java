package Workbook;

public class Otab extends Mobile {
	public Otab() {
		
	}
	
	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	
	public int operate(int time) {
		int battery = getBatterySize();
		battery -= time * 12;
		setBatterySize(battery);
		return battery;
	}
	
	public int charge(int time) {
		int battery = getBatterySize();
		battery += time * 8;
		setBatterySize(battery);
		return battery;
	}
}
