
public class LoudspeakerObserver implements Observer{
	private double ceil = 20.0;
	@Override
	public void update(double temperature) {
		Loudspeaker(temperature);
	}
	
	public LoudspeakerObserver(double ceil) {
		this.ceil = ceil;
	}
	
	public LoudspeakerObserver() {
	}
	
	public void setCeil(double ceil) {
		this.ceil = ceil;
	}
	
	public double getCeil() {
		return this.ceil;
	}
	
	public void Loudspeaker(double ceil) {
		if (ceil >= this.ceil) {
			System.out.println("=======================================");
			System.out.println("|              Warning!               |");
			System.out.println("|  the temperature is too high now    |");
			System.out.println("=======================================");
		}
	}
}
