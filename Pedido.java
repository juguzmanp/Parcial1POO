/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurante;

/**
 *
 * @author Estudiante
 */
public class Pedido {
    public String estado;
    public String producto;
    public int cantidad;
    
    public Pedido(String z,Producto x, int y){
        this.estado = z;
        this.producto = x.Nombre;
        this.cantidad = y;
    }
    
    public void aprobarPedido(){
        this.estado = ("aprobado");
    }

    public void denegarPedido(){
        this.estado = ("denegado");
    }
    
    public void eliminarPedido(){
        this.estado = ("ninguno");
    }
    
    public String getEstado() {
        return estado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getProducto() {
        return producto;
    }
}