/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot3;

/**
 *
 * @author Dell
 */
public class bai2 {
    public static void main(String[] args) {
    int[] array = {5, 10, 20, 15, 25};
int sum = 0;

for (int i = 0; i < array.length; i++) {
    sum += array[i];
}

double average = (double) sum / array.length;
double min = Integer.MAX_VALUE;
int nearestElement = 0;

for (int i = 0; i < array.length; i++) {
    double other = Math.abs(array[i] - average);
    if (other < min) {
        min = other;
        nearestElement = array[i];
    }
}

System.out.println("The element nearest to the average is: " + nearestElement);

    }
}
