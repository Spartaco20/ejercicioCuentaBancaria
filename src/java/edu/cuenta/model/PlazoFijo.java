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
public class PlazoFijo extends Cuenta {
    
    private int plazo = 0;
    private double interes = 0;
    private String valorInteres = "";
    private double valorTotal = 0;

    public PlazoFijo() {
    }

    public PlazoFijo(String titular, int cantidad, int plazo, String valorInteres, double interes, double valorTotal) {
        super(titular, cantidad);
        this.plazo = plazo;
        this.interes = interes;
        this.valorInteres = valorInteres;
        this.valorTotal = valorTotal;
    }

    public double importeInteres() {
        if(this.plazo == 1){
            double vI = 2.15;
            this.valorInteres = "2.15";
            this.interes = (this.getCantidad() * vI)/100;
            this.valorTotal = this.getCantidad() + this.interes;
        } else {
            if(this.plazo == 2) {
                double vI = 3.25;
                this.valorInteres = "3.25";
                this.interes = (this.getCantidad() * vI)/100;
                this.valorTotal = this.getCantidad() + this.interes;
            } else {
                if(this.plazo == 3) {
                    double vI = 4.06;
                    this.valorInteres = "4.06";
                    this.interes = (this.getCantidad() * vI)/100;
                    this.valorTotal = this.getCantidad() + this.interes;
                } else {
                    if(this.plazo == 4) {
                        double vI = 5.10;
                        this.valorInteres = "5.10";
                        this.interes = (this.getCantidad() * vI)/100;
                        this.valorTotal = this.getCantidad() + this.interes;
                    }
                }
            }
        }
        return valorTotal;
    }
    
    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public String getValorInteres() {
        return valorInteres;
    }

    public void setValorInteres(String valorInteres) {
        this.valorInteres = valorInteres;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}
