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
public abstract class Barco {
    
    public int eslora;
    public String matricula;

    public Barco() {
    }

    public Barco(int eslora, String matricula) {
        this.eslora = eslora;
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
   public abstract int modulo();
   
    @Override
    public String toString() {
        return  "eslora= " + eslora + " ,matricula= " + matricula;
    }
    
    
    
    
}
