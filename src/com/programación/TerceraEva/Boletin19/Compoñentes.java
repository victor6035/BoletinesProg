/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programación.TerceraEva.Boletin19;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author victo
 */
public class Compoñentes {
    
    JFrame marco;
    JPanel panel;
    JButton bPremer,bLimpar;
    JTextField lineaTexto1,lineaTexto2;
    JLabel etq1,etq2;
    JTextArea areaTexto;
    
    
    public void iniciar(){
        
        marco = new JFrame();
        panel = new JPanel();
        bLimpar = new JButton("LIMPAR");
        bPremer = new JButton();
        lineaTexto1 = new JTextField();
        lineaTexto2 = new JTextField();
        etq1 = new JLabel(" NOME ");
        etq2 = new JLabel(" PASSWORD ");
        areaTexto = new JTextArea();
        
        
        //Características del marco
        marco.setSize(550, 500);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
        //Caracteristicas del panel
        panel.setSize(500, 450);
        panel.setLayout(null);// anulamos el layout por defecto del panel
        
        //Características del boton limpiar
        
        bLimpar.setBounds(315, 350, 150, 40);
        bLimpar.setToolTipText("LIMPAR");
        bLimpar.setVerticalAlignment(1);
        bLimpar.setHorizontalAlignment(2);
        
        //Características del botón premer
        bPremer.setBounds(110, 350, 150, 40);
        bPremer.setText(" PREMER");
        bPremer.setVerticalAlignment(1);
        bPremer.setHorizontalAlignment(2);
        
        //Características del area de texto
        areaTexto.setBounds(110, 200, 350, 100);
        areaTexto.setText(" Area de Texto. ");
        
        //Características del la linea de texto 1
        lineaTexto1.setBounds(275, 25, 200, 40);
        
        //Características del la linea de texto 2
        lineaTexto2.setBounds(275, 120, 200, 40);
        
        //Características de la etiqueta 1
        etq1.setBounds(100, 25, 50, 40);
        
        //Características de la etiqueta 2
        
        etq2.setBounds(100, 120, 200, 40);
        
        
        
        //Añadimos los elementos al panel y el panel al marco
        panel.add(bLimpar);
        panel.add(bPremer);
        panel.add(areaTexto);
        panel.add(lineaTexto1);
        panel.add(lineaTexto2);
        panel.add(etq1);
        panel.add(etq2);
        marco.add(panel);
        
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
        
    }
    
    
}
