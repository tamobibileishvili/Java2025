package Exercise1;

public class F1Car extends F1Vehicle {

    private String teamName;

    private double speed;

    private double fuelLevel;

    private int tireCondition;

    private boolean engineOn;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public int getTireCondition() {
        return tireCondition;
    }

    public double getSpeed() {
        return speed;
    }

    public void refuel() {
        fuelLevel = 100;
    }

    public void changeTires() {
        tireCondition = 100;
    }

    public F1Car(String teamName) {
        this.teamName = teamName;
        this.fuelLevel = 100;
        this.tireCondition = 100;
    }

    public void startEngine() {
        engineOn = true;
    }

    public void stopEngine() {
        try { engineOn = false;
             speed = 0;
        } catch (NullPointerException e) {
            System.out.println("Car is not initialized");
            throw e;
        }
    }

    public void accelerate(double speed) {
        if (fuelLevel <= 5) {
            throw new RuntimeException("Fuel level is too low");
            } else if (speed <= 0) {
            throw new RuntimeException("Speed cannot be 0 or negative");
        }
        this.speed += speed;
        this.fuelLevel -= 5;
        System.out.println(this.teamName + " speed is: " + getSpeed());
    }

    public void brake(double speed) {
        if (engineOn && speed > 0) {
            if (this.speed - speed < 0) {
                this.speed = 0;
            } else {
                this.speed -= speed;
            }
            System.out.println(this.teamName + " speed is: " + getSpeed());
        }
    }

    public double lapTime(double trackLength) {
        if (trackLength <= 0) {
            throw new RuntimeException("Track length cannot be 0 or negative");
        }
        try {
            return trackLength / speed;
        } catch (ArithmeticException e) {
            System.out.println("speed cannot be 0");
        }
        return 0;
    }

    @Override
    public String toString() {
        return  "teamName='" + teamName + '\'' +
                ", speed=" + speed +
                ", fuelLevel=" + fuelLevel +
                ", engineOn=" + engineOn +
                ", tireCondition=" + tireCondition +
                '}';
    }

    public String displaystas() {
        return "Exercise1.F1Car{" +
                "teamName='" + teamName + '\'' +
                ", speed=" + speed +
                ", fuelLevel=" + fuelLevel +
                ", engineOn=" + engineOn +
                '}';
    }
}
