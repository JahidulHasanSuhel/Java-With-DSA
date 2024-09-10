// worst case time complexity occurs when pivot is always the
// smallest or the largest element.(sorted in Ascending or Descending)
// worst case --> O(n^2)


public class QuickSort {

    public static void print(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void QSort(int arr[], int s, int e){

        if(s >= e){
            return;
        }

        int p = partition(arr, s, e);
        QSort(arr, s, p-1);
        QSort(arr, p+1, e);
    }

    public static int partition(int arr[], int s, int e){
        int pivot = arr[e];
        int i = s - 1;// to make for elements smaller than pivot

        for(int j = s; j < e; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        i++;
        int temp = pivot;
        arr[e] = arr[i];
        arr[i] = temp;
        return i;
}


    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5,-5};
        QSort(arr, 0, arr.length-1);
        print(arr);
    }
}