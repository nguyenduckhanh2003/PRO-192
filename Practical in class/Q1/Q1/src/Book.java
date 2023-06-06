/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class Book {
     private String title;
    private int price;

    public Book() {
        // Default constructor
    }

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title.toUpperCase();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void setPrice(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the price: ");
    int newprice = scanner.nextInt();
    setPrice(newprice);
    System.out.println("OUTPUT: ");
    System.out.println(getPrice());
    }
}
