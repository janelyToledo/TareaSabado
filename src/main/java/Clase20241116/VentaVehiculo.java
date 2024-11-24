/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116;

/**
 *
 * @author Janely
 */

public class VentaVehiculo {
    private Vehiculo vehiculo;
    private String cliente;
    private String fecha;

    public VentaVehiculo(Vehiculo vehiculo, String cliente, String fecha) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.fecha = fecha;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "VentaVehiculo [vehiculo=" + vehiculo + ", cliente=" + cliente + ", fecha=" + fecha + "]";
    }
}