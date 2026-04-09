/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jareth_herrera;

/**
 *
 * @author Laboratorio
 */
public class Habitacion {

    String numero;
    String tipo; //Simple o doble
    int Precio;
    String Estado; // Libre, Ocupada o Sucia

    public Habitacion(String numero, String tipo, int Precio, String Estado) {
        this.numero = numero;
        this.tipo = tipo;
        this.Precio = Precio;
        this.Estado = Estado;

    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
}
