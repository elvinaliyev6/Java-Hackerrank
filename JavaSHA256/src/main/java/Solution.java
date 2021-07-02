
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Scanner;

/**
 *
 * @author Elvin Aliyev
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(input.getBytes(StandardCharsets.UTF_8));

        BigInteger number = new BigInteger(1, hash);
        StringBuilder hexString = new StringBuilder(number.toString(16));

        while (hexString.length() < 64) {
            hexString.insert(0, '0');
        }
        System.out.println(hexString.toString());
    }
}
