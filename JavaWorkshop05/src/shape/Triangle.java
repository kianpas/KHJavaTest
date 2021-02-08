package shape;

public class Triangle extends Shape implements Resize{

	public Triangle() {
		
	}

	public Triangle(int width, int height, String colors) {
		super(width, height, colors);
	
	}

	
	@Override
	public void setResize(int size) {
		setHeight(getHeight() + size);
		
	}

	@Override
	public double getArea() {
		double area  = (getWidth() * getHeight())/2; 
		return area;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return super.getWidth();
	}

	@Override
	public void setWidth(int width) {
		// TODO Auto-generated method stub
		super.setWidth(width);
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return super.getHeight();
	}

	@Override
	public void setHeight(int height) {
		// TODO Auto-generated method stub
		super.setHeight(height);
	}

	@Override
	public String getColors() {
		// TODO Auto-generated method stub
		return super.getColors();
	}

	@Override
	public void setColors(String colors) {
		// TODO Auto-generated method stub
		super.setColors(colors);
	}

	@Override
	public String toString() {
		return "Triangle   " + getArea() + "   " + getColors();
	}

	
	
	
}
