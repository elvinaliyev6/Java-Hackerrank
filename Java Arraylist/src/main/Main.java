/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
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
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int d = in.nextInt();

            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < d; j++) {

                row.add(in.nextInt());

            }

            rows.add(row);

        }
        int q = in.nextInt();

        for (int i = 0; i < q; i++) {

            int x = in.nextInt();

            int y = in.nextInt();

            try {

                System.out.println(rows.get(x - 1).get(y - 1));

            } catch (IndexOutOfBoundsException e) {

                System.out.println("ERROR!");

            }

        }
    }
}
