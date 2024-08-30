public class Inheritance {
    public static void main(String[] args) {
        Fish Tuna = new Fish();
        Tuna.eat();
        Tuna.breathe();
    }
}

 class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
 }

 class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims");
    }
 }