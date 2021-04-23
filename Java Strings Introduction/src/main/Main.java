/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Elvin Aliyev
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());

        int x = A.compareTo(B);
        if (x > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String s = A.substring(0, 1).toUpperCase() + A.substring(1);
        String s2 = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(s + " " + s2);

    }
}
