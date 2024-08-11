import java.util.*;
public class ReverseArray {

    public static void reverse(int arr[]){
        int start = 0, end = arr.length-1;
        while(start< end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int num[] = {2, 3, 4, 6, 7, 8};
        reverse(num);
        for(int i = 0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
