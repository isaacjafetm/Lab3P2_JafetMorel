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
public class Motoristas extends Usuarios{
    private String puesto;
    private int años, salario, comisiones;
    private String transporte;
    private int encargos;

    public Motoristas() {
        super();
    }

    public Motoristas(String puesto, int años, int salario, int comisiones, String transporte, int encargos, String usuario, String contraseña, String nombre, String apellido, int ID) {
        super(usuario, contraseña, nombre, apellido, ID);
        this.puesto = puesto;
        this.años = años;
        this.salario = salario;
        this.comisiones = comisiones;
        this.transporte = transporte;
        this.encargos = encargos;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getComisiones() {
        return comisiones;
    }

    public void setComisiones(int comisiones) {
        this.comisiones = comisiones;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public int getEncargos() {
        return encargos;
    }

    public void setEncargos(int encargos) {
        this.encargos = encargos;
    }

    @Override
    public String toString() {
        return "Motoristas{" + "puesto=" + puesto + ", a\u00f1os=" + años + ", salario=" + salario + ", comisiones=" + comisiones + ", transporte=" + transporte + ", encargos=" + encargos + '}';
    }

    
    
    
}
