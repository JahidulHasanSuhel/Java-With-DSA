
import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class Basics2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age < 18){
        //     System.out.println("you are not eligible");
        // used to highlight message
               throw new RuntimeException("you can't vote");
        }
        else{
            System.out.println("you are eligible to vote.");
        }

    }
}
