
import java.math.BigInteger;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elvin Aliyev
 */
public class Solution {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
      in.close();
      System.out.println(n.isProbablePrime(1) ? "prime" :"not prime");
    }
}
