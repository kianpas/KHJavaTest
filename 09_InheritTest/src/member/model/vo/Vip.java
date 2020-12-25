package member.model.vo;

public class Vip extends Member{
	
	public Vip() {

	}

	public Vip(String name, String grade, int point) {
		super(name, grade, point);
	
	}
	
	public double getInterPoint() {
		return  getPoint()*0.1;
	}

}
