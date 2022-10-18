package group01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rizqi
 */
public class Q021 {
    public static void main(String[] args) {
        String []codes = {"CA", "JP", "US", "CA", "UK"};
        int count = 0;
        for (String c : codes) {
            if(c.equals("CA")) {
                continue;
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}
