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
class ColoredFrame extends Frame {
    ColoredFrame(String s, Color color, int x, int y) {
        super(s+color.toString());
        setBackground(color);
        setSize(350,100);
        setLocation(x,y);
        setVisible(true);
    }
}

class polRALabExer5053 {
    public static void main(String args[]) {
        new ColoredFrame("Red: ",Color.red, 0,0);
        new ColoredFrame("Green: ",Color.green,0,100);
        new ColoredFrame("Yellow: ",Color.yellow,0,200);
        new ColoredFrame("Blue: ",Color.blue,0,300);
        new ColoredFrame("Pink: ",Color.pink,0,400);
    }
}
