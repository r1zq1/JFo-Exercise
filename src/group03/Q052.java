/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group03;

/**
 *
 * @author Rizqi
 */
class Q052 {
    public static void main(String[] args) {
        String a = "Java";
        String b = new String("Java");
        String c = "Java";
        System.out.println(a.equals(b));
        System.out.println(a == b);
        System.out.println(a == c);
        
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
        
    }
    
}
