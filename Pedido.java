/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1poo;

/**
 *
 * @author Estudiante
 */
public class Pedido {
    public String estado;
    public String producto;
    
    public Pedido(Producto x){
        this.estado = ("pendiente");
        this.producto = x.Nombre;
    }
    
    public void aprobarPedido(){
        this.estado = ("aprobado");
    }
}
