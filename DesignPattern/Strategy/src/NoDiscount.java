
public class NoDiscount implements Discount{
	public double calculate(double price){
		return price;
	}
}
