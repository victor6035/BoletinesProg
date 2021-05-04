/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programación.TerceraEva.boletin25;

/**
 *
 * @author victor
 */
public class Velero extends Barco {
    
    int nºMastiles;
    

    public Velero() {
    }
    
    public Velero(int nºMastiles,int eslora, String matricula){
        
        super(eslora,matricula);
        this.nºMastiles=nºMastiles;
        
    }

    public int getNºMastiles() {
        return nºMastiles;
    }

    public void setNºMastiles(int nºMastiles) {
        this.nºMastiles = nºMastiles;
    }



   

    @Override
    public String toString() {
        return super.toString()+" ,nºMastiles= " + nºMastiles ;
    }
    
    
    

    @Override
    public int modulo() {
        
        int modulo = 10*eslora;
        
        return modulo;
        
    }
    
}
