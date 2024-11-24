/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116;

/**
 *
 * @author Janely
 */
public class Televisor extends Producto {
    private String Pantalla;

    public String getPantalla() {
        return Pantalla;
    }

    public void setPantalla(String Pantalla) {
        this.Pantalla = Pantalla;
    }

    public String getSonido() {
        return Sonido;
    }

    public void setSonido(String Sonido) {
        this.Sonido = Sonido;
    }

    public Televisor(String Pantalla, String Sonido, String Color, String Marca, String Modelo) {
        super(Color, Marca, Modelo);
        this.Pantalla = Pantalla;
        this.Sonido = Sonido;
    }

   
    private String Sonido;
}