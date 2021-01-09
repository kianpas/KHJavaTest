package ncs.test4;

public class Product {
	
	private String name;
	private int price;
	private int quantity;
	
	
	public Product() {

	}

	public Product(String name, int price, int quantity) {

		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String infomation() {
		String info = "상품명 : " + name + "\n가격 : " + price + " 원\n" + "수량 : " + quantity + " 개" + "\n총 구매 가격 : " + getPrice() * getQuantity() + " 원";
		return info;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
