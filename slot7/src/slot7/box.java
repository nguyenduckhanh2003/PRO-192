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
public class box extends Rectangle {
    private int height=0;
    private box()
    {
        super();
    }
    public box(int l, int w, int h)
    {
        super(l,w);
        height = h>0?h:0;
    }
    public int getheight()
    {
        return height;
    }
    public void setheight(int height)
    {
        this.height=height;
    }
    public String toString()
    {
        return "["+ getlength()+"]"+ getwidth() + ","+getheight()+"]";
    }
    public int area()
    {
        int l = this.getlength();
        int w = this.getwidth();
        int h = this.getheight();
        return 2*(l*w+w*h+h*l);
    }
    public int volumn()
    {
        return this.getlength()*this.getwidth()*height;
    }
}
