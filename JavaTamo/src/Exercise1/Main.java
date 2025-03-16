package Exercise1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        F1Car Mercedes = new F1Car("Mercedes");
        F1Car RedBull = new F1Car("RedBull");
        F1Car Ferrari = new F1Car("Ferrari");

        Ferrari.startEngine();
        Ferrari.accelerate(120);
        Ferrari.brake(50);
        System.out.println(Ferrari);

//        Ferrari = null;
        Ferrari.stopEngine();

        F1RaceCar McLaren = new F1RaceCar("McLaren");
        F1RaceCar AlphaTauri = new F1RaceCar("AlphaTauri");
        F1RaceCar Williams = new F1RaceCar("Williams");

        McLaren.enableDRS();
        AlphaTauri.enableDRS();
        Williams.disableDRS();

        F1Car[] cars = {Mercedes, RedBull, Ferrari, McLaren, AlphaTauri,Williams};

        for (F1Car car : cars) {
            car.startEngine();
            car.accelerate(100);
        }
        McLaren.brake(500);

        PitStopTeam FerrariTeam = new PitStopTeam("FerrariTeam", 10);
        PitStopTeam RedBullTeam = new PitStopTeam("RedBullTeam", 11);
        PitStopTeam MercedesTeam = new PitStopTeam("MercedesTeam", 13);

        FerrariTeam.performPitStop(Ferrari);
        RedBullTeam.performPitStop(RedBull);
        MercedesTeam.performPitStop(Mercedes);
    }
}