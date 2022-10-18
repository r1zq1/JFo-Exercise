package group01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rizqi
 */
public class Q020 {
    public static void main(String[] args) {
        int [] arr = {10,0};
        int i = 0;
        try {
            int answer = arr[i]/arr[i+1];
        } catch (Exception e) {
            System.out.println("Unknown issues");
        } catch (ArithmeticException ae) {
            System.out.println("Invalid Divisor");
        }
    }
}
