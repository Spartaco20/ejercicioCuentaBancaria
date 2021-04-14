/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuenta.controller;

import edu.cuenta.model.CajaAhorro;
import edu.cuenta.model.PlazoFijo;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author HP
 */
@ManagedBean
@SessionScoped
public class ProcesoCuenta implements Serializable{

    private CajaAhorro ca = new CajaAhorro();
    private PlazoFijo pf = new PlazoFijo();
    private ArrayList<PlazoFijo> listaIntereses = new ArrayList<>();
    
    public ProcesoCuenta() {
    }

    public void calculoInteres(){
        ca.mostrarInfo();
        pf.importeInteres();
        listaIntereses.add(new PlazoFijo(pf.getTitular(), pf.getCantidad(), pf.getPlazo(), pf.getValorInteres(), pf.getInteres(), pf.getValorTotal()));
    }
    
    public CajaAhorro getCa() {
        return ca;
    }

    public void setCa(CajaAhorro ca) {
        this.ca = ca;
    }

    public PlazoFijo getPf() {
        return pf;
    }

    public void setPf(PlazoFijo pf) {
        this.pf = pf;
    }

    public ArrayList<PlazoFijo> getListaIntereses() {
        return listaIntereses;
    }

    public void setListaIntereses(ArrayList<PlazoFijo> listaIntereses) {
        this.listaIntereses = listaIntereses;
    }
    
}
