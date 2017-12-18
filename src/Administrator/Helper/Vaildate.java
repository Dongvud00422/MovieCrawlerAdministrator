/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrator.Helper;

import java.awt.Color;
import java.util.HashMap;
import javax.swing.JTextField;

/**
 *
 * @author dongvu
 */
public class Vaildate {

    public boolean isEmpty(String text) {
        return (text.length() == 0);
    }

    public void isEmptyErrorMessage(JTextField textField) {
        textField.setText("Không được bỏ trống !");
        textField.setForeground(Color.red);
    }
}
