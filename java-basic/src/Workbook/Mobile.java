package Workbook;

public class Mobile {
	private String mobileName;
	private int batterySize;
	private String osType;
	
	public Mobile() {
		
	}
	
	public Mobile(String mobileName, int batterySize, String osType) {
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	
	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public int operate(int time) {
		batterySize -= time * 10;
		return batterySize;
	}
	
	public int charge(int time) {
		batterySize += time * 10;
		return batterySize;
	}
	
	public void print() {
		System.out.println(mobileName + "\t" + batterySize + "\t" + osType);
	}
}
