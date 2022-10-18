package group01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rizqi
 */
public class Q006 {

//    for(int count = 0; count < 5; count++) {
//        System.out.println(count);
//    }

//    package p1;
    
//    import java.util.*;
//    public void display(){
//        List<Integer> nums = new ArrayList<>();
//    }
    
//    {
//	private int num;
//    }
    
    private String name = "John"; 
    public void display () { 
	System.out.print(name);
        
        int a[] = {10,20,30,40};
        for(int element : a ){
            System.out.println(element);
        }
        for(int i = a.length-1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        new Q006().display();
    }
}
