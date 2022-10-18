package group01;


import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rizqi
 */
public class Q009 {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add(1, "pen");
        items.add(2, "pencil");
        items.add(3, "erasers");
        items.add("paper");
        for (String x : items) {
            System.out.println(x + " ");
        }
    }
}
