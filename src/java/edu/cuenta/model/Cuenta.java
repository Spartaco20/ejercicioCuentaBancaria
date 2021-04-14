/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuenta.model;

/**
 *
 * @author HP
 */
public class Cuenta {
    
    private String titular = "";
    private int cantidad = 0;

    public Cuenta() {
    }

    public Cuenta(String titular, int cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    public void imprimirDatos(){
        
    }
    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
