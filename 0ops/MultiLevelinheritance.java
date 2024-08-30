public class MultiLevelinheritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
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

 class Mammal extends Animal{
    int legs;
 }

 class Dog extends Mammal{
    String breed;
 }