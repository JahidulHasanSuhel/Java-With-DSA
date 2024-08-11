
public class PrintSubArray {
    
    public static void printsubarr(int num[]){
        int totalsubarray = 0;
        for(int i=0; i<num.length; i++){
            int start =  i;
            for(int j=i; j<num.length; j++){
                int end = j;
                for(int k = start; k<=end; k++){
                    System.out.print(num[k] + " ");
                }
                totalsubarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total number of subarray is " + totalsubarray);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printsubarr(numbers);
    }
}
