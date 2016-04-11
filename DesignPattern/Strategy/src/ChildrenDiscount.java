
public class ChildrenDiscount implements Discount {
	public double calculate(double price){
		return price - 20.0 > 0 ? price - 20.0 : 0.0;
	}
}