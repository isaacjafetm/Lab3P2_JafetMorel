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
public class Programadores extends Usuarios{
    private int años, salario;
    private String lenguaje, horario;

    public Programadores() {
        super();
    }

    public Programadores(int años, int salario, String lenguaje, String horario, String usuario, String contraseña, String nombre, String apellido, int ID) {
        super(usuario, contraseña, nombre, apellido, ID);
        this.años = años;
        this.salario = salario;
        this.lenguaje = lenguaje;
        this.horario = horario;
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

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString(){
        return "Programadores{" + "a\u00f1os=" + años + ", salario=" + salario + ", lenguaje=" + lenguaje + ", horario=" + horario + '}';
    }
    
    
    
    
}
