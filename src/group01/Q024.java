package group01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rizqi
 */
class Product {
    String color = null;
    public Product(Product p) {
        this.color = p.color;
    }   
}

public class Q024 {
    public static void main(String[] args) {
        Product p1 = new Product();             // line n1
        p1.color = "White";
        Product p2 = new Product(p1);
        System.out.println(p1.color + ":" + p2.color);                
    }
}