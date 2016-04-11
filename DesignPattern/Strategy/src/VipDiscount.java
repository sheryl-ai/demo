
public class VipDiscount implements Discount {
	public double calculate(double price){
		return price * 0.5;
	}
}