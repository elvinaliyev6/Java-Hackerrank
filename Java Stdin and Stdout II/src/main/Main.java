package main;

import java.util.Scanner;

/**
 *
 * @author Elvin Aliyev
 */
public class Main {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double d=sc.nextDouble();
        sc.nextLine();
        String s=sc.nextLine();
        
        System.out.println("String: "+s);
        System.out.println("Double: "+d);
        System.out.println("Int: "+a);
    }
    
}
