package group01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rizqi
 */
class Course {
    String name;
    static int count = 0;
    Course (String name) {
        this.name = name;
        count++;
    }
}
public class Q010 {
    public static void main(String[] args) {
        Course c = new Course("Java Programming");
        // line n1
        System.out.println(c.name + ":" + Course.count);
    }
}
