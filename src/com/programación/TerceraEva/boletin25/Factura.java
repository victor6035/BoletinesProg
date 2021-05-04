/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programación.TerceraEva.boletin25;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class Factura{
    
    
    public void Facturacion(){
        
        int dias;
        float alquiler=0;
        int option;
        String ID = "";
        int eslora = 0;
        
         ArrayList<Barco> listaBarco = new ArrayList<>();
        
        Velero velero=new Velero(1,12,"ASD123");
        EmbarcacionDeportivas embarcacion=new EmbarcacionDeportivas(400,12,"asd1234");
        Yate yate=new Yate(2000,4,20,"12243DFG");
        listaBarco.add(velero);
        listaBarco.add(embarcacion);
        listaBarco.add(yate);
        
        String[] botones = {"Embarcacion Deportiva", "Velero", "Yate"};

         option = JOptionPane.showOptionDialog(null,"Pulsa un boton para selecionar tu embarcaccion:","Elige tu opcion:",0,3, null,botones, botones[0]);
        
        
        switch (option){
            
            case 0: 
                dias=Integer.parseInt(JOptionPane.showInputDialog("Cuantos dias quieres alquilar"));
                alquiler = (embarcacion.modulo()*dias)+ (2*embarcacion.getPotencia());
                ID=embarcacion.getMatricula();
                eslora=embarcacion.getEslora();
                break;
            
            
            case 1: 
                dias=Integer.parseInt(JOptionPane.showInputDialog("Cuantos dias quieres alquilar"));
                alquiler = (velero.modulo()*dias)+(velero.getNºMastiles()*8);
                ID=velero.getMatricula();
                eslora=embarcacion.getEslora();
                break;
                
            case 2: 
                dias=Integer.parseInt(JOptionPane.showInputDialog("Cuantos dias quieres alquilar"));
                alquiler = (yate.modulo()*dias)+ (2*yate.getPotencia()+(25*yate.getNºCamarotes()));
                ID=yate.getMatricula();
                eslora=embarcacion.getEslora();
                break;
                
            default: break;    
                
        }
        
        
        
        JOptionPane.showMessageDialog(null, "Factura : "+"\n matricula:  "+ID+"\n eslora: "+eslora+"\n precio: "+alquiler);
        
        
     
    }

    
    
    
    
    
}
