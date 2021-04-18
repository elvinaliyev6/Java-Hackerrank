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

    static boolean flag = true;
    static int B;
    static int H;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");

        }

    }

    public static void main(String[] args) {

        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }

}
