
import java.time.LocalDate;
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
    
    public static String findDay(int month, int day, int year) {
        LocalDate dt = LocalDate.of(year, month, day);
        return dt.getDayOfWeek().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mm = sc.nextInt();
        int dd = sc.nextInt();
        int yy = sc.nextInt();
        
        String s=findDay(mm, dd, yy);
        System.out.println(s);
    }

}
