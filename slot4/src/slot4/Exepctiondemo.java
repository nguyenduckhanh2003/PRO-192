/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot4;

/**
 *
 * @author Dell
 */
public class Exepctiondemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a={1,2,3,4,5};
        int n=10;
        try
        {
            for(int i=0;i<n;i++)
            {
                System.out.print(" " + a[i] + " ");    
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}