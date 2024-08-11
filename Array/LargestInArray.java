
public class LargestInArray {

    public static int Largest(int arr[]){
        int Large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(Large < arr[i]){
                Large = arr[i];
            }
            if(small > arr[i]){
                small = arr[i];
            }
        }
        System.out.println("Smallest number is "+ small);
        return Large;
    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 7, 8, 9};
        System.out.println("Largest number is " + Largest(arr));

    }
}
 