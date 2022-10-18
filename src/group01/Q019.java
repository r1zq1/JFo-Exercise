package group01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rizqi
 */
public class Q019 {
    public static void main(String[] args) {
        String s = "Hello Java";
        System.out.println(s.length());
        s.concat("SE 8");
        System.out.println(s.length());
        
        String a = "Hello";
        System.out.println(System.identityHashCode(a));
        a = a + " apa kabar?";
        System.out.println(System.identityHashCode(a));
        
        StringBuilder sb = new StringBuilder("Hello Java");
        System.out.println(sb.length());
        sb.append("SE 8");
        System.out.println(sb.length());
                
    }
}
