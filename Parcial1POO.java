/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parcial1poo;

/**
 *
 * @author Estudiante
 */
import java.util.*;
public class Parcial1POO {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        new Producto("Hamburguesa");
        new Producto("PerroCaliente");
        new Producto("Alitas");
        boolean salir = false;
        boolean atras;
        int opcion;
        while (salir = false){
            System.out.println("Bienvenido");
            System.out.println("Ingresar como:");
            System.out.println("1. Cliente");
            System.out.println("2. Empleado");
            System.out.println("3. Salir de la aplicacion");
            System.out.println("Ingrese el numero correspondiente para continuar.");
            opcion = s.nextInt();
            if (opcion == 1){
                atras = false;
                while (atras = false){
                    System.out.println("Seleccione una opcion del menu");
                    System.out.println("1. Hamburguesa"); 
                    System.out.println("2. Perro Caliente");
                    System.out.println("3. Alitas");
                    opcion = s.nextInt();
                    if (opcion == 1){
                        
                    }
                    
                    
                }
            }
            if (opcion == 2){
            
            }
            if (opcion == 3){
                salir = true;
            }
            else{
                System.out.println("Entrada invalida, vuelva a intentar");
            }
        }
    }
}
