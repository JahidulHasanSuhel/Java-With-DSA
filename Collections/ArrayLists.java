
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get elements
        int element = list.get(2);
        System.out.println(element);

        //add element in between
        list.add(1, 1);
        System.out.println(list);

        //set element
        list.set(0, 5);
        System.out.println(list);

        //delete element 
        list.remove(3);
        System.out.println(list);

        //size 
        int sz = list.size();
        System.out.println(sz);

        //loops
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);


    }
}
