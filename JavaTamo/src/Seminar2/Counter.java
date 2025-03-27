package Seminar2;

public class Counter {
    private static int count = 0;

    public Counter() {
        count++;
    }

    public static void getCount() {

        System.out.println("counter is : " + count);
    }
}
