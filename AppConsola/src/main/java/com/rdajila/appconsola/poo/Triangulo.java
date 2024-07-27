/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rdajila.appconsola.poo;

/**
 *
 * @author rdajila
 */
public class Triangulo implements IFigura {
    private double base = 0.0;
    private double altura = 0.0;

    public Triangulo() {}

    public Triangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
    }
	
    @Override
    public double Area() {
            // TODO Auto-generated method stub
            return (base * altura)/2;
    }

    @Override
    public String toString() {
            return "Triangulo [Area()=" + Area() + "]";
    }
}
