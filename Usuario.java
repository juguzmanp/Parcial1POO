/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurante;

/**
 *
 * @author Estudiante
 */
public class Usuario {
    public String Nombre;
    public String Rol;

    public Usuario(String Nombre, String Rol) {
        this.Nombre = Nombre;
        this.Rol = Rol;
    }
    
    public String rolUsuario(String name){
        if (name.equals (Nombre)){
            return Rol;
        }
        else{
            return "Usuario no existe";
        }
    }
}