
import java.util.Scanner;

/**
 *
 * @author Elvin Aliyev
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        String[] arr = s.split("[!,?._'@\\s]+");
        if (s.length() > 0) {
            System.out.println(arr.length);

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }else{
            System.out.println("0");
        }

    }

}
