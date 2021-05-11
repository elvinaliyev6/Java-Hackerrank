package main;
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
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int start = sc.nextInt();
        int end = sc.nextInt();
        
        String ss=s.substring(start, end);
        System.out.println(ss);

                
        
    }
}
