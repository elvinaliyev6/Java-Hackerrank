import java.util.Scanner;

/**
 *
 * @author Elvin Aliyev
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String c="Yes";
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                c="No";
            }
        }
        System.out.println(c);
        
    }
    
}
