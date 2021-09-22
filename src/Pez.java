/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luciacapisano
 */
public class Pez {
    private int peso; 
    private String nombre, color; 

    public Pez() {
    }

    public Pez(int peso, String nombre, String color) {
        this.peso = peso;
        this.nombre = nombre;
        this.color = color;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pez{" + "peso=" + peso + ", nombre=" + nombre + ", color=" + color + '}';
    }
    
    
}
