/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop2;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Part2_1 {
       public static void main(String[] args)
    {
        String pattern = "SE\\d{3}";
        Scanner sc = new Scanner(System.in);
        boolean cont= false;
        do{
            try{
              System.out.println("Enter the string: ");
                String s = sc.nextLine();

                if (!s.matches(pattern)) {
                    throw new Exception();
                }

                System.out.println("The string is " + s);

                cont = false;
            }
            catch(Exception e ){
                System.out.println("the number is invalid");
               cont =true;
            }
        }while(cont);
    }
}
