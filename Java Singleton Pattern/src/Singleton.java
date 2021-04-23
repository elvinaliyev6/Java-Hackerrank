/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Elvin Aliyev
 */
public class Singleton {
    
    private Singleton(){
        
    }

   public String str;
   static Singleton s=new Singleton();
   public static Singleton getSingleInstance (){
       return s;
   }
    
    public static void main(String[] args) {
        
    }
    
}


