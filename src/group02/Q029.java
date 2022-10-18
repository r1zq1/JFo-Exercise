/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group02;

/**
 *
 * @author Rizqi
 */
public class Q029 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(a++ > 10 || ++b <= 21);
        System.out.println(a > 10 && ++b <= 22);
        System.out.println(a <= 11 && b == 22);
        System.out.println(c++ == 31 && a++ == 11 || b++ == 22);
        
        int x = 100;
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x);
        
    }
    
}
