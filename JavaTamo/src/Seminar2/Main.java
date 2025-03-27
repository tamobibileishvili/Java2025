package Seminar2;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", 30);
        person1 = null;

        try {
            person1.getName();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException, Person is null");
        }

        Car car1 = new Car("BMW", "X5", 2020);
        car1 = null;

        try {
            car1.display();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException, Car is null");
        }

        System.out.println(Test.devide(10, 0));
        System.out.println(Test.devide(10, 2));


        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();

        Counter.getCount();

        Student.displayCollege();
        Student student1 = new Student("John");
        student1.display();
        student1.studentName();
        student1.displayCollege();
    }
}
