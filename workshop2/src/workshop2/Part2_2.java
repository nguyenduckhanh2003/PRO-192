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
public class Part2_2 {
    String pattern = "SE\\d{3}";
    Scanner sc = new Scanner(System.in);

    public String inputString() throws Exception {
        System.out.println("Input the string: ");

        String s = sc.nextLine();

        if (!s.matches(pattern)) {
            throw new Exception();
        }

        return s;
    }
     public static void main(String[] args) {
         Part2_2 obj = new Part2_2();

        boolean cont = false;

        do {
            try {
                System.out.println("The string is " + obj.inputString());

                cont = false;
            } catch (Exception e) {
                System.out.println("The string is invalid");

                cont = true;
            }
        } while (cont);
    }
}
