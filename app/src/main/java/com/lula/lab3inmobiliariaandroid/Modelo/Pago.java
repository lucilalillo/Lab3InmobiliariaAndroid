package com.lula.lab3inmobiliariaandroid.Modelo;

import java.io.Serializable;

public class Pago implements Serializable {
    private int id;
    private int numPago;
    private Contrato contrato;
    private double importe;
    private String fechaPago;

    public Pago() {
    }

    public Pago(int id, int numPago, Contrato contrato, double importe, String fechaPago) {
        this.id = id;
        this.numPago = numPago;
        this.contrato = contrato;
        this.importe = importe;
        this.fechaPago = fechaPago;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumPago() {
        return numPago;
    }

    public void setNumPago(int numPago) {
        this.numPago = numPago;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }
}
