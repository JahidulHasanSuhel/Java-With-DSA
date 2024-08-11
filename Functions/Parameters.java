

import java.util.*;

public class Parameters {

    public static int calculateSum(int a, int b){ // formal parameters
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b); //arguments or actual prarmeters.
        System.out.println("sum is: " + sum);

    }
}
