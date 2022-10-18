package group01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rizqi
 */
class Messenger {
    String msg;

    public Messenger(String msg) {
        this.msg = msg;
    }
    public void writeMsg(){
        System.out.println(msg);
    }
    public void readMsg() {
        // line n1
        writeMsg();
    }
    
}
public class Q005 {
    public static void main(String[] args) {
        Messenger m = new Messenger("All the best");
        m.readMsg();
    }
    
}
