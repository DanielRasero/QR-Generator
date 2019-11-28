/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qrgenerator;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
    JTextField txtUrl, txtFichero;
    JButton btnGenerar, btnCerrar;

    public Panel() {

        //Establece el layout del panel
        //Forma de disponer los elementos internamente
        this.setLayout(new FlowLayout());

        //Establecemos colorde fondo al panel
        this.setBackground(Color.red);

        //Tamaño del panel
        this.setSize(ANCHO_PANEL, ALTO_PANEL);

        inicializarComponentes();

    }

    private void inicializarComponentes() {

        //Añade label
        lblUrl = new JLabel("Introduce la URL o el texto: ");
        this.add(lblUrl);

        //Añade el campo de texto para poner el URL
        txtUrl = new JTextField(40);
        this.add(txtUrl);

        //Añade la etiqueta para indicar nombre fichero
        lblFichero = new JLabel("Indica el nombre del fichero: ");
        this.add(lblFichero);

        //Añade el campo de texto para poner el URL
        txtFichero = new JTextField(20);
        this.add(txtFichero);

        //Añade el botón de generar QR
        btnGenerar = new JButton("Generar código QR");
        this.add(btnGenerar);
        btnGenerar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                if (txtUrl.getText().isEmpty() || txtFichero.getText().isEmpty()) {
                     
                    JOptionPane.showMessageDialog(null, "Has dejado algún campo vacío");
                    
                }

            }
        });

        //Añade el botón de cerrar ventan
        btnCerrar = new JButton("Generar código QR");
        this.add(btnCerrar);

        btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

            }
        });

    }

}
