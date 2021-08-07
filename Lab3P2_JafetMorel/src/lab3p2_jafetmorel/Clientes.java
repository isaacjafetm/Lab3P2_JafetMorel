/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_jafetmorel;

/**
 *
 * @author 24661
 */
public class Clientes extends Usuarios{
    private String domicilio;
    private int pedidos;

    public Clientes() {
        super();
    }

    public Clientes(String domicilio, int pedidos, String usuario, String contraseña, String nombre, String apellido, int ID) {
        super(usuario, contraseña, nombre, apellido, ID);
        this.domicilio = domicilio;
        this.pedidos = pedidos;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getPedidos() {
        return pedidos;
    }

    public void setPedidos(int pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "Clientes{" + "domicilio=" + domicilio + ", pedidos=" + pedidos + '}';
    }
    
    
}
