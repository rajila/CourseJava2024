/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rdajila.appconsola.poo;

/**
 *
 * @author rdajila
 */
public class Circulo implements IFigura {
    private double ratio = 0.0;
	
    public Circulo() {}

    public Circulo(double ratio) {
            this.ratio = ratio;
    }
	
    @Override
    public double Area() {
            // TODO Auto-generated method stub
            return Math.PI * Math.pow(ratio, 2);
    }

    @Override
    public String toString() {
            return "Circulo [Area()=" + Area() + "]";
    }
}
