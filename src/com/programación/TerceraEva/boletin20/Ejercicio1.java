/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programación.TerceraEva.boletin20;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author victo
 */
public class Ejercicio1 {
    
    JFrame marco;
    JPanel panel1;
    JPanel panel2;
    JButton bPremer,bLimpar,bBoton;
    JTextField lineaTexto1,lineaTexto2;
    JLabel etq1,etq2;
    JTextArea areaTexto,areaTexto2;
    
    
    
    public void iniciar(){
        
        marco = new JFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();
        bLimpar = new JButton("LIMPAR");
        bPremer = new JButton();
        bBoton = new JButton();
        lineaTexto1 = new JTextField();
        lineaTexto2 = new JTextField();
        etq1 = new JLabel(" NOME ");
        etq2 = new JLabel(" PASSWORD ");
        areaTexto = new JTextArea();
        areaTexto2 = new JTextArea();
        
        
        //Características del marco
        marco.setSize(900, 900);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
        //Caracteristicas del panel
        panel1.setSize(700, 400);
        panel1.setLayout(null);// anulamos el layout por defecto del panel
        panel2.setSize(700, 400);
        panel2.setLayout(null);// anulamos el layout por defecto del panel
        //Características del boton limpiar
        
        bLimpar.setBounds(450, 250, 150, 50);
        bLimpar.setToolTipText("LIMPAR");
        
        //Características del botón premer
        bPremer.setBounds(200, 250, 150, 50);
        bPremer.setText(" PREMER");
        
        //Características del botón 
        bBoton.setBounds(350, 450, 100, 50);
        bBoton.setText(" Boton ");
  
        //Características del la linea de texto 1
        lineaTexto1.setBounds(340, 35, 250, 50);
        
        //Características del la linea de texto 2
        lineaTexto2.setBounds(340, 100, 250, 50);
        
        //Características de la etiqueta 1
        etq1.setBounds(150, -20, 50, 150);
        
        //Características de la etiqueta 2
        etq2.setBounds(150, 50, 80, 150);
        
        //Características del area de texo 1
        areaTexto.setBounds(550, 430, 130, 150);
        //Características del area de texo 2
        areaTexto2.setBounds(150, 400, 150, 200);
        
        
        //Añadimos los elementos al panel y el panel al marco
        
        marco.add(panel1);
        
        panel1.add(bLimpar);
        panel1.add(bPremer);
        panel1.add(lineaTexto1);
        panel1.add(lineaTexto2);
        panel1.add(etq1);
        panel1.add(etq2);
        marco.add(panel2);
        panel2.add(bBoton);
        panel2.add(areaTexto);
        panel2.add(areaTexto2);
        marco.add(panel2);
        
        
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
        
    }
    
    
}
