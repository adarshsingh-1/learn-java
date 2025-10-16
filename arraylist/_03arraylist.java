package arraylist;
import java.util.*;

public class _03arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.add(value); 
        }
        System.out.println(list);

        sc.close();
    }
}
