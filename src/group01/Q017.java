package group01;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rizqi
 */
public class Q017 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Julia");
        names.add("Peter");
        for(Iterator<String> itr = names.iterator(); itr.hasNext();) {
            System.out.println(itr.next());
        }
    }
}
