/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Car {
    private int price;
    private String maker;
       public Car() {
        // Default constructor
    }
    public Car( String maker, int price)
    {
        this.price=price;
        this.maker=maker;
    }
     public String getMaker() {
        return maker;
    }

    public int getPrice() {
        return price;
    }
     public void setPrice(int price) {
        this.price = price;
    }
      public void setMaker(String maker) {
        this.maker = maker;
    }
  
    @Override
     public String toString()
    {
        return maker + "," + price;
    }
}
