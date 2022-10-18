/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group02;

/**
 *
 * @author Rizqi
 */
class Bus {
    String type = "default";
    // line n1
    Bus() {}
    Bus(String type) {
        // line n2
        this.type = type;
    }
}
public class Q037 {
    public static void main(String[] args) {
        Bus b1 = new Bus();
        System.out.println(b1.type);
        Bus b2 = new Bus("luxury");
        System.out.println(b2.type);
    }
}
