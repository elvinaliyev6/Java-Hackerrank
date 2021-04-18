/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Elvin Aliyev
 */
 class Arithmetic{
    int add(int a,int b){
        return a+b;
    }
}

class Adder extends Arithmetic{
    
}

public class Solution {

    public static void main(String []args){
        Adder a = new Adder();
        
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
        
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
    
}
