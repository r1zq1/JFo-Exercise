package group01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rizqi
 */
class App16 {
    int num;
    public int add(int x) {
        num = num + x;
        return num;
    }
    public void add(int x) {
        num = num + x;
    }
    public static void main(String[] args) {
        App16 obj = new App16();
        obj.add(100);
        int ans = obj.add(100);
        System.out.println(obj.num);
    }
}
public class Q016 {
}
