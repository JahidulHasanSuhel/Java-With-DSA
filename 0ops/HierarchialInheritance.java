public class HierarchialInheritance {
    public static void main(String[] args) {
        // Mammal, Fish, Bird every class object can use Animal class;
        Bird b = new Bird();
        b.eat();
        
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

 class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
 }

 class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
 }

 class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
 }
