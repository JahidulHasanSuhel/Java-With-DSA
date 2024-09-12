
public class SearchInRotatedSortedArray {

    public static int Search (int arr[], int tar, int s, int e){

        if(s > e){
            return -1;
        }

        int mid = s + (e - s) / 2;

        // case found
        if(arr[mid] == tar){
            return mid;
        }

        // mid on L1
        if(arr[s] < arr[mid]){
            //case a : left
            if(arr[s] <= tar && tar <= arr[mid]){
                return Search(arr, tar, s, mid - 1);
            }
            else{
                //case b: right
                return Search(arr, tar, mid + 1, e);
            }
        }
        // mid on L2
        else{
            // case c : right
            if(arr[mid] <= tar && tar <= arr[e]){
                return Search(arr, tar, mid + 1, e);
            }
            else{
                //case d : left
                return Search(arr, tar, s, mid - 1);
            }

        }

    }
    public static void main(String[] args) {
        int arr[] = {4 , 5, 6, 7, 0, 1, 2};
        int tar = 0; //output --> 4
        int tarINdx = Search(arr, tar, 0, arr.length - 1);
        System.out.println(tarINdx);

    }
}
