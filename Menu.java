/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurante;

import java.util.Scanner;

/**
 *
 * @author luren
 */
public class Menu {
    public void corrermenu(){
        Scanner s = new Scanner(System.in);
        Cliente nestor = new Cliente("Nestor");
        Empleado juan = new Empleado("Juan");
        Producto hamburguesa = new Producto("Hamburguesa");
        Producto perroCaliente = new Producto("PerroCaliente");
        Producto alitas = new Producto("Alitas");
        Pedido nestorPedido = new Pedido("ninguno",hamburguesa,0);
        int opcion;
        int cant;
        int cantidadPedido = 0;
        String productoPedido = null;
        boolean disp;
        int nuevadisp;
        while (true){
            
            System.out.println("Ingrese su nombre");
            System.out.println("Ingrese salir para salir de la aplicacion");
            String login = s.next();
            if (login.equals("salir")){
                break;
            }
            String rol = juan.rolUsuario(login);
            if (rol.equals ("Usuario no existe")){
                rol = nestor.rolUsuario(login);
            }
            if (rol.equals ("Usuario no existe")){
                System.out.println(rol);
                System.out.println("");
            }
            while (true){
                if (rol.equals ("Cliente")){
                    String est = nestorPedido.getEstado();
                    if (est.equals ("pendiente")){
                        System.out.println("Ya hay un pedido en espera");
                        System.out.println("");
                        break;
                    }
                    if (est.equals ("denegado")){
                        System.out.println("Su pedido fue rechazado");
                        System.out.println("");
                        nestorPedido.eliminarPedido();
                        break;
                    }
                    if (est.equals ("aprobado")){
                        System.out.println("Su pedido fue aprobado");
                        System.out.println("Usted compro "+cantidadPedido+" "+productoPedido);
                        System.out.println("");
                        nestorPedido.eliminarPedido();
                    }
                    System.out.println("Bienvenido " + login);
                    System.out.println("Seleccione una opcion del menu");
                    System.out.println("1. Hamburguesa"); 
                    System.out.println("2. Perro Caliente");
                    System.out.println("3. Alitas");
                    System.out.println("4. Volver al login");
                    opcion = s.nextInt();
                    if (opcion == 4){
                        break;
                    }
                    else if (opcion == 1){
                        System.out.println("Ingrese cantidad del producto");
                        cant = s.nextInt();
                        if (cant <= 0){
                            System.out.println("La cantidad no puede ser menor a 1");
                            System.out.println("");
                        }
                        else{
                            disp = hamburguesa.revisarDisponibilidad(cant);
                            if (disp == true){
                            nestorPedido = nestor.crearPedido("pendiente",hamburguesa,cant);
                            System.out.println("Su pedido esta esperando ser aprobado");
                            System.out.println("");
                            break;
                            }
                            else{
                                System.out.print("No hay suficiente disponibilidad");
                                System.out.println("");
                            }  
                        }      
                    }
                    else if (opcion == 2){
                        System.out.println("Ingrese cantidad del producto");
                        cant = s.nextInt();
                        if (cant <= 0){
                            System.out.println("La cantidad no puede ser menor a 1");
                            System.out.println("");
                        }
                        else{
                            disp = perroCaliente.revisarDisponibilidad(cant);
                            if (disp == true){
                            nestorPedido = nestor.crearPedido("pendiente",perroCaliente,cant);
                            System.out.println("Su pedido esta esperando ser aprobado");
                            System.out.println("");
                            break;
                            }
                            else{
                                System.out.print("No hay suficiente disponibilidad");
                                System.out.println("");
                            }  
                        }  
                    }
                    else if (opcion == 3){
                        System.out.println("Ingrese cantidad del producto");
                        cant = s.nextInt();
                        if (cant <= 0){
                            System.out.println("La cantidad no puede ser menor a 1");
                            System.out.println("");
                        }
                        else{
                            disp = alitas.revisarDisponibilidad(cant);
                            if (disp == true){
                            nestorPedido = nestor.crearPedido("pendiente",alitas,cant);
                            System.out.println("Su pedido esta esperando ser aprobado");
                            System.out.println("");
                            break;
                            }
                            else{
                                System.out.print("No hay suficiente disponibilidad");
                                System.out.println("");
                            }  
                        }  
                    }
                    else{
                        System.out.println("Entrada invalida, vuelva a intentar");
                        System.out.println("");
                    }
                }
                else if (rol.equals ("Empleado")){
                    System.out.println("Seleccione una opcion");
                    System.out.println("1. Ver pedido");
                    System.out.println("2. Actualizar disponibilidad de productos"); 
                    System.out.println("3. Volver al login");
                    opcion = s.nextInt();
                    if (opcion == 3){
                        break;
                    }
                    if (opcion == 1){
                        while (true){
                            String est = nestorPedido.getEstado();
                            if (!est.equals ("pendiente")){
                                System.out.println("No hay pedidos por aprobar");
                                System.out.println("");
                                break;
                            }
                            else{
                                productoPedido = nestorPedido.getProducto();
                                cantidadPedido = nestorPedido.getCantidad();
                                System.out.println("Hay un pedido de "+cantidadPedido+" "+productoPedido);
                                System.out.println("Ingrese 1 para aprobar el pedido");
                                System.out.println("Ingrese 2 para denegar");
                                opcion = s.nextInt();
                                if (opcion == 1){
                                    nestorPedido.aprobarPedido();
                                    if (productoPedido.equals ("hamburguesa")){
                                        hamburguesa.disminuirDisponibilidad(cantidadPedido);
                                        nuevadisp = hamburguesa.getDisponibilidad();
                                        System.out.println("Ahora quedan " +nuevadisp+" hamburguesa(s)");
                                        System.out.println("");
                                    }
                                    if (productoPedido.equals ("perroCaliente")){
                                        perroCaliente.disminuirDisponibilidad(cantidadPedido);
                                        nuevadisp = perroCaliente.getDisponibilidad();
                                        System.out.println("Ahora quedan " +nuevadisp+" perro(s)");
                                        System.out.println("");
                                    }
                                    if (productoPedido.equals ("alitas")){
                                        alitas.disminuirDisponibilidad(cantidadPedido);
                                        nuevadisp = alitas.getDisponibilidad();
                                        System.out.println("Ahora quedan " +nuevadisp+" alitas");
                                        System.out.println("");
                                    }
                                }
                                else if (opcion == 2){
                                    nestorPedido.denegarPedido();
                                }
                                else{
                                    System.out.println("Opcion no valida");
                                    System.out.println("");
                                }
                            }
                        }
                    }
                    if (opcion == 2){
                        while (true){
                            System.out.println("Seleccione una opcion del menu");
                            System.out.println("1. Hamburguesa"); 
                            System.out.println("2. Perro Caliente");
                            System.out.println("3. Alitas");
                            System.out.println("4. Volver al menu anterior");
                            opcion = s.nextInt();
                            if (opcion == 4){
                                break;
                            }
                            else if (opcion == 1){
                                System.out.println("¿Que cantidad desea sumar?");
                                opcion = s.nextInt();
                                if (opcion <= 0){
                                    System.out.println("La cantidad no puede ser menor a 1");
                                    System.out.println("");
                                }
                                else{
                                    hamburguesa.aumentarDisponibilidad(opcion);
                                    nuevadisp = hamburguesa.getDisponibilidad();
                                    System.out.println("Ahora quedan " +nuevadisp+" hamburguesa(s)");
                                    System.out.println("");
                                }
                            }
                            else if (opcion == 2){
                                System.out.println("¿Que cantidad desea sumar?");
                                opcion = s.nextInt();
                                if (opcion <= 0){
                                    System.out.println("La cantidad no puede ser menor a 1");
                                    System.out.println("");
                                }
                                else{
                                    perroCaliente.aumentarDisponibilidad(opcion);
                                    nuevadisp = perroCaliente.getDisponibilidad();
                                    System.out.println("Ahora quedan " +nuevadisp+" perro(s)");
                                    System.out.println("");
                                }
                            }
                            else if (opcion == 3){
                                System.out.println("¿Que cantidad desea sumar?");
                                opcion = s.nextInt();
                                if (opcion <= 0){
                                    System.out.println("La cantidad no puede ser menor a 1");
                                    System.out.println("");
                                }
                                else{
                                    alitas.aumentarDisponibilidad(opcion);
                                    nuevadisp = alitas.getDisponibilidad();
                                    System.out.println("Ahora quedan " +nuevadisp+" alitas");
                                    System.out.println("");
                                }
                            }
                            else{
                                System.out.println("Ingrese un numero valido");
                                System.out.println("");
                            }
                        }
                    }
                }
                else{
                    break;
                }
            }    
        }
    }
}
