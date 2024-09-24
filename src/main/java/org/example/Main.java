package org.example;

import org.example.ayudas.Proveedor;
import org.example.ayudas.Repartidor;
import org.example.modelos.Cliente;
import org.example.modelos.Flor;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente clienteUno=new Cliente();
        Cliente clienteDos=new Cliente(1,"Camilo","Soto","carrera 20 sur","Medellin","Antioquia","30023445","jorge@hotmail.com",30, LocalDate.now());
        Flor florUno=new Flor();
        Flor florDos=new Flor(1,"rosa","Rojo",2000,100,true,100,LocalDate.now(),"cultivo de oriente","colombia");
        Proveedor proveedorUno=new Proveedor();
        Proveedor proveedorDos=new Proveedor(1,"paquetes sas","bolsas","calle larga numero 20","medellin","antioquia","2307500","jorge@gmail","simplificado",LocalDate.now());
        Repartidor repartidorUno=new Repartidor();
        Repartidor repartidorDos=new Repartidor(1,"camilo","ramirez","calle larga 20","sabaneta","antioquia","2305678","camilo@gmail",34,LocalDate.now());

        // Imprimir detalles de los clientes
        System.out.println(clienteUno);
        System.out.println(clienteDos.getId());
        System.out.println(clienteDos.getNombre());
        System.out.println(clienteDos.getApellido());
        System.out.println(clienteDos.getDireccion());
        System.out.println(clienteDos.getCiudad());
        System.out.println(clienteDos.getDepartamento());
        System.out.println(clienteDos.getTelefono());
        System.out.println(clienteDos.getCorreo());
        System.out.println(clienteDos.getEdad());
        System.out.println(clienteDos.getFechaNacimiento());

        // Imprimir detalles de las flores
        System.out.println(florUno);
        System.out.println(florDos.getId());
        System.out.println(florDos.getNombre());
        System.out.println(florDos.getColor());
        System.out.println(florDos.getPrecio());
        System.out.println(florDos.getCantidad());
        System.out.println(florDos.isEspinas());
        System.out.println(florDos.getNumeroPetalos());
        System.out.println(florDos.getVencimiento());
        System.out.println(florDos.getCulivador());
        System.out.println(florDos.getPaisOrigen());

        // Imprimir detalles de los proveedores
        System.out.println(proveedorUno);
        System.out.println(proveedorDos.getId());
        System.out.println(proveedorDos.getNombre());
        System.out.println(proveedorDos.getProducto());
        System.out.println(proveedorDos.getDireccion());
        System.out.println(proveedorDos.getCiudad());
        System.out.println(proveedorDos.getDepartamento());
        System.out.println(proveedorDos.getTelefono());
        System.out.println(proveedorDos.getCorreo());
        System.out.println(proveedorDos.getRegimen());
        System.out.println(proveedorDos.getFechaRegistro());

        // Imprimir detalles de los repartidores
        System.out.println(repartidorUno);
        System.out.println(repartidorDos.getId());
        System.out.println(repartidorDos.getNombre());
        System.out.println(repartidorDos.getApellido());
        System.out.println(repartidorDos.getDireccion());
        System.out.println(repartidorDos.getCiudad());
        System.out.println(repartidorDos.getDepartamento());
        System.out.println(repartidorDos.getTelefono());
        System.out.println(repartidorDos.getCorreo());
        System.out.println(repartidorDos.getEdad());
        System.out.println(repartidorDos.getFechaNacimiento());





    }
}