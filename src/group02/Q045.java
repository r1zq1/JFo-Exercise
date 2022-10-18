/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group02;

/**
 *
 * @author Rizqi
 */
public class Q045 {
    public static void main(String[] args) {
        int value = 10;
        int a = ++value;
        int b = value;
        int c = value++;
        System.out.println(a + " " + b + " " + c + " " + value);
        if(a <= b && a <= c) {
            if(b <= c) {
                a = ++b;
            } else {
                a = ++c;
            }
        }
        System.out.println(a);
    }
    
}
