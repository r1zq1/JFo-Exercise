/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group02;

/**
 *
 * @author Rizqi
 */
class Course {
    String courseName;
}
public class Q049Student {
    String stuName;
    public static void main(String[] args) {
        Q049Student s = new Q049Student();
        s.stuName = args[0];
        Course c = new Course();
        c.courseName = args[1];
        System.out.println(s.stuName + " is studying " + c.courseName);
    }
}