package com.lula.lab3inmobiliariaandroid.Modelo;

import java.io.Serializable;

public class Propietario implements Serializable {
    private int id;
    private String dni;
    private String nombre;
    private String apellido;
    private String mail;
    private String claveProp;
    private String telefono;
    private String avatar;

    public Propietario() {
    }

    public Propietario(int id, String dni, String nombre, String apellido, String mail, String claveProp, String telefono, String avatar) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.claveProp = claveProp;
        this.telefono = telefono;
        this.avatar = avatar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getClaveProp() {
        return claveProp;
    }

    public void setClaveProp(String claveProp) {
        this.claveProp = claveProp;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
