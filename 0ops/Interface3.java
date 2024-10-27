interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }
}

public class Interface3 {
        public static void main(String[] args) {
            Vehicle myCar = new Car();
            myCar.start();  // Output: Car is starting.
            myCar.stop();   // Output: Car is stopping.
        }
}
