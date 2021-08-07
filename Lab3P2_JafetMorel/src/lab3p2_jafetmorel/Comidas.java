/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_jafetmorel;

import java.util.ArrayList;

/**
 *
 * @author 24661
 */
public class Comidas {
    private int Id;
    private String nombre;
    private int precio, cantidad;
    private ArrayList<Acompañamiento> acompañamientos = new ArrayList();

    public Comidas() {
    }

    public Comidas(int Id, String nombre, int precio, int cantidad) {
        this.Id = Id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ArrayList<Acompañamiento> getAcompañamientos() {
        return acompañamientos;
    }

    public void setAcompañamientos(ArrayList<Acompañamiento> acompañamientos) {
        this.acompañamientos = acompañamientos;
    }

    @Override
    public String toString() {
        return "Comidas{" + "Id=" + Id + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", acompa\u00f1amientos=" + acompañamientos + '}';
    }

}
