/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot4;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class test2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean cont= false;
        do{
            try{
              System.out.println("Enter the string: ");
                String s = sc.nextLine();

                if (!s.matches("SE\\d{3}")) {
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
