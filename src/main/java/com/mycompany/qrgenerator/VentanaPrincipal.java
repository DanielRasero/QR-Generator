/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qrgenerator;

import javax.swing.JFrame;

/**
 *
 * @author daniel
 */
//Clase que hereda de JFrame
public class VentanaPrincipal extends JFrame {

    //Tamaño de la ventana
    public static final int ANCHO_FRAME = 600;
    public static final int ALTO_FRAME = 200;

    //Atributo. Cuando un objeto de una clase está contenido
    //como atributo de otra se conoce como Composición
    private Panel panel;

    public VentanaPrincipal() {

        crearVentana();
        panel = new Panel();
        this.add(panel);
    }

    private void crearVentana() {

        //posición y tamaño de la ventana
        this.setBounds(400, 150, ANCHO_FRAME, ALTO_FRAME);

        //Título para la ventana
        this.setTitle("Generador de códigos QR");

        //Ventana no redimensionable
        this.setResizable(false);

        //Cerrar programa al pulsar es aspa
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Hacer visible la ventana
        this.setVisible(true);
    }

}
