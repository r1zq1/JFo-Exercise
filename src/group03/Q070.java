/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group03;

import java.util.Random;

/**
 *
 * @author Rizqi
 */
public class Q070 {
    public static void main(String[] args) {
        Random r1 = new Random(10);
        Random r2 = new Random(10);     // line n1
        int x = r1.nextInt();
        int y = r2.nextInt();
        System.out.println(x);
        System.out.println(y);
        if(x == y) {
            System.out.println("Jack");
        } else {
            System.out.println("Queen");
        }
//        Math.random()
    }
}
