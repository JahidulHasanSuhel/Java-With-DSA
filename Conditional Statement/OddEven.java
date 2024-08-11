import java.util.*;

public class OddEven {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    if((a % 2) == 0){
        System.out.println("even");
    }
    else{
        System.out.println("odd");
    }
    }
}
