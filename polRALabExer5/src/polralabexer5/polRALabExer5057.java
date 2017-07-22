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
class ButtonFrame4 extends Frame {
    ButtonFrame4(String s) {
        super(s);
        setSize(200,100);
        setLayout(new BorderLayout());
        add(new Button("Superior"),BorderLayout.NORTH);
        add(new Button("Ontario"),BorderLayout.EAST);
        add(new Button("Erie"),BorderLayout.SOUTH);
        add(new Button("Michigan"),BorderLayout.WEST);
        add(new Button("Huron"),BorderLayout.CENTER);
        setVisible(true);
    }
}

class polRALabExer5057 {
    public static void main(String[] args) {
        new ButtonFrame4("Example 6");
    }
}
