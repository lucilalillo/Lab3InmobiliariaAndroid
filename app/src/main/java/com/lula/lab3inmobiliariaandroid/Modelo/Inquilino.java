package com.lula.lab3inmobiliariaandroid.Modelo;

import java.io.Serializable;

public class Inquilino implements Serializable {
    private int idInquilino;
    private String dni;
    private String nombre;
    private String apellido;
    private String lugarDeTrabajo;
    private String mail;
    private String telefono;
    //private String nombreGarante;
    private String telefonoGarante;

    public Inquilino() {
    }

    public Inquilino(int idInquilino, String dni, String nombre, String apellido, String lugarDeTrabajo, String mail, String telefono, String telefonoGarante) {
        this.idInquilino = idInquilino;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.lugarDeTrabajo = lugarDeTrabajo;
        this.mail = mail;
        this.telefono = telefono;
        this.telefonoGarante = telefonoGarante;
    }

    public int getIdInquilino() {
        return idInquilino;
    }

    public void setIdInquilino(int idInquilino) {
        this.idInquilino = idInquilino;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLugarDeTrabajo() {
        return lugarDeTrabajo;
    }

    public void setLugarDeTrabajo(String lugarDeTrabajo) {
        this.lugarDeTrabajo = lugarDeTrabajo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefonoGarante() {
        return telefonoGarante;
    }

    public void setTelefonoGarante(String telefonoGarante) {
        this.telefonoGarante = telefonoGarante;
    }
}
