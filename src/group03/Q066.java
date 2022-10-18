/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rizqi
 */
public class Q066 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Joel");
        names.add("Paul");
        names.remove(0);
        names.remove(0);
        System.out.println(names.isEmpty());
        names.add("Joel");
        names.add("Paul");
        names.clear();
        System.out.println(names.isEmpty());
    }
    
}
