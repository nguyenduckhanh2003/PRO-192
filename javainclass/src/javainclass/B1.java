/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainclass;
 import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Dell
 */
public class B1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner= new Scanner(System.in);
        System.out.println("Using for loop");
        for(int i=2;i<10;i++)
        {
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("Using while loop");
        int n=2;
        while(n<=10){
            if(n%2==0){
                System.out.println(n);
            }
            n++;
        }
      int size = scanner.nextInt();
         System.out.println("Enter the number of elements in the array:");
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("The entered array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
         System.out.println("Original array: " + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
        int max=arr[0];
          for (int i = 1; i < size; i++) {
               if(arr[i]>max)
               {
                   max=arr[i];
               }
        }
         System.out.println("enter max element of array: " + max);
    }
    
}