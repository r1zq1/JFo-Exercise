/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rizqi
 */
public class Q042 {
    public static void main(String[] args) {
        int[] num = new int[2];
        num[0] = 10;
        num[1] = 15;
        
        List<Integer> lst = new ArrayList<>(2);
        lst.add(10);
        lst.add(15);
        
        num[1] = 20;
        lst.add(20);
        
        for(int x : num) {
            System.out.print(x + " ");
        }
        System.out.println("");
        for(int y: lst) {
            System.out.print(y + " ");
        }        
        
        try {
            
        } catch (NullPointerException e1) {
            
        } catch (Exception e2) {
            
        } finally {
            // always executed
        }
    }
}
