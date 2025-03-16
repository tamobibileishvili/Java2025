package Exercise1;

public interface TelemetrySystem {

    public void sendData(String data);

    public String receiveData();

    public void analyzePerformance(F1RaceCar car);
}
