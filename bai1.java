/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot3;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner scanner= new Scanner(System.in);
            float a = scanner.nextFloat();
            if (!scanner.hasNextFloat()) {
            System.out.println("Không phải số!");
            return;}
            float b = scanner.nextFloat();
            if (!scanner.hasNextFloat()) {
            System.out.println("Không phải số!");
            return;}
          float c = scanner.nextFloat();
          if (!scanner.hasNextFloat()) {
            System.out.println("Không phải số!");
            return;}
           float max = a;
           if(max<b){
               max= b;
           }
           else if(max<c)
           {
               max= c;
           }
           System.out.println("So lon nhat trong 3 so la: "+ max);
           
    }
    
}
