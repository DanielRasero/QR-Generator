/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qrgenerator;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author daniel
 */
public class Panel extends JPanel {

    //Tamaño del panel
    public static final int ANCHO_PANEL = 600;
    public static final int ALTO_PANEL = 200;

    //Atributos del panel
    JLabel lblUrl, lblFichero;
    JTextArea txtUrl, txtFichero;
    JButton btnGenerar, btnCerrar;

    public Panel() {

        //Establece el layout del panel
        //Forma de disponer los elementos internamente
        this.setLayout(new FlowLayout());

        //Establecemos colorde fondo al panel
        this.setBackground(Color.red);

        //Tamaño del panel
        this.setSize(ANCHO_PANEL, ALTO_PANEL);

    }

}
