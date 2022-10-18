/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group03;

/**
 *
 * @author Rizqi
 */
public class Q058 {
    public static void main(String[] args) {
        int number = 1;
        String s = null;
        try {
            number = s.length();
            number += 2;
        } catch (RuntimeException e) {
            number += 4;
        }
        System.out.println(number);
    }
    
}
