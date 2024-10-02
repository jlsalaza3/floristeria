package org.example;

import org.example.ayudas.Proveedor;
import org.example.ayudas.Repartidor;
import org.example.modelos.Cliente;
import org.example.modelos.Flor;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leerteclado= new Scanner(System.in);

        Cliente clienteUno=new Cliente();
        System.out.println("Ingrese el ID del cliente:");
        clienteUno.setId(leerteclado.nextInt());

        leerteclado.nextLine();

        System.out.println("Ingrese el nombre del Cliente;");
        clienteUno.setNombre(leerteclado.nextLine());

        System.out.println("Ingrese el apellido del cliente:");
        clienteUno.setApellido(leerteclado.nextLine());

        System.out.println("Ingrese la direccion del cliente:");
        clienteUno.setDireccion(leerteclado.nextLine());

        System.out.println("Ingrese la ciudad de la dirección del cliente");
        clienteUno.setCiudad(leerteclado.nextLine());

        System.out.println("Ingrese el departamento de la dirección del cliente:");
        clienteUno.setDepartamento(leerteclado.nextLine());

        System.out.println("ingrese el telefono del cliente");
        clienteUno.setTelefono(leerteclado.nextLine());

        System.out.println("ingrese el correo electronico del cliente");
        clienteUno.setCorreo(leerteclado.nextLine());

        System.out.println("ingrese la edad del cliente");
        clienteUno.setEdad(leerteclado.nextInt());

        System.out.println("detalles del cliente "+clienteUno);


        Cliente clienteDos=new Cliente(1,"Camilo","Soto","carrera 20 sur","Medellin","Antioquia","30023445","jorge@hotmail.com",30, LocalDate.now());
        System.out.println("detalles del cliente "+clienteDos);

        // flores
        Flor florUno=new Flor();
        System.out.println("Ingrese el ID de la flor:");
        florUno.setId(leerteclado.nextInt());

        leerteclado.nextLine();

        System.out.println("Ingrese el nombre de la flor:");
        florUno.setNombre(leerteclado.nextLine());

        System.out.println("Ingrese el color de la flor");
        florUno.setColor(leerteclado.nextLine());

        System.out.println("Ingrese el precio unitario de la flor");
        florUno.setPrecio(leerteclado.nextInt());

        System.out.println("Ingrese la cantidad de flores");
        florUno.setCantidad(leerteclado.nextInt());

        leerteclado.nextLine();

        System.out.println("Ingrese si tiene espinas true o false");
        florUno.setEspinas(leerteclado.nextBoolean());

        System.out.println("ingrese el numero de petalos");
        florUno.setNumeroPetalos(leerteclado.nextInt());

        // fecha
        leerteclado.nextLine();

        System.out.println("Ingrese el cultivador de la flor");
        florUno.setCulivador(leerteclado.nextLine());

        System.out.println("Ingrese el pais de origen de la flor");
        florUno.setPaisOrigen(leerteclado.nextLine());

        System.out.println("detalles de la flor  "+florUno);

        Flor florDos=new Flor(1,"rosa","Rojo",2000,100,true,100,LocalDate.now(),"cultivo de oriente","colombia");
        System.out.println("detalles de la flor  "+florDos);

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