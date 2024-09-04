public class MethodOverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

class Ani{
    void eat(){
        System.out.println("eats everything");
    }
}

class Deer extends Ani{
    void eat(){
        System.out.println("eats grass");
    }
}