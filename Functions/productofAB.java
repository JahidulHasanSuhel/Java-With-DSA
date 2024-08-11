

public class productofAB {

    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        
       int prd = multiply(a, b);
       System.out.println("a * b = " + prd);

       prd = multiply(10, 5);
       System.out.println(prd);
    }
}
