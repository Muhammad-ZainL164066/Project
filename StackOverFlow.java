/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackoverflow;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Wajahat
 */
public class StackOverFlow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        WelcomeWindow obj = new WelcomeWindow();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        obj.setSize(screenSize.width, screenSize.height);
        obj.setVisible(true);
    }

}
