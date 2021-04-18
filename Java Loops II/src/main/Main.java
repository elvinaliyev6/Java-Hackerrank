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
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt();
            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += (Math.pow(2, j) * b);
                System.out.print(sum+" ");
            }
            System.out.println("");
            sum=0;
        }

    }

}
