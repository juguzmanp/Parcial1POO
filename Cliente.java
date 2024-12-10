/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1poo;

/**
 *
 * @author Estudiante
 */
public class Cliente extends Usuario {
    public void crearPedido(Producto x){
        new Pedido(x);
    }
}
