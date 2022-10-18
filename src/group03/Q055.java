/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group03;

/**
 *
 * @author Rizqi
 */
public class Q055 {
    final int l = 5;
    static void modify(Q055 test) {
        test.l = 99;
    }
    public static void main(String[] args) {
        final Q055 tf = new Q055();
        modify(tf);
        System.out.println(tf.l);
    }
    
}
