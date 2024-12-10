/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1poo;

/**
 *
 * @author Estudiante
 */
public class Producto {
    public String Nombre;
    public int disponibilidad;
    
    public Producto(String x){
        this.Nombre = x;
        this.disponibilidad = 0;
    }
    
    public void aumentarDisponibilidad(int x){
        this.disponibilidad = this.disponibilidad + x;
    }
}
