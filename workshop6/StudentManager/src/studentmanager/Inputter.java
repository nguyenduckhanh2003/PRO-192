/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanager;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class Inputter {
     public static Scanner sc = new Scanner(System.in);

    public static int inputInt(int min, int max) {
        return inputInt(null, min, max);
    }

    public static int inputInt(String msg, int min, int max) {
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }

        int data = Integer.MIN_VALUE;

        while (true) {
            try {
                if (msg != null) {
                    System.out.println(msg);
                }

                data = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
            }

            if (data >= min && data <= max) {
                break;
            }
        }

        return data;
    }

    public static String inputStr() {
        return inputStr(null);
    }

    public static String inputStr(String msg) {
        if (msg != null) {
            System.out.println(msg);
        }
        String data= sc.nextLine().trim();
        
        return data;
    }

    public static String inputNonBlankStr(String msg) {
        String data = null;

        do {
            System.out.println(msg);
            data=sc.nextLine().trim();
        } while (data.length()==0);

        return data;
    }

    public static String inputPattern(String msg, String pattern) {
        String data = null;

        do {
             System.out.println(msg);
            data=sc.nextLine().trim();
        } while (!data.matches(pattern));

        return data;
    }
}
