/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rdajila.appconsola.poo;

/**
 *
 * @author rdajila
 */
public class Contador {
    private int Cont;
	
    public Contador(){}

    public Contador(int cont) {
            if (cont > 0) this.Cont = cont;
            else this.Cont = 0;
    }

    public Contador (final Contador contadorSource) {
            this.Cont = contadorSource.Cont;
    }

    public int getCont() {
            return Cont;
    }

    public void setCont(int cont) {
            Cont = cont;
    }

    public void incrementar() {
            this.Cont++;
    }

    public void decrementar() {
            this.Cont--;
            if (this.Cont < 0 ) this.Cont = 0;
    }
}
