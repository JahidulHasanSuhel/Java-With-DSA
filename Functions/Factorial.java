import java.util.Scanner;

public class Factorial {

    public static int fact(int n){
        int f = 1;
        for(int i = 1; i<=n; i++){
            f = f * i;
        }
        return f;
    }
    // recursion 
    // public static int fact(int n){
    //     if(n <= 1) return 1;
    //     return n * fact(n - 1);
    // }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int f = fact(n);
        // System.out.println("factorial :"+ f);

        System.out.println(fact(5));
    }
}
