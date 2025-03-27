package Seminar2;

public class Test {

    public static double devide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
            return -1;
        }
    }
}
