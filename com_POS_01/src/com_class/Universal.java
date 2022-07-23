/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com_class;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author CHETHANA
 */
public class Universal {
    public  void imageMethod(String selectedImagePath , JLabel  imagelable){
        ImageIcon ii = new ImageIcon(getClass().getResource(selectedImagePath));
        Image image = ii.getImage().getScaledInstance(imagelable.getWidth(), imagelable.getHeight(),Image.SCALE_SMOOTH);
        imagelable.setIcon(new ImageIcon(image));
    }



}
