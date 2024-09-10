
public class MergeSort {


    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

       
    public static void MS(int arr[], int s, int e){
    
        if(s >= e){
            return;
        }
        
        int mid = s + (e - s) / 2;
        MS(arr, s, mid); // left part
        MS(arr, mid+1, e); // right part
        merge(arr, s, mid, e);
    
    }

    
    public static void merge(int arr[], int s, int mid, int e){
        // temp is size
        int temp[] = new int[ e - s + 1];
        int i = s; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp array

        while(i <= mid && j <= e){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++; k++;
            } 
            else {
                temp[k] = arr[j];
                j++; k++;
            }
        }

        // left part
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        // right part
        while(j <= e){
            temp[k++] = arr[j++];
        }
        // copy temp to original arr
        for(k = 0, i = s; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    
    }
    
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 8, 9, 3};
        MS(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
