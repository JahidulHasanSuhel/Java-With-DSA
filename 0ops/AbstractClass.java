public class AbstractClass {
    public static void main(String[] args) {

        Horse h = new Horse();
        h.eat();
        h.walk();

        Chiken c = new Chiken();
        c.eat();
        c.walk();

    }
}

abstract class Animall{
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();

}

class Horse extends Animall{
    void walk(){
        System.out.println("walk on 4 legs");
    }
}

class Chiken extends Animall{
    void walk(){
        System.out.println("walk on 2 legs");
    }
}