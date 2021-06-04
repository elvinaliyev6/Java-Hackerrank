import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.add(value);
        }

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String action = sc.next();
            if (action.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index, value);
            } else {
                int index = sc.nextInt();
                list.remove(index);
            }
        }
        sc.close();

        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}
