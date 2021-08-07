/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_jafetmorel;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 24661
 */
public class Lab3P2_JafetMorel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Usuarios> usuarios = new ArrayList();
        ArrayList<Restaurante> restaurantes = new ArrayList();
        ArrayList<Tiendas> tiendas = new ArrayList();
        usuarios.add(new Programadores(0, 0, "", "", "david", "1234", "David", "Mejía", 0));
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("Menu:\n"
                    + "1. Ingresar al sistema\n"
                    + "2. Crear nuevo cliente\n"
                    + "3. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese nombre de usuario: ");
                    String nombrelogin = sc.next();
                    System.out.println("Ingrese contraseña del usuario: ");
                    String contralogin = sc.next();
                    for (int i = 0; i < usuarios.size(); i++) {
                        if (usuarios.get(i).getUsuario().equals(nombrelogin) & usuarios.get(i).getContraseña().equals(contralogin)) {

                            if (usuarios.get(i) instanceof Administradores) {
                                int opadmin = 0;
                                while (opadmin != 3) {
                                    System.out.println("¿Que desea hacer?\n"
                                            + "1. Listar su información\n"
                                            + "2. Modificar su información");
                                    opadmin = sc.nextInt();
                                    switch (opadmin) {
                                        case 1:
                                            System.out.println(usuarios.get(i).getUsuario() + " " + usuarios.get(i).getContraseña() + " " + usuarios.get(i).getNombre() + " " + usuarios.get(i).getApellido() + " " + usuarios.get(i).getID() + " " + usuarios.get(i));
                                            break;
                                        case 2:
                                            System.out.println("¿Que desea modificar?\n"
                                                    + "1. Usuarios\n"
                                                    + "2. Contraseña\n"
                                                    + "3. Nombre\n"
                                                    + "4. Apellido"
                                                    + "5. ID\n"
                                                    + "6. Puesto\n"
                                                    + "7. Años que ha tenido en el cargo\n"
                                                    + "8. Salario base\n"//que pinta que pueda subirse su propio salario jajaja
                                                    + "9. Años de experiencia en ventas");
                                            int mod = sc.nextInt();
                                            if (mod < 1 || mod > 9) {
                                                System.out.println("Opcion no válida");
                                            } else {
                                                switch (mod) {
                                                    case 1:
                                                        System.out.println("Ingrese nombre de usuario: ");
                                                        String user = sc.next();
                                                        ((Administradores) usuarios.get(i)).setUsuario(user);
                                                        break;
                                                    case 2:
                                                        System.out.println("Ingrese contraseña de usuario: ");
                                                        String contra = sc.next();
                                                        ((Administradores) usuarios.get(i)).setContraseña(contra);
                                                        break;
                                                    case 3:
                                                        System.out.println("Ingrese su nombre: ");
                                                        String nombre = sc.next();
                                                        ((Administradores) usuarios.get(i)).setNombre(nombre);
                                                        break;
                                                    case 4:
                                                        System.out.println("Ingrese su apellido: ");
                                                        String apellido = sc.next();
                                                        ((Administradores) usuarios.get(i)).setApellido(apellido);
                                                        break;
                                                    case 5:
                                                        System.out.println("Ingrese su ID: ");
                                                        int id = sc.nextInt();
                                                        ((Administradores) usuarios.get(i)).setID(id);
                                                        break;
                                                    case 6:
                                                        System.out.println("Ingrese su puesto: ");
                                                        String puesto = sc.next();
                                                        ((Administradores) usuarios.get(i)).setPuesto(puesto);
                                                        break;
                                                    case 7:
                                                        System.out.println("Ingrese cantidad de años que ha tenido en el cargo ");
                                                        int cargo = sc.nextInt();
                                                        ((Administradores) usuarios.get(i)).setAñoscargo(cargo);
                                                        break;
                                                    case 8:
                                                        System.out.println("Ingrese su salrio base: ");
                                                        int salario = sc.nextInt();
                                                        ((Administradores) usuarios.get(i)).setSalario(salario);
                                                        break;
                                                    case 9:
                                                        System.out.println("Ingrese cantidad de años de experiencia en ventas");
                                                        int exp = sc.nextInt();
                                                        ((Administradores) usuarios.get(i)).setAñosexp(exp);
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            } else if (usuarios.get(i) instanceof Programadores) {
                                int oppro = 0;
                                while (oppro != 5) {
                                    System.out.println("¿Que desea hacer?\n"
                                            + "1. Crear"
                                            + "2. Listar\n"
                                            + "3. Modificar\n"
                                            + "4. Eliminar\n"
                                            + "5. Salir");
                                    oppro = sc.nextInt();
                                    switch (oppro) {
                                        case 1:
                                            System.out.println("¿Que desea agregar?\n"
                                                    + "1. Usuario\n"
                                                    + "2. Restaurante\n"
                                                    + "3. Tienda\n");
                                            int restc = sc.nextInt();
                                            if (restc == 1) {
                                                System.out.println("¿Que tipo de usuario desea crear?\n"
                                                        + "1. Administradores\n"
                                                        + "2. Programadores\n"
                                                        + "3. Motoristas\n"
                                                        + "4. Clientes");
                                                int us = sc.nextInt();
                                                switch (us) {
                                                    case 1:
                                                        System.out.println("Ingrese nombre de usuario: ");
                                                        String user = sc.next();
                                                        System.out.println("Ingrese contraseña de usuario: ");
                                                        String contra = sc.next();
                                                        System.out.println("Ingrese su nombre: ");
                                                        String nombre = sc.next();
                                                        System.out.println("Ingrese su apellido: ");
                                                        String apellido = sc.next();
                                                        System.out.println("Ingrese su ID: ");
                                                        int id = sc.nextInt();
                                                        System.out.println("Ingrese su puesto: ");
                                                        String puesto = sc.next();
                                                        System.out.println("Ingrese cantidad de años que ha tenido en el cargo ");
                                                        int cargo = sc.nextInt();
                                                        System.out.println("Ingrese su salrio base: ");
                                                        int salario = sc.nextInt();
                                                        System.out.println("Ingrese cantidad de años de experiencia en ventas");
                                                        int exp = sc.nextInt();
                                                        usuarios.add(new Administradores(puesto, cargo, salario, exp, user, contra, nombre, apellido, id));
                                                        break;
                                                    case 2:
                                                        System.out.println("Ingrese nombre de usuario: ");
                                                        String userp = sc.next();
                                                        System.out.println("Ingrese contraseña de usuario: ");
                                                        String contrap = sc.next();
                                                        System.out.println("Ingrese su nombre: ");
                                                        String nombrep = sc.next();
                                                        System.out.println("Ingrese su apellido: ");
                                                        String apellidop = sc.next();
                                                        System.out.println("Ingrese su ID: ");
                                                        int idp = sc.nextInt();
                                                        System.out.println("Ingrese cantidad de años que ha tenido en el cargo ");
                                                        int cargop = sc.nextInt();
                                                        System.out.println("Ingrese su salario: ");
                                                        int salariop = sc.nextInt();
                                                        System.out.println("Ingrese el lenguaje de programación que domina: ");
                                                        String lenguaje = sc.next();
                                                        System.out.println("Ingrese su horario de trabajo: ");
                                                        String horario = sc.next();
                                                        usuarios.add(new Programadores(cargop, salariop, lenguaje, horario, userp, contrap, nombrep, apellidop, idp));
                                                        break;
                                                    case 3:
                                                        System.out.println("Ingrese nombre de usuario: ");
                                                        String userm = sc.next();
                                                        System.out.println("Ingrese contraseña de usuario: ");
                                                        String contram = sc.next();
                                                        System.out.println("Ingrese su nombre: ");
                                                        String nombrem = sc.next();
                                                        System.out.println("Ingrese su apellido: ");
                                                        String apellidom = sc.next();
                                                        System.out.println("Ingrese su ID: ");
                                                        int idm = sc.nextInt();
                                                        System.out.println("Ingrese su puesto: ");
                                                        String puestom = sc.next();
                                                        System.out.println("Ingrese cantidad de años que ha tenido en el cargo ");
                                                        int cargom = sc.nextInt();
                                                        System.out.println("Ingrese su salrio base: ");
                                                        int salariom = sc.nextInt();
                                                        System.out.println("Ingrese sus comisiones: ");
                                                        int comisiones = sc.nextInt();
                                                        System.out.println("Ingrese su medio de transporte: ");
                                                        String trans = sc.next();
                                                        System.out.println("Ingrese cantidad de encargos que puede llevar a la vez: ");
                                                        int encargos = sc.nextInt();
                                                        usuarios.add(new Motoristas(puestom, cargom, salariom, comisiones, trans, encargos, userm, contram, nombrem, apellidom, idm));
                                                        break;
                                                    case 4:
                                                        System.out.println("Ingrese nombre de usuario: ");
                                                        String userc = sc.next();
                                                        System.out.println("Ingrese contraseña de usuario: ");
                                                        String contrac = sc.next();
                                                        System.out.println("Ingrese su nombre: ");
                                                        String nombrec = sc.next();
                                                        System.out.println("Ingrese su apellido: ");
                                                        String apellidoc = sc.next();
                                                        System.out.println("Ingrese su ID: ");
                                                        int idc = sc.nextInt();
                                                        System.out.println("Ingrese su domicilio: ");
                                                        sc.nextLine();
                                                        String domicilio = sc.nextLine();
                                                        System.out.println("Ingrese cantidad de veces que ha pededido en la aplicación: ");
                                                        int pedidos = sc.nextInt();
                                                        usuarios.add(new Clientes(domicilio, pedidos, userc, contrac, nombrec, apellidoc, idc));
                                                        break;
                                                }
                                            } else if (restc == 2) {
                                                System.out.println("¿Que desea hacer?\n"
                                                        + "1. Agregar nuevo restaurante\n"
                                                        + "2. Agregar nueva comida a restaurante existente\n"
                                                        + "3. Agregar nuevo acompañante a una comida en un restaurante ya existente?");
                                                int res = sc.nextInt();
                                                switch (res) {
                                                    case 1:
                                                        sc.nextLine();
                                                        System.out.println("Ingrese nombre del restaurante: ");
                                                        String nombre = sc.nextLine();
                                                        System.out.println("Ingrese ubicación del restaurante: ");
                                                        String ubicacion = sc.nextLine();
                                                        System.out.println("Ingrese RTN del restaurante: ");
                                                        int rtn = sc.nextInt();
                                                        sc.nextLine();
                                                        System.out.println("Ingrese slogan dle restaurante: ");
                                                        String slogan = sc.nextLine();
                                                        restaurantes.add(new Restaurante(ubicacion, nombre, rtn, slogan));
                                                        break;
                                                    case 2:
                                                        System.out.println("Ingrese posición del restaurante donde desea añadir comida");
                                                        int posr1 = sc.nextInt();
                                                        if (posr1 < 0 || posr1 >= restaurantes.size()) {
                                                            System.out.println("posición no válida");
                                                        } else {
                                                            System.out.println("Ingrese el id de la comida: ");
                                                            int id = sc.nextInt();
                                                            System.out.println("Ingrese el nombre de la comida: ");
                                                            String nombreco = sc.next();
                                                            System.out.println("Ingrese el precio de la comida: ");
                                                            int precio = sc.nextInt();
                                                            System.out.println("Ingrese cantidad de acompañantes: ");
                                                            int ac = sc.nextInt();
                                                            restaurantes.get(posr1).getComidas().add(new Comidas(id, nombreco, precio, ac));
                                                        }
                                                        break;
                                                    case 3:
                                                        System.out.println("Ingrese posición del restaurante donde desea añadir el acompañante de la comida");
                                                        int posr2 = sc.nextInt();
                                                        if (posr2 < 0 || posr2 >= restaurantes.size()) {
                                                            System.out.println("posición no válida");
                                                        } else {
                                                            System.out.println("Ingrese la posición de la comida donde desea añadir el acompañante: ");
                                                            int posc = sc.nextInt();
                                                            if (posc < 0 || posc >= restaurantes.get(posr2).getComidas().size()) {
                                                                System.out.println("Ingrese el nombre del acompañante");
                                                                String aco = sc.next();
                                                                System.out.println("Ingrese el tipo del acompañante(asado, frito, pan, salsa)");
                                                                String tipo = sc.next();
                                                                System.out.println("Ingresa el precio del acompañante: ");
                                                                int precio = sc.nextInt();
                                                                restaurantes.get(posr2).getComidas().get(posc).getAcompañamientos().add(new Acompañamiento(aco, tipo, precio));
                                                            }
                                                        }
                                                        break;

                                                }
                                            } else if (restc == 3) {
                                                System.out.println("¿Que desea hacer?\n"
                                                        + "1. Agregar una nueva tienda\n"
                                                        + "2. Agregar un nuevo artículo para una tienda ya existente");
                                                int ti = sc.nextInt();
                                                switch (ti) {
                                                    case 1:
                                                        System.out.println("Ingrese nombre de la tienda: ");
                                                        String nombret = sc.next();
                                                        sc.nextLine();
                                                        System.out.println("Ingrese la ubicación más cercana: ");
                                                        String ub = sc.nextLine();
                                                        System.out.println("Ingrese cantidad de empleados: ");
                                                        int can = sc.nextInt();
                                                        System.out.println("Ingrese cantidad de minutos de espera de preparación de un artículo: ");
                                                        int tiempo = sc.nextInt();
                                                        tiendas.add(new Tiendas(nombret, ub, can, tiempo));
                                                        break;
                                                    case 2:
                                                        System.out.println("Ingrese posición de la tienda a la cual desea agregar artículo");
                                                        int post = sc.nextInt();
                                                        if (post < 0 || post >= tiendas.size()) {
                                                            System.out.println("Posición no válida");
                                                        } else {
                                                            System.out.println("Ingrese el nombre del artículo: ");
                                                            String nombrea = sc.next();
                                                            System.out.println("Ingrese categoría(limpieza, ocio, lectura, otro): ");
                                                            String categ = sc.next();
                                                            System.out.println("Ingrese el precio del artículo: ");
                                                            int precio = sc.nextInt();
                                                            tiendas.get(post).getArticulos().add(new Articulos(nombrea, categ, precio));
                                                        }
                                                        break;
                                                }
                                            } else {
                                                System.out.println("Opción no válida.");
                                            }
                                            break;
                                        case 2:
                                            System.out.println("¿Que desea listar?\n"
                                                    + "1. Usuarios\n"
                                                    + "2. Tiendas\n"
                                                    + "3. Restaurantes");
                                            int list = sc.nextInt();
                                            if (list < 1 || list > 3) {
                                                System.out.println("opción no válida");
                                            } else {
                                                switch (list) {
                                                    case 1:
                                                        for (Usuarios usuario : usuarios) {
                                                            System.out.println(usuario);
                                                        }
                                                        break;
                                                    case 2:
                                                        for (Tiendas tienda : tiendas) {
                                                            System.out.println(tienda);
                                                        }
                                                        break;
                                                    case 3:
                                                        for (Restaurante restaurante : restaurantes) {
                                                            System.out.println(restaurante);
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        case 3:
                                            System.out.println("¿Que desea modificar?\n"
                                                    + "1. Usuarios\n"
                                                    + "2. Tiendas\n"
                                                    + "3. Restaurantes");
                                            int mod = sc.nextInt();
                                            if (mod < 1 || mod > 3) {
                                                System.out.println("Opción no válida");
                                            } else {
                                                switch (mod) {
                                                    case 1:
                                                        System.out.println("Ingrese posicion del usuario que desea modificar: ");
                                                        int posus = sc.nextInt();
                                                        if (posus < 0 || posus >= usuarios.size()) {
                                                            System.out.println("Posción no válida");
                                                        } else {
                                                            if (usuarios.get(posus) instanceof Administradores) {
                                                                System.out.println("¿Que desea modificar?\n"
                                                                        + "1. Usuarios\n"
                                                                        + "2. Contraseña\n"
                                                                        + "3. Nombre\n"
                                                                        + "4. Apellido"
                                                                        + "5. ID\n"
                                                                        + "6. Puesto\n"
                                                                        + "7. Años que ha tenido en el cargo\n"
                                                                        + "8. Salario base\n"
                                                                        + "9. Años de experiencia en ventas");
                                                                int mod1 = sc.nextInt();
                                                                if (mod1 < 1 || mod1 > 9) {
                                                                    System.out.println("Opcion no válida");
                                                                } else {
                                                                    switch (mod1) {
                                                                        case 1:
                                                                            System.out.println("Ingrese nombre de usuario: ");
                                                                            String user = sc.next();
                                                                            ((Administradores) usuarios.get(posus)).setUsuario(user);
                                                                            break;
                                                                        case 2:
                                                                            System.out.println("Ingrese contraseña de usuario: ");
                                                                            String contra = sc.next();
                                                                            ((Administradores) usuarios.get(posus)).setContraseña(contra);
                                                                            break;
                                                                        case 3:
                                                                            System.out.println("Ingrese su nombre: ");
                                                                            String nombre = sc.next();
                                                                            ((Administradores) usuarios.get(posus)).setNombre(nombre);
                                                                            break;
                                                                        case 4:
                                                                            System.out.println("Ingrese su apellido: ");
                                                                            String apellido = sc.next();
                                                                            ((Administradores) usuarios.get(posus)).setApellido(apellido);
                                                                            break;
                                                                        case 5:
                                                                            System.out.println("Ingrese su ID: ");
                                                                            int id = sc.nextInt();
                                                                            ((Administradores) usuarios.get(posus)).setID(id);
                                                                            break;
                                                                        case 6:
                                                                            System.out.println("Ingrese su puesto: ");
                                                                            String puesto = sc.next();
                                                                            ((Administradores) usuarios.get(posus)).setPuesto(puesto);
                                                                            break;
                                                                        case 7:
                                                                            System.out.println("Ingrese cantidad de años que ha tenido en el cargo ");
                                                                            int cargo = sc.nextInt();
                                                                            ((Administradores) usuarios.get(posus)).setAñoscargo(cargo);
                                                                            break;
                                                                        case 8:
                                                                            System.out.println("Ingrese su salrio base: ");
                                                                            int salario = sc.nextInt();
                                                                            ((Administradores) usuarios.get(posus)).setSalario(salario);
                                                                            break;
                                                                        case 9:
                                                                            System.out.println("Ingrese cantidad de años de experiencia en ventas");
                                                                            int exp = sc.nextInt();
                                                                            ((Administradores) usuarios.get(posus)).setAñosexp(exp);
                                                                            break;
                                                                    }
                                                                }
                                                            } else if (usuarios.get(posus) instanceof Programadores) {
                                                                System.out.println("¿Que desea modificar?\n"
                                                                        + "1. Usuario\n"
                                                                        + "2. Contraseña\n"
                                                                        + "3. Nombre\n"
                                                                        + "4. Apellido\n"
                                                                        + "5. ID\n"
                                                                        + "6. Años en el cargo\n"
                                                                        + "7. Salario\n"
                                                                        + "8. Lenguaje de programación que domina\n"
                                                                        + "9. Horario de trabajo");
                                                                int mod4 = sc.nextInt();
                                                                if (mod4<1||mod4>9) {
                                                                    System.out.println("Opción no válida");
                                                                } else {
                                                                    switch (mod4) {
                                                                        case 1:
                                                                            System.out.println("Ingrese nombre de usuario: ");
                                                                            String userp = sc.next();
                                                                            ((Programadores) usuarios.get(posus)).setUsuario(userp);
                                                                            break;
                                                                        case 2:
                                                                            System.out.println("Ingrese contraseña de usuario: ");
                                                                            String contrap = sc.next();
                                                                            ((Programadores) usuarios.get(posus)).setContraseña(contrap);
                                                                            break;
                                                                        case 3:
                                                                            System.out.println("Ingrese su nombre: ");
                                                                            String nombrep = sc.next();
                                                                            ((Programadores) usuarios.get(posus)).setNombre(nombrep);
                                                                            break;
                                                                        case 4:
                                                                            System.out.println("Ingrese su apellido: ");
                                                                            String apellidop = sc.next();
                                                                            ((Programadores) usuarios.get(posus)).setApellido(apellidop);
                                                                            break;
                                                                        case 5:
                                                                            System.out.println("Ingrese su ID: ");
                                                                            int idp = sc.nextInt();
                                                                            ((Programadores) usuarios.get(posus)).setID(idp);
                                                                            break;
                                                                        case 6:
                                                                            System.out.println("Ingrese cantidad de años que ha tenido en el cargo ");
                                                                            int cargop = sc.nextInt();
                                                                            ((Programadores) usuarios.get(posus)).setAños(cargop);
                                                                            break;
                                                                        case 7:
                                                                            System.out.println("Ingrese su salario: ");
                                                                            int salariop = sc.nextInt();
                                                                            ((Programadores) usuarios.get(posus)).setSalario(salariop);
                                                                            break;
                                                                        case 8:
                                                                            System.out.println("Ingrese el lenguaje de programación que domina: ");
                                                                            String lenguaje = sc.next();
                                                                            ((Programadores) usuarios.get(posus)).setLenguaje(lenguaje);
                                                                            break;
                                                                        case 9:
                                                                            System.out.println("Ingrese su horario de trabajo: ");
                                                                            String horario = sc.next();
                                                                            ((Programadores) usuarios.get(posus)).setHorario(horario);
                                                                            break;
                                                                    }
                                                                }
                                                            } else if (usuarios.get(posus) instanceof Motoristas) {
                                                                System.out.println("¿Que desea modificar?\n"
                                                                        + "1. Usuarios\n"
                                                                        + "2. Contraseña\n"
                                                                        + "3. Nombre\n"
                                                                        + "4. Apellido"
                                                                        + "5. ID\n"
                                                                        + "6. Puesto\n"
                                                                        + "7. Años que ha tenido en el cargo\n"
                                                                        + "8. Salario base\n"
                                                                        + "9. Comisiones\n"
                                                                        + "10. Medio de transporte\n"
                                                                        + "11. Cantidad de encargos que puede llevar a la vez\n");
                                                                int mod2 = sc.nextInt();
                                                                if (mod2 < 1 || mod2 > 11) {
                                                                    System.out.println("Opcion no válida");
                                                                } else {
                                                                    switch (mod2) {
                                                                        case 1:
                                                                            System.out.println("Ingrese nombre de usuario: ");
                                                                            String user = sc.next();
                                                                            ((Motoristas) usuarios.get(posus)).setUsuario(user);
                                                                            break;
                                                                        case 2:
                                                                            System.out.println("Ingrese contraseña de usuario: ");
                                                                            String contra = sc.next();
                                                                            ((Motoristas) usuarios.get(posus)).setContraseña(contra);
                                                                            break;
                                                                        case 3:
                                                                            System.out.println("Ingrese su nombre: ");
                                                                            String nombre = sc.next();
                                                                            ((Motoristas) usuarios.get(posus)).setNombre(nombre);
                                                                            break;
                                                                        case 4:
                                                                            System.out.println("Ingrese su apellido: ");
                                                                            String apellido = sc.next();
                                                                            ((Motoristas) usuarios.get(posus)).setApellido(apellido);
                                                                            break;
                                                                        case 5:
                                                                            System.out.println("Ingrese su ID: ");
                                                                            int id = sc.nextInt();
                                                                            ((Motoristas) usuarios.get(posus)).setID(id);
                                                                            break;
                                                                        case 6:
                                                                            System.out.println("Ingrese su puesto: ");
                                                                            String puesto = sc.next();
                                                                            ((Motoristas) usuarios.get(posus)).setPuesto(puesto);
                                                                            break;
                                                                        case 7:
                                                                            System.out.println("Ingrese cantidad de años que ha tenido en el cargo ");
                                                                            int cargo = sc.nextInt();
                                                                            ((Motoristas) usuarios.get(posus)).setAños(cargo);
                                                                            break;
                                                                        case 8:
                                                                            System.out.println("Ingrese su salrio base: ");
                                                                            int salario = sc.nextInt();
                                                                            ((Motoristas) usuarios.get(posus)).setSalario(salario);
                                                                            break;
                                                                        case 9:
                                                                            System.out.println("Ingrese sus comisiones: ");
                                                                            int comisiones = sc.nextInt();
                                                                            ((Motoristas) usuarios.get(posus)).setComisiones(comisiones);
                                                                            break;
                                                                        case 10:
                                                                            System.out.println("Ingrese su medio de transporte: ");
                                                                            String trans = sc.next();
                                                                            ((Motoristas) usuarios.get(posus)).setTransporte(trans);
                                                                            break;
                                                                        case 11:
                                                                            System.out.println("Ingrese cantidad de encargos que puede llevar a la vez: ");
                                                                            int encargos = sc.nextInt();
                                                                            ((Motoristas) usuarios.get(posus)).setEncargos(encargos);
                                                                            break;
                                                                    }
                                                                }
                                                            } else if (usuarios.get(posus) instanceof Clientes) {
                                                                System.out.println("¿Que desea modificar?\n"
                                                                        + "1. Usuarios\n"
                                                                        + "2. Contraseña\n"
                                                                        + "3. Nombre\n"
                                                                        + "4. Apellido"
                                                                        + "5. ID\n"
                                                                        + "6. Domicilio\n"
                                                                        + "7. Cantidad de veces que ha pededido en la aplicación\n");
                                                                int mod3 = sc.nextInt();
                                                                if (mod3 < 1 || mod3 > 7) {
                                                                    System.out.println("Opcion no válida");
                                                                } else {
                                                                    switch (mod3) {
                                                                        case 1:
                                                                            System.out.println("Ingrese nombre de usuario: ");
                                                                            String user = sc.next();
                                                                            ((Clientes) usuarios.get(posus)).setUsuario(user);
                                                                            break;
                                                                        case 2:
                                                                            System.out.println("Ingrese contraseña de usuario: ");
                                                                            String contra = sc.next();
                                                                            ((Clientes) usuarios.get(posus)).setContraseña(contra);
                                                                            break;
                                                                        case 3:
                                                                            System.out.println("Ingrese su nombre: ");
                                                                            String nombre = sc.next();
                                                                            ((Clientes) usuarios.get(posus)).setNombre(nombre);
                                                                            break;
                                                                        case 4:
                                                                            System.out.println("Ingrese su apellido: ");
                                                                            String apellido = sc.next();
                                                                            ((Clientes) usuarios.get(posus)).setApellido(apellido);
                                                                            break;
                                                                        case 5:
                                                                            System.out.println("Ingrese su ID: ");
                                                                            int id = sc.nextInt();
                                                                            ((Clientes) usuarios.get(posus)).setID(id);
                                                                            break;
                                                                        case 6:
                                                                            System.out.println("Ingrese su domicilio: ");
                                                                            sc.nextLine();
                                                                            String domicilio = sc.nextLine();
                                                                            ((Clientes) usuarios.get(posus)).setDomicilio(domicilio);
                                                                            break;
                                                                        case 7:
                                                                            System.out.println("Ingrese cantidad de veces que ha pededido en la aplicación: ");
                                                                            int pedidos = sc.nextInt();
                                                                            ((Clientes) usuarios.get(posus)).setPedidos(pedidos);
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    case 2:

                                                        break;
                                                    case 3:

                                                        break;
                                                }
                                            }
                                            break;
                                        case 4:
                                            System.out.println("¿Que desea eliminar?\n"
                                                    + "1. Usuarios\n"
                                                    + "2. Tiendas\n"
                                                    + "3. Restaurantes");
                                            int elim = sc.nextInt();
                                            if (elim < 1 || elim > 3) {
                                                System.out.println("Opción no válida");
                                            } else {
                                                switch (elim) {
                                                    case 1:
                                                        System.out.println("Ingrese la posición que desea eliminar: ");
                                                        int pose1 = sc.nextInt();
                                                        if (pose1 < 0 || pose1 >= usuarios.size()) {
                                                            System.out.println("Posición no válida");
                                                        } else {
                                                            usuarios.remove(pose1);
                                                        }
                                                        break;
                                                    case 2:
                                                        System.out.println("Ingrese la posición que desea eliminar: ");
                                                        int pose2 = sc.nextInt();
                                                        if (pose2 < 0 || pose2 >= usuarios.size()) {
                                                            System.out.println("Posición no válida");
                                                        } else {
                                                            tiendas.remove(pose2);
                                                        }
                                                        break;
                                                    case 3:
                                                        System.out.println("Ingrese la posición que desea eliminar: ");
                                                        int pose3 = sc.nextInt();
                                                        if (pose3 < 0 || pose3 >= usuarios.size()) {
                                                            System.out.println("Posición no válida");
                                                        } else {
                                                            restaurantes.remove(pose3);
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                            } else if (usuarios.get(i) instanceof Motoristas) {
                                int opmot = 0;
                                while (opmot != 3) {
                                    System.out.println("¿Que desea hacer?\n"
                                            + "1. Listar su información\n"
                                            + "2. Modificar su información");
                                    opmot = sc.nextInt();
                                    switch (opmot) {
                                        case 1:
                                            System.out.println(usuarios.get(i).getUsuario() + " " + usuarios.get(i).getContraseña() + " " + usuarios.get(i).getNombre() + " " + usuarios.get(i).getApellido() + "v" + usuarios.get(i).getID() + " " + usuarios.get(i));
                                            break;
                                        case 2:
                                            System.out.println("¿Que desea modificar?\n"
                                                    + "1. Usuarios\n"
                                                    + "2. Contraseña\n"
                                                    + "3. Nombre\n"
                                                    + "4. Apellido"
                                                    + "5. ID\n"
                                                    + "6. Puesto\n"
                                                    + "7. Años que ha tenido en el cargo\n"
                                                    + "8. Salario base\n"//que pinta que pueda subirse su propio salario jajaja
                                                    + "9. Comisiones\n"
                                                    + "10. Medio de transporte\n"
                                                    + "11. Cantidad de encargos que puede llevar a la vez\n");
                                            int mod = sc.nextInt();
                                            if (mod < 1 || mod > 11) {
                                                System.out.println("Opcion no válida");
                                            } else {
                                                switch (mod) {
                                                    case 1:
                                                        System.out.println("Ingrese nombre de usuario: ");
                                                        String user = sc.next();
                                                        ((Motoristas) usuarios.get(i)).setUsuario(user);
                                                        break;
                                                    case 2:
                                                        System.out.println("Ingrese contraseña de usuario: ");
                                                        String contra = sc.next();
                                                        ((Motoristas) usuarios.get(i)).setContraseña(contra);
                                                        break;
                                                    case 3:
                                                        System.out.println("Ingrese su nombre: ");
                                                        String nombre = sc.next();
                                                        ((Motoristas) usuarios.get(i)).setNombre(nombre);
                                                        break;
                                                    case 4:
                                                        System.out.println("Ingrese su apellido: ");
                                                        String apellido = sc.next();
                                                        ((Motoristas) usuarios.get(i)).setApellido(apellido);
                                                        break;
                                                    case 5:
                                                        System.out.println("Ingrese su ID: ");
                                                        int id = sc.nextInt();
                                                        ((Motoristas) usuarios.get(i)).setID(id);
                                                        break;
                                                    case 6:
                                                        System.out.println("Ingrese su puesto: ");
                                                        String puesto = sc.next();
                                                        ((Motoristas) usuarios.get(i)).setPuesto(puesto);
                                                        break;
                                                    case 7:
                                                        System.out.println("Ingrese cantidad de años que ha tenido en el cargo ");
                                                        int cargo = sc.nextInt();
                                                        ((Motoristas) usuarios.get(i)).setAños(cargo);
                                                        break;
                                                    case 8:
                                                        System.out.println("Ingrese su salrio base: ");
                                                        int salario = sc.nextInt();
                                                        ((Motoristas) usuarios.get(i)).setSalario(salario);
                                                        break;
                                                    case 9:
                                                        System.out.println("Ingrese sus comisiones: ");
                                                        int comisiones = sc.nextInt();
                                                        ((Motoristas) usuarios.get(i)).setComisiones(comisiones);
                                                        break;
                                                    case 10:
                                                        System.out.println("Ingrese su medio de transporte: ");
                                                        String trans = sc.next();
                                                        ((Motoristas) usuarios.get(i)).setTransporte(trans);
                                                        break;
                                                    case 11:
                                                        System.out.println("Ingrese cantidad de encargos que puede llevar a la vez: ");
                                                        int encargos = sc.nextInt();
                                                        ((Motoristas) usuarios.get(i)).setEncargos(encargos);
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                                //fin motoristas
                            } else if (usuarios.get(i) instanceof Clientes) {
                                int opcli = 0;
                                while (opcli != 5) {
                                    System.out.println("¿Que desea hacer?\n"
                                            + "1. Listar su información\n"
                                            + "2. Modificar su información\n"
                                            + "3. Eliminar su cuenta\n"
                                            + "4. Hacer un pedido\n"
                                            + "5. Salir");
                                    opcli = sc.nextInt();
                                    switch (opcli) {
                                        case 1:
                                            System.out.println(usuarios.get(i).getUsuario() + " " + usuarios.get(i).getContraseña() + " " + usuarios.get(i).getNombre() + " " + usuarios.get(i).getApellido() + "v" + usuarios.get(i).getID() + " " + usuarios.get(i));
                                            break;
                                        case 2:
                                            System.out.println("¿Que desea modificar?\n"
                                                    + "1. Usuarios\n"
                                                    + "2. Contraseña\n"
                                                    + "3. Nombre\n"
                                                    + "4. Apellido"
                                                    + "5. ID\n"
                                                    + "6. Domicilio\n"
                                                    + "7. Cantidad de veces que ha pededido en la aplicación\n");
                                            int mod = sc.nextInt();
                                            if (mod < 1 || mod > 7) {
                                                System.out.println("Opcion no válida");
                                            } else {
                                                switch (mod) {
                                                    case 1:
                                                        System.out.println("Ingrese nombre de usuario: ");
                                                        String user = sc.next();
                                                        ((Clientes) usuarios.get(i)).setUsuario(user);
                                                        break;
                                                    case 2:
                                                        System.out.println("Ingrese contraseña de usuario: ");
                                                        String contra = sc.next();
                                                        ((Clientes) usuarios.get(i)).setContraseña(contra);
                                                        break;
                                                    case 3:
                                                        System.out.println("Ingrese su nombre: ");
                                                        String nombre = sc.next();
                                                        ((Clientes) usuarios.get(i)).setNombre(nombre);
                                                        break;
                                                    case 4:
                                                        System.out.println("Ingrese su apellido: ");
                                                        String apellido = sc.next();
                                                        ((Clientes) usuarios.get(i)).setApellido(apellido);
                                                        break;
                                                    case 5:
                                                        System.out.println("Ingrese su ID: ");
                                                        int id = sc.nextInt();
                                                        ((Clientes) usuarios.get(i)).setID(id);
                                                        break;
                                                    case 6:
                                                        System.out.println("Ingrese su domicilio: ");
                                                        sc.nextLine();
                                                        String domicilio = sc.nextLine();
                                                        ((Clientes) usuarios.get(i)).setDomicilio(domicilio);
                                                        break;
                                                    case 7:
                                                        System.out.println("Ingrese cantidad de veces que ha pededido en la aplicación: ");
                                                        int pedidos = sc.nextInt();
                                                        ((Clientes) usuarios.get(i)).setPedidos(pedidos);
                                                        break;
                                                }
                                            }
                                            break;
                                        case 3:
                                            System.out.println("Se ha eliminado su propia cuenta con éxito.");
                                            usuarios.remove(i);
                                            opcli = 5;
                                            break;
                                        case 4:
                                            System.out.println("De donde desea pedir?");
                                            break;
                                    }
                                }
                            }
                        }
                    }
                    break;

                case 2:
                    System.out.println("Ingrese su nombre de usuario: ");
                    String userc = sc.next();
                    System.out.println("Ingrese su nombre de contraseña: ");
                    String contrac = sc.next();
                    System.out.println("Ingrese su nombre: ");
                    String nombrec = sc.next();
                    System.out.println("Ingrese su apellido: ");
                    String apellidoc = sc.next();
                    System.out.println("Ingrese su ID: ");
                    int idc = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese su domicilio: ");
                    String domicilio = sc.nextLine();
                    System.out.println("Ingrese la cantidad de veces que ha pedido en la aplicación: ");
                    int cantidad = sc.nextInt();
                    usuarios.add(new Clientes(domicilio, cantidad, userc, contrac, nombrec, apellidoc, idc));
                    break;

            }
        }
    }

}
