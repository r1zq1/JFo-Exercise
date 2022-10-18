/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group02;

/**
 *
 * @author Rizqi
 */
public class Q031 {
    public static void main(String[] args) {
        String s1 = "foo-bar";
        String s2 = new String("foo-bar");
        System.out.print(s1.equals(s2) + " ");
        System.out.print(s1 == s2);
        System.out.print(" " + s1.compareTo(s2));
        System.out.println();
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        
        
        String a = "Hello";
        String b = new String("Hello");
        String c = "Hello";
        
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
        
        System.out.println(a == b);
        System.out.println(a == c);
        
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        
        System.out.println(a.compareTo(b));
        System.out  //ddddd
            .println(a.compareTo(c));
    }
}
