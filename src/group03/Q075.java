/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group03;

/**
 *
 * @author Rizqi
 */
class MyClass {
    private int var1 = 100;
    public int var2 = 200;
    public void doCalc(){
        var1 = 100 * 2;                                // line n1
        var2 = 200 * 2;
    }
}
public class Q075 {
    public static void main(String[] args) {
        MyClass t = new MyClass();
        t.doCalc();
        System.out.println(t.var1 + " : " + t.var2);    // line n2
    }
}
