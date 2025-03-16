package Exercise1;

public class F1RaceCar extends F1Car implements TelemetrySystem {

    private boolean drsEnabled;

    public F1RaceCar(String teamName) {
        super(teamName);
    }

    public void enableDRS() {
        drsEnabled = true;
        System.out.println("DRS enabled for " + getTeamName());
    }

    public void disableDRS() {
        drsEnabled = false;
        System.out.println("DRS disabled for " + getTeamName());
    }

    @Override
    public void accelerate(double speed) {
        if (drsEnabled) {
            super.accelerate(speed * 1.3);
        } else {
            super.accelerate(speed);
        }
    }

    @Override
    public String toString() {
       return super.toString() + " DRS enabled: " + drsEnabled;
    }

    @Override
    public void sendData(String data) {
        System.out.println("Sending data: " + data);
    }

    @Override
    public String receiveData() {
        return "Data received";
    }

    @Override
    public void analyzePerformance(F1RaceCar car) {
        super.displaystas();
        System.out.println("Performance analyzed");
    }
}
