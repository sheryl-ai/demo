
public class MovieTicket {
	private double price;
	private Discount discount = new NoDiscount();
	
	public MovieTicket(double price){
		this.price = price;
	}
	
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public double getPrice() {
		return this.discount.calculate(this.price);
	}
}