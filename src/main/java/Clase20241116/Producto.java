/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116;

/**
 *
 * @author Janely
 */
public class Producto {
    public Producto(String Color, String Marca, String Modelo) {
        this.Color = Color;
        this.Marca = Marca;
        this.Modelo = Modelo;
    }
    private String Color;
    private String Marca;
    private  String Modelo;
    


    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
      public void mostrarInfoProducto() {
        System.out.println("Información del Producto:");
        System.out.println("Marca: " + Marca);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Color: " + Color);
    }

}