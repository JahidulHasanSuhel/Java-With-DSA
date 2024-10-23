import java.util.*;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example 1
        // int dividend = sc.nextInt();
        // int divisor = sc.nextInt();

        // try {
        //     int result = dividend/divisor;
        //     System.out.println("Answer is : " + result);
        // } catch(ArithmeticException e){
        //     // System.out.println("divisor can't be zero!!");
        //     System.out.println(e.getMessage());
        // }

        //Example 2

        int arr[] = new int[5];

        try{
            // arr[6] = 10/0;
            arr[6] = 10;
        } catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        
        // try
        // catch --> if we have to use multiple catch the first catch
        // must be child class
        // catch --> child's parent
        // catch --> Main parent.


        
    }
}
 