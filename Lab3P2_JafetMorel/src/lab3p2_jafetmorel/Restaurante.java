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
public class Restaurante {
    private String ubicacion, nombre;
    private int RTN;
    private String slogan;
    private ArrayList<Comidas> comidas = new ArrayList();

    public Restaurante() {
    }

    public Restaurante(String ubicacion, String nombre, int RTN, String slogan) {
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.RTN = RTN;
        this.slogan = slogan;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRTN() {
        return RTN;
    }

    public void setRTN(int RTN) {
        this.RTN = RTN;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public ArrayList<Comidas> getComidas() {
        return comidas;
    }

    public void setComidas(ArrayList<Comidas> comidas) {
        this.comidas = comidas;
    }

    @Override
    public String toString() {
        return "Restaurante{" + "ubicacion=" + ubicacion + ", nombre=" + nombre + ", RTN=" + RTN + ", slogan=" + slogan + ", comidas=" + comidas + '}';
    }
    
}
