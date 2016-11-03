/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilmessagem;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author PROGRAMADOR-02
 */
public class UtilMessage implements Serializable {

    public static void message(String strMessage) {

        JOptionPane.showMessageDialog(null, strMessage);

    }

    public static void message(Exception exception) {
        message(exception.getMessage());
    }
}
