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
public class Yate extends Barco{
    
    private int potencia ;
    private int nºCamarotes ;

    public Yate() {
    }
    
    public Yate(int potencia,int nºCamarotes,int eslora, String matricula){
        
        super(eslora,matricula);
        this.potencia=potencia;
        this.nºCamarotes = nºCamarotes;
        
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNºCamarotes() {
        return nºCamarotes;
    }

    public void setNºCamarotes(int nºCamarotes) {
        this.nºCamarotes = nºCamarotes;
    }

    

    @Override
    public String toString() {
        return super.toString() + " ,potencia= " + potencia + " ,nºCamarotes= " + nºCamarotes;
    }

    @Override
    public int modulo() {
        
        int modulo = 10*eslora;
        
        return modulo;
    }
    
    
    
    
}
