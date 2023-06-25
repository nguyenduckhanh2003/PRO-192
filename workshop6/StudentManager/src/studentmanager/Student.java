/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanager;

/**
 *
 * @author Dell
 */
public class Student {
      private String code;
    private String name;
    private int mark;

    public Student() {
    }

    public Student(String code, String name, int mark) {
        this.code = code.toUpperCase();
        this.name = name.toUpperCase();
        this.mark = (mark >= 0 && mark <= 10) ? mark : 0;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }
    public int getMark(){
        return mark;
    }
    @Override
    public String toString() {
        return this.code + ", " + this.name + ", " + this.mark;
    }
     public void setName(String name) {
        name = name.trim().toUpperCase();

        if (name.length()>0) {
            this.name = name;
        }
    }

    public void setMark(int mark) {
        if(mark >= 0 && mark <= 10)
        this.mark = mark;
    }
        
}
