package workshop5;

public class Company {

	private double salary;
	private double income;
	private double bonus;
	private double afterTaxIncome;
	private double afterTaxBonus;

	public Company() {

	}

	public Company(double salary) {
		this.salary = salary;

	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getIncome() {
		income = salary * 12;
		return income ;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public double getBouns() {
		bonus = salary * 0.2 * 4;
		return bonus;
	}

	public void setBouns(double bouns) {
		this.bonus = bouns;
	}

	public double getAfterTaxBonus() {
		afterTaxBonus = bonus - (bonus * 0.055);
		return afterTaxBonus;
	}

	public void setAfterTaxBonus(double afterTaxBonus) {
		this.afterTaxBonus = afterTaxBonus;
	}

	public double getAfterTaxIncome() {
		afterTaxIncome = income - (income * 0.1);
		return afterTaxIncome;
		
	}

	public void setAfterTaxIncome(double afterTaxIncome) {
		this.afterTaxIncome = afterTaxIncome;
	}
	
	
}
