import java.util.Random;

public class Main {
	public static void main(String[] args) {
		ThermometerObserved thermometer = new ThermometerObserved();
		TemperatureLoggerObserver temperatureLogger = new TemperatureLoggerObserver();
		LineChartObserver lineChart = new LineChartObserver();
		LoudspeakerObserver loudspeaker = new LoudspeakerObserver();
		thermometer.addObserver(temperatureLogger);
		thermometer.addObserver(lineChart);
		thermometer.addObserver(loudspeaker);
		
		loudspeaker.setCeil(30.0);
		
		for (int i = 0; i < 10; ++i) {
			double temperature = new Random().nextInt(15000);
			thermometer.setTemperature(temperature / 100.0);
		}
		
		temperatureLogger.showLog();
	}
}
