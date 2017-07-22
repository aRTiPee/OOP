/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polralabexer5;

import java.awt.*;
/**
 *
 * @author artipee
 */
class polRALabExer5052 extends Frame {
    polRALabExer5052 (String s)  {
        super(s);
        setBackground(Color.blue);
        setSize(250,100);
        setVisible(true);
    }
}

class TestMyFrame {
    public static void main(String args[]) {
        System.out.println("Creating a 250x100-pixel frame.");
        new polRALabExer5052("Example 2");
        System.out.println("To quit, click on this window and press Ctrl+C");
    }
}

