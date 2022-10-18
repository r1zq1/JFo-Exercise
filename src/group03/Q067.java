/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group03;

/**
 *
 * @author Rizqi
 */
public class Q067 {
    public static void main(String[] args) {
        String []flowers = {"lotus","lily","rose","jasmine"};
        for(String c : flowers) {
            if(c.length() < 4) {
                continue;
            }
            System.out.print(c + " ");
            if(c.length() == 4) {
                break;
            }
        }
    }
}
