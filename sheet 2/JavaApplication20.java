/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication20;

import java.util.Scanner;

/**
 *
 * @author Admin-web
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       int num;
       System.out.print("enter the num from 1,12");
       num= input.nextInt();
       if(num==12 ||num==1||num==2){
           System.out.println("winter");

       }
       else if (num==3 || num==4||num==5){
           System.out.println("spring");
       }
       else if (num==6||num==7||num==8){
           System.out.println("summer");
       }
        else if (num==9||num==10||num==11){
           System.out.println("fall");
    }
    
}
}