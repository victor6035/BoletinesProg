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
public class EmbarcacionDeportivas extends Barco{
    
    private int potencia = 350;

    public EmbarcacionDeportivas() {
    }
    public EmbarcacionDeportivas(int potencia,int eslora, String matricula){
        
        super(eslora,matricula);
        this.potencia=potencia;
        
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    

    @Override
    public String toString() {
        return super.toString() + " ,potencia= " + potencia;
    }
    
    
    
    

    @Override
    public int modulo() {
        
        int modulo = 10*eslora;
        
        return modulo;
    }
    
    
}
