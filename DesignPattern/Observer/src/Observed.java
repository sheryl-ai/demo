
public interface Observed {
	public void addObserver(Observer obsv);
	
	public void removeObserver(Observer obsv);
	
	public void removeAllObserver();
	
	public void notifyObserver();
}
