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
public class Tiendas {
    private String nombre, ubicacion;
    private int empleados, timpo;
    private ArrayList<Articulos> articulos = new ArrayList();

    public Tiendas() {
    }

    public Tiendas(String nombre, String ubicacion, int empleados, int timpo) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.empleados = empleados;
        this.timpo = timpo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getEmpleados() {
        return empleados;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    public int getTimpo() {
        return timpo;
    }

    public void setTimpo(int timpo) {
        this.timpo = timpo;
    }

    public ArrayList<Articulos> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulos> articulos) {
        this.articulos = articulos;
    }

    @Override
    public String toString() {
        return "Tiendas{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", empleados=" + empleados + ", timpo=" + timpo + ", articulos=" + articulos + '}';
    }
    
    
}
