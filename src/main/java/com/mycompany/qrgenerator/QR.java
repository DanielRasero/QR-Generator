/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qrgenerator;

/**
 *
 * @author daniel
 */
public class QR {

public static final int ANCHO_QR = 400;
public static final int ALTO_QR = 400;

//Este método genera un archivo en el disco duro con el nombre que se indica
//en la variable "fichero". El texto que codifica está contenido en "texto"
//y el formato de la imagen puede ser jpeg, tiff, gif, png.
public static void escribirQR(String texto, String fichero, String formatoImagen){
    
    //Objeto QRCodeWriter
    //Renderiza un código QR como una matriz de dos dimensiones (BitMatrix)
    
    QRCodeWriter qrcw= new QRCodeWriter();
    BitMatrix matrizPuntos= null;
    
    try{
    matrizPUntos= qrcw.encode(texto, BarcodeFormat.QR_CODE, ALTO_QR, ALTO_QR);
    
    }catch(WriterException ex){
        
        
    }
}
}
