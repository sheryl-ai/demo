import java.util.ArrayList;
import java.util.List;

public class ThermometerObserved implements Observed{
	 private List<Observer> observedList= new ArrayList<Observer>();
	 private double temperature;
	 
	 public void setTemperature(double temperature) {
		 this.temperature = temperature;
		 this.notifyObserver();
	 }
	 
	 public double getTemperature() {
		 return this.temperature;
	 }
	 
	 public ThermometerObserved(double temperature) {
		 this.temperature = temperature; 
	 }
	 
	 public ThermometerObserved() {
		 this.temperature = 20.0;
	 }
	 
	 @Override
	 public void addObserver(Observer obsv){
	     observedList.add(obsv);
	 }

	 @Override
	 public void removeObserver(Observer obsv){
	 	observedList.remove(obsv);
	 }
	    
	 @Override
	 public void removeAllObserver() {
	 	observedList.clear();
	 }

	 @Override
	 public void notifyObserver(){
	     for (Observer tmp:observedList) {
	     	tmp.update(this.temperature);
	     }
	 }
}
