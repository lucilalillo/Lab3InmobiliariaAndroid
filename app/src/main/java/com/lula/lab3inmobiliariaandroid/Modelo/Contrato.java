package com.lula.lab3inmobiliariaandroid.Modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class Contrato implements Serializable {
    private int id;
    private LocalDate fecInicio;
    private LocalDate fecFin;
    private double monto;
    private Inquilino inquilino;
    private Inmueble inmueble;

    public Contrato() {
    }

    public Contrato(int id, LocalDate fecInicio, LocalDate fecFin, double monto, Inquilino inquilino, Inmueble inmueble) {
        this.id = id;
        this.fecInicio = fecInicio;
        this.fecFin = fecFin;
        this.monto = monto;
        this.inquilino = inquilino;
        this.inmueble = inmueble;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecInicio() {
        return fecInicio;
    }

    public void setFecInicio(LocalDate fecInicio) {
        this.fecInicio = fecInicio;
    }

    public LocalDate getFecFin() {
        return fecFin;
    }

    public void setFecFin(LocalDate fecFin) {
        this.fecFin = fecFin;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }
}
