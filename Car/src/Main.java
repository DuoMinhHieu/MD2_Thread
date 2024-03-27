

public class Main {
    public static int DISTANCE = 100;
    public static int STEP = 2;

    public static <Car> void main(String[] args) {
        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");

        Thread thread1 = new Thread("CarA");
        Thread thread2 = new Thread("CarB");
        Thread thread3 = new Thread("CarC");


        System.out.println("Distance: 100km");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}