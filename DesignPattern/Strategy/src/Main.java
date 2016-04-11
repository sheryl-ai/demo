
public class Main {
	static MovieTicket ticket = new MovieTicket(120.0);	
	public static void testThePrice() {
		System.out.println("the price of origin price is :" + ticket.getPrice());
		ticket.setDiscount(new VipDiscount());
		System.out.println("the price of vip price is :" + ticket.getPrice());
		ticket.setDiscount(new StudentDiscount());
		System.out.println("the price of student price is :" + ticket.getPrice());
		ticket.setDiscount(new ChildrenDiscount());
		System.out.println("the price of children price is :" + ticket.getPrice());
	}
	
	
	public static void main(String[] args) {
		testThePrice();
		System.out.println("\nIf the price changed into 80\n");
		ticket.setPrice(80.0);
		testThePrice();
	}
}
