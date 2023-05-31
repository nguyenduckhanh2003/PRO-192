/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot7;

/**
 *
 * @author Dell
 */
public class demo {
     public static void main (String[] args){
        Rectangle r = new Rectangle(2,5);
        System.out.println("Rectangle" + r.toString());
        System.out.println(" Area: " + r.area());
        box b= new box(2,2,2);
        System.out.println("Box " + b.toString());
        System.out.println(" Area: " + b.area());
        System.out.println(" Volumn: " + b.volumn());
    }
}
