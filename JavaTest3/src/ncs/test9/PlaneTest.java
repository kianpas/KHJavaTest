package ncs.test9;

public class PlaneTest {

	public static void main(String[] args) {

		Airplane ap = new Airplane("L747", 1000);
		Cargoplane cp = new Cargoplane("C40", 1000);
		System.out.println("Plane\tfuelSize\n-----------------");
		System.out.println(ap);
		System.out.println(cp);

		System.out.println("100운항");
		ap.flight(100);
		cp.flight(100);
		System.out.println("Plane\tfuelSize\n-----------------");
		System.out.println(ap);
		System.out.println(cp);
		ap.refuel(200);
		cp.refuel(200);
		System.out.println("200주유");
		System.out.println("Plane\tfuelSize\n-----------------");
		System.out.println(ap);
		System.out.println(cp);
	}
}
