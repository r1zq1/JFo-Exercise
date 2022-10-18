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
public class Q060 {
    public static void main(String[] args) {
        List<String> fls = new ArrayList<>();
        fls.add("jasmine");
        fls.add("rose");
        fls.add("lotus");
        fls.remove(2);
        fls.set(2, "lily");
        System.out.println(fls);
    }
    
}
