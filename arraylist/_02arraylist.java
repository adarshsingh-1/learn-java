package arraylist;
import java.util.*;

public class _02arraylist {
    public static void main(String[] args) {
        
        // Operations on ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // Get element
        int element = list.get(0);
        System.out.println(element);

        // Add element in between
        list.add(1, 1);
        System.out.println(list);

        // Set element (modify)
        list.set(0, 5);
        System.out.println(list);

        // Remove element
        list.remove(3);
        System.out.println(list);

        // Size of the list
        int size = list.size();
        System.out.println(size);

        // Loop through list
        for (int i = 0; i < size; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Sort list using Collections
        Collections.sort(list);
        System.out.println(list);
    }
}
