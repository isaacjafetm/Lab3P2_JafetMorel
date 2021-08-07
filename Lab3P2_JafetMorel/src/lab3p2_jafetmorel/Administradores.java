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
public class Administradores extends Usuarios{
    private String puesto;
    private int añoscargo, salario, añosexp;

    public Administradores() {
        super();
    }

    public Administradores(String puesto, int añoscargo, int salario, int añosexp, String usuario, String contraseña, String nombre, String apellido, int ID) {
        super(usuario, contraseña, nombre, apellido, ID);
        this.puesto = puesto;
        this.añoscargo = añoscargo;
        this.salario = salario;
        this.añosexp = añosexp;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getAñoscargo() {
        return añoscargo;
    }

    public void setAñoscargo(int añoscargo) {
        this.añoscargo = añoscargo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getAñosexp() {
        return añosexp;
    }

    public void setAñosexp(int añosexp) {
        this.añosexp = añosexp;
    }

    @Override
    public String toString() {
        return "Administradores{" + "puesto=" + puesto + ", a\u00f1oscargo=" + añoscargo + ", salario=" + salario + ", a\u00f1osexp=" + añosexp + '}';
    }
    
    
}
