package Exercise1;

public class PitStopTeam {

     private String teamName;

     private int pitStopTime;

    public PitStopTeam(String teamName, int pitStopTime) {
        this.teamName = teamName;
        this.pitStopTime = pitStopTime;
    }

    public void performPitStop(F1Car car) {
         if (car.getFuelLevel() < 50) {
             car.refuel();
         }

         if (car.getTireCondition() < 50) {
                car.changeTires();
            }
         System.out.println("Pit stop completed for " + car.getTeamName());
     }
}
