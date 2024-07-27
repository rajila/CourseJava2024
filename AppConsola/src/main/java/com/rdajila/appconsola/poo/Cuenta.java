/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rdajila.appconsola.poo;

/**
 *
 * @author rdajila
 */
public class Cuenta {
    private String Nombre;
    private String NroCuenta;
    private double Interes;
    private double Saldo;

    public Cuenta() {}

    public Cuenta(String nombre, String nroCuenta, double interes, double saldo) {
            this.Nombre = nombre;
            this.NroCuenta = nroCuenta;
            this.Interes = interes;
            this.Saldo = saldo;
    }

    public Cuenta (final Cuenta data) {
            this.Nombre = data.Nombre;
            this.NroCuenta = data.NroCuenta;
            this.Interes = data.Interes;
            this.Saldo = data.Saldo;
    }

    /**
     * Se realiza un ingreso a la cuenta
     * @param importe
     * @return
     */
    public boolean Ingreso (double importe) {
            if (importe > 0) {
                    this.Saldo += importe;
                    return true;
            }
            return false;
    }

    /**
     * Se descuenta el importe de la cuenta
     * @param importe
     * @return
     */
    public boolean Reintegro (double importe) {
            if (this.Saldo >= importe && importe > 0 ) {
                    this.Saldo -= importe;
                    return true;
            }
            return false;
    }

    public boolean Transferencia (Cuenta cuentaDestino, double importe) {
            if (this.Reintegro(importe)) {
                    cuentaDestino.Saldo += importe;
                    return true;
            }
            return false;
    }

    public String getNombre() {
            return Nombre;
    }

    public void setNombre(String nombre) {
            Nombre = nombre;
    }

    public String getNroCuenta() {
            return NroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
            NroCuenta = nroCuenta;
    }

    public double getInteres() {
            return Interes;
    }

    public void setInteres(double interes) {
            Interes = interes;
    }

    public double getSaldo() {
            return Saldo;
    }

    public void setSaldo(double saldo) {
            Saldo = saldo;
    }
}
