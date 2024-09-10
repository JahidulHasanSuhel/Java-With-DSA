import java.util.*;

public class BinarySearch {
    public static int bs(int num[], int key){
        int s = 0; 
        int  e = num.length - 1;

        while(s <= e){
            int mid = (s + e)/2;

            if(num[mid] == key) return mid;

            if(num[mid] < key){
                s = mid + 1;

            }
            else{
                e = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        System.out.println("index for key is " + bs(num, key));

    }
}
  