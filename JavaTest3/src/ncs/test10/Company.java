package ncs.test10;

public class Company {

	public static void main(String[] args) {

		Employee[] employees = new Employee[2];

		employees[0] = new Secretary("Hilery", 1, "secretary", 800);
		employees[1] = new Sales("Clinten", 1, "sales", 1200);

		System.out.printf("%-10s%-10s%7s%n", "name", "department", "salary");
		System.out.println("------------------------------");
		
		for (Employee e : employees)
			System.out.printf("%-10s%-10s%7s%n", e.getName(), e.getDepartment(), e.getSalary());

		System.out.println("\n인센티브 100 지급");

		System.out.printf("%-10s%-10s%7s%7s%n", "name", "department", "salary", "tax");
		System.out.println("----------------------------------");
		
		
		for (Employee e : employees) {
			//반복할 때 마다 타입확인하고 다운캐스팅하고 값지정
			if (e instanceof Secretary) {
				Secretary sec = (Secretary) e;
				sec.incentive(100);
				System.out.printf("%-10s%-10s%7s%7s%n", e.getName(), e.getDepartment(), e.getSalary(), e.tax());
			} else if (e instanceof Sales) {
				Sales sales = (Sales) e;
				sales.incentive(100);
				System.out.printf("%-10s%-10s%7s%7s%n", e.getName(), e.getDepartment(), e.getSalary(), e.tax());
			}
		}
	}

}
