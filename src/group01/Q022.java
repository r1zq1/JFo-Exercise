package group01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rizqi
 */
public class Q022 {
    public static void main(String[] args) {
        String flavors[] = {"Vanilla", "Chocolate"};
        int choice = 2;
        switch(choice) {
            case 1: 
                System.out.println("Selected " + flavors[1] + " flavor.");
                break;
            case 2: 
                System.out.println("Selected " + flavors[2] + " flavor.");
                break;
            default:
                System.out.println("Thank you!");
        }
    }
}
