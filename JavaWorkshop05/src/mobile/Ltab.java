package mobile;

public class Ltab extends Mobile{

	public Ltab() {
		
	}

	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	
	}

	@Override
	public int operate(int time) {
		int remainBattery = getBatterySize() - (time * 10);
		return  remainBattery;
	}

	@Override
	public int charge(int time) {
		int chargeBattery = getBatterySize() + (time * 10);
		return chargeBattery;
	}

	@Override
	public String getMobileName() {
		// TODO Auto-generated method stub
		return super.getMobileName();
	}

	@Override
	public void setMobileName(String mobileName) {
		// TODO Auto-generated method stub
		super.setMobileName(mobileName);
	}

	@Override
	public int getBatterySize() {
		// TODO Auto-generated method stub
		return super.getBatterySize();
	}

	@Override
	public void setBatterySize(int batterySize) {
		// TODO Auto-generated method stub
		super.setBatterySize(batterySize);
	}

	@Override
	public String getOsType() {
		// TODO Auto-generated method stub
		return super.getOsType();
	}

	@Override
	public void setOsType(String osType) {
		// TODO Auto-generated method stub
		super.setOsType(osType);
	}

	
	
	
}
