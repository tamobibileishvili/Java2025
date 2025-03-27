package Seminar2;

public class AndroidPhone implements SmartPhone{

    @Override
    public void makeCall() {
        System.out.println("Android phone is making a call...");
    }

    @Override
    public void turnOn() {
        System.out.println("Android phone is turning on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Android phone is turning off...");
    }
}
