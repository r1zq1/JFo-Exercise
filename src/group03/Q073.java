/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group03;

/**
 *
 * @author Rizqi
 */
public class Q073 {
    public static void main(String[] args) {
        String test = "a";
        for(; test.compareTo("aaa") == 0; test = test + "a") 
            System.out.print(test.length() + " ");
        System.out.print(test);
    }
    
}
