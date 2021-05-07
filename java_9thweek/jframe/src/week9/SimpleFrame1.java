/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

import javax.swing.*;

public class SimpleFrame1 {

    public SimpleFrame1() {
        JFrame frame = new JFrame("Simple Frame");
        frame.setSize(250, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(300, 300);
        frame.setVisible(true);
            }

    public static void main(String args[]) {
        new SimpleFrame1(); // same as SimpleFrame1 frame = new SimpleFrame1();
    }
}
