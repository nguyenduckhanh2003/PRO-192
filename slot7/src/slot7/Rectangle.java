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
public class Rectangle {
    
    /**
     * @param args the command line arguments
     */
    private int length=0;
    private int width=0;
    public Rectangle()
    {
         
    }
    public Rectangle (int l,int w)
    {
        length=l>0?l:0;
        width=w>0?w:0;
    }
    public String tString()
    {
        return "[" + getlength() + "," + getwidth() +"]";
     
    }
    public int getlength()
    {
        return length;
    }
    public void setlength(int length)
    {
        this.length=length;
    }
    public int getwidth()
    {
        return width;
    }
    public void setwidth( int width)
    {
        this.width=width;
    }
    public int area()
    {
        return length*width;
    }

    
}
