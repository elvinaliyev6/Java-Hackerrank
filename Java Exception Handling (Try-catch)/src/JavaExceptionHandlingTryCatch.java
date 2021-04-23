

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Elvin Aliyev
 */
public class JavaExceptionHandlingTryCatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x / y);
        } catch (Exception ex) {
            if (ex instanceof ArithmeticException) {
                System.out.println("java.lang.ArithmeticException: / by zero");
            } else if (ex instanceof InputMismatchException) {
                System.out.println("java.util.InputMismatchException");
            }
        }

    }

}
