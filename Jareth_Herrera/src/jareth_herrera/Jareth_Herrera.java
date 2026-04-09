/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jareth_herrera;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Jareth_Herrera {

    public static Habitacion Cuarto[][] = new Habitacion[3][3];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        inicializarHotel();
        menu();

    }

    public static void menu() {
        int opc = Integer.parseInt(JOptionPane.showInputDialog("==BIENVENIDO AL SISTEMA DE GESTION DE RESERVAS DE HOTEL=="
                + "\nSeleccione la opcion necesaria"
                + "\n1. Ver habitaciones"
                + "\n2. Modificar Habitacion"
                + "\n3. Resumen del estado del hotel"));

        if (opc == 1) {
            mostrarMapa();
        }
        if (opc == 2) {
            Modificar();
        }
    }

    public static void inicializarHotel() {
        String[] letras = {"01", "02", "03"};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                String nombre = (i + 1) + letras[j];

                if (i == 0) {
                    Cuarto[i][j] = new Habitacion(nombre, "Simple", 100, "Ocupada");
                } else if (i == 1) {
                    Cuarto[i][j] = new Habitacion(nombre, "Doble", 300, "Libre");
                } else {
                    Cuarto[i][j] = new Habitacion(nombre, "Premium", 500, "Sucia");
                }
            }
        }
        menu();
    }

    public static void mostrarMapa() {
        String salida = "";

        for (int i = 0; i < 3; i++) {
            salida += "Piso " + (i + 1) + "\n";

            for (int j = 0; j < 3; j++) {
                Habitacion amar = Cuarto[i][j];
                salida += amar.numero + " - " + amar.tipo + " - "
                        + amar.Precio + "$" + " " + amar.Estado + "\n";
            }

            salida += "-------------------\n";
        }

        JOptionPane.showMessageDialog(null, salida);

    }

    public static void Modificar() {
        String[] letras = {"01", "02", "03"};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                String nombre = (i + 1) + letras[j];

                int opc2 = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese que piso desea modificar"));

                if (opc2 == 1) {

                    int opc3 = Integer.parseInt(JOptionPane.showInputDialog("Que desea modificar? "
                            + "\n1. Estado"
                            + "\n2. Tipo"
                            + "\n3. Precio"));

                    if (opc3 == 1) {
                        int opc4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo estado"
                                + "\n1.Libre"
                                + "\n2.Ocupada"
                                + "\n3.Sucia"));
                        if (opc4 == 1) {
                            Cuarto[0][0] = new Habitacion(nombre, "Simple", 100, "Libre");
                            menu();
                        }
                        if (opc4 == 2) {
                            Cuarto[0][0] = new Habitacion(nombre, "Simple", 100, "Ocupada");
                            menu();
                        }
                        if (opc4 == 3) {
                            Cuarto[0][0] = new Habitacion(nombre, "Simple", 100, "Sucia");
                            menu();
                        }

                    }
                    if (opc3 == 2) {
                        opc3 = Integer.parseInt(JOptionPane.showInputDialog("Que desea modificar? "
                                + "\n1. Estado"
                                + "\n2. Tipo"
                                + "\n3. Precio"));

                        if (opc3 == 1) {
                            int opc4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo estado"
                                    + "\n1.Libre"
                                    + "\n2.Ocupada"
                                    + "\n3.Sucia"));
                            if (opc4 == 1) {
                                Cuarto[0][0] = new Habitacion(nombre, "Simple", 100, "Libre");
                                menu();
                            }
                            if (opc4 == 2) {
                                Cuarto[0][0] = new Habitacion(nombre, "Simple", 100, "Ocupada");
                                menu();
                            }
                            if (opc4 == 3) {
                                Cuarto[0][0] = new Habitacion(nombre, "Simple", 100, "Sucia");
                                menu();
                            }
                        }

                    }
                    if (opc3 == 3) {
                        opc3 = Integer.parseInt(JOptionPane.showInputDialog("Que desea modificar? "
                                + "\n1. Estado"
                                + "\n2. Tipo"
                                + "\n3. Precio"));

                        if (opc3 == 1) {
                            int opc4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo estado"
                                    + "\n1.Libre"
                                    + "\n2.Ocupada"
                                    + "\n3.Sucia"));
                            if (opc4 == 1) {
                                Cuarto[0][0] = new Habitacion(nombre, "Simple", 100, "Libre");
                                menu();
                            }
                            if (opc4 == 2) {
                                Cuarto[0][0] = new Habitacion(nombre, "Simple", 100, "Ocupada");
                                menu();
                            }
                            if (opc4 == 3) {
                                Cuarto[0][0] = new Habitacion(nombre, "Simple", 100, "Sucia");
                                menu();
                            }
                        }
                    }
                }
            }
        }
    }
}
