/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurante;

/**
 *
 * @author Estudiante
 */
public class Cliente extends Usuario {

    public Cliente(String Nombre) {
        super(Nombre, "Cliente");
    }
    
    public Pedido crearPedido(String z,Producto x, int y){
        return new Pedido(z,x,y);
    }
}