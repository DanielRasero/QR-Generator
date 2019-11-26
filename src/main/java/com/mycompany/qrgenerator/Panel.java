/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qrgenerator;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author daniel
 */
public class Panel extends JPanel{
    
     //Tamaño del panel
    public static final int ANCHO_FRAME= 600;
    public static final int ALTO_FRAME= 200;
    
    //Atributos del panel
    JLabel lblUrl, lblFichero;
    JTextArea txtUrl, txtFichero;
    JButton btnGenerar, btnCerrar;
    
}
