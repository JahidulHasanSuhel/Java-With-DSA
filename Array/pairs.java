public class pairs {

    public static void printpairs(int num[]){
        int tp = 0;
        for(int i = 0; i<num.length; i++){
            int curr = num[i];
            for(int j = i+1; j<num.length; j++){
                System.out.print("(" + curr + "," + num[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("the total pair is " + tp);
    }
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        printpairs(num);
    }
}
