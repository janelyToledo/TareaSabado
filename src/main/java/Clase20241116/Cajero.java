/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116;

/**
 *
 * @author Janely
 */


public class Cajero {
    private String codigo;
    private String nombre;
    private double totalVentas;

    public Cajero(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.totalVentas = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void registrarVenta(double monto) {
        this.totalVentas += monto;
    }

    @Override
    public String toString() {
        return "Cajero [codigo=" + codigo + ", nombre=" + nombre + ", totalVentas=" + totalVentas + "]";
    }
}
