package mobile;

public class MobileTest {
	
	public static void main(String[] args) {
		
		Mobile ltab = new Ltab("Ltab", 500, "AP-01");
		Mobile otab = new Otab("Otab", 1000, "AND-20");
		
		System.out.printf("%-15s %-15s %s%n", "Mobile", "Battery", "OS");
		System.out.println("---------------------------------------");
		System.out.printf("%-15s %-15d %s%n", ltab.getMobileName(), ltab.getBatterySize(), ltab.getOsType());
		System.out.printf("%-15s %-15d %s%n", otab.getMobileName(), otab.getBatterySize(), otab.getOsType());
				
		System.out.println("10분 충전");
		ltab.setBatterySize(ltab.charge(10));
		otab.setBatterySize(otab.charge(10));
		System.out.printf("%-15s %-15s %s%n", "Mobile", "Battery", "OS");
		System.out.println("---------------------------------------");
		System.out.printf("%-15s %-15d %s%n", ltab.getMobileName(), ltab.getBatterySize(), ltab.getOsType());
		System.out.printf("%-15s %-15d %s%n", otab.getMobileName(), otab.getBatterySize(), otab.getOsType());
		
		System.out.println("5분 통화");
		ltab.setBatterySize(ltab.operate(5));
		otab.setBatterySize(otab.operate(5));
		System.out.printf("%-15s %-15s %s%n", "Mobile", "Battery", "OS");
		System.out.println("---------------------------------------");
		System.out.printf("%-15s %-15d %s%n", ltab.getMobileName(), ltab.getBatterySize(), ltab.getOsType());
		System.out.printf("%-15s %-15d %s%n", otab.getMobileName(), otab.getBatterySize(), otab.getOsType());
		
	}

}
