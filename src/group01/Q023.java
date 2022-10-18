package group01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rizqi
 */
class Test {
    static int var2 = 200;
    public static void print() {
        System.out.println(var2);
    }
    public void print(int var1) {           // line n1
        System.out.println(var1);
        var2 = var2 + var1;                 // line n2
        print();
    }
    public static void main(String[] args) {
        Test obj = new Test();
        obj.print(100);
    }
}
public class Q023 {
    
}
