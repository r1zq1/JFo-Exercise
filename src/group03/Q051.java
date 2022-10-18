/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group03;

/**
 *
 * @author Rizqi
 */
public class Q051 {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};

        System.out.print("A: ");
        for(int  idx  =  1;  idx  <  arr.length;  idx+=2)  { 
            System.out.print (arr[idx]);
        }
        
//        for(int  idx  =  1;  idx  <  arr.length–1;  idx++)  { 
//            System.out.print  (arr[idx++]);
//        }
        System.out.println("");
        System.out.print("C: ");
        for(int  idx  =  0;  idx  <  arr.length;  idx++)  { 
            System.out.print  (arr[idx]);
        }
        System.out.println("");
        System.out.print("D: ");
        for(int  idx  =  0;  idx  <  arr.length;  idx+=2)  { 
            System.out.print  (arr[idx]); 
        }
    }
    
}
