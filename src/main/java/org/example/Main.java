package org.example;

import org.example.Ayudas.Proveedor;
import org.example.Ayudas.Repartidor;
import org.example.Modelos.Cliente;
import org.example.Modelos.Flor;

public class Main {
    public static void main(String[] args) {

        //Creando el objeto vacio y lleno

        Cliente cliente1= new Cliente();
        Cliente cliente2= new Cliente(123456,"Federico Perez","fedper@gmail.com","123456798","calle 10#50-25 Laureleres",30,true,"2000/12/12",100,"Cheque");

        Flor flor1=new Flor();
        Flor flor2=new Flor(1234L,"begonia","morado","tropical","Dulce",5,1.5,true,50000,200);

        Repartidor repartidor1=new Repartidor();
        Repartidor repartidor2=new Repartidor(45647,"Carlos Henao","12546346","camion",5,true,"Centro Histórico, Colonia Roma, Polanco",22,12,true);

        Proveedor proveedor1=new Proveedor();
        Proveedor proveedor2=new Proveedor(798756,"Florentino","7894654","Av. Insurgentes Sur 1234, Colonia del Valle, Ciudad de México, CP 03100",5,"flores naturales",true,7,"tranferencia",1000);

        System.out.println("Datos del Cliente 1:");
        System.out.println("Nombre: " + cliente1.getNombre());
        System.out.println("Correo Electrónico: " + cliente1.getCorreoElectronico());
        System.out.println("Teléfono: " + cliente1.getTelefono());
        System.out.println("Dirección: " + cliente1.getDireccion());
        System.out.println("Edad: " + cliente1.getEdad());
        System.out.println("Es VIP: " + cliente1.getEsVip());
        System.out.println("Fecha de Registro: " + cliente1.getFechaRegistro());
        System.out.println("Puntos de Fidelidad: " + cliente1.getPuntosFidelidad());
        System.out.println("Método de Pago Preferido: " + cliente1.getMetodoPagoPreferido());

        System.out.println("Datos del Cliente 2:");
        System.out.println("Nombre: " + cliente2.getNombre());
        System.out.println("Correo Electrónico: " + cliente2.getCorreoElectronico());
        System.out.println("Teléfono: " + cliente2.getTelefono());
        System.out.println("Dirección: " + cliente2.getDireccion());
        System.out.println("Edad: " + cliente2.getEdad());
        System.out.println("Es VIP: " + cliente2.getEsVip());
        System.out.println("Fecha de Registro: " + cliente2.getFechaRegistro());
        System.out.println("Puntos de Fidelidad: " + cliente2.getPuntosFidelidad());
        System.out.println("Método de Pago Preferido: " + cliente2.getMetodoPagoPreferido());

        System.out.println("Datos de la Flor 1:");
        System.out.println("ID: " + flor1.getId());
        System.out.println("Nombre: " + flor1.getNombre());
        System.out.println("Color: " + flor1.getColor());
        System.out.println("Tipo: " + flor1.getTipo());
        System.out.println("Fragancia: " + flor1.getFragancia());
        System.out.println("Número de Pétalos: " + flor1.getPetalos());
        System.out.println("Altura: " + flor1.getAltura());
        System.out.println("Disponibilidad: " + flor1.getDisponibilidad());
        System.out.println("Precio: " + flor1.getPrecio());
        System.out.println("Cantidad en Stock: " + flor1.getCantidad());

        System.out.println("Datos de la Flor 2:");
        System.out.println("ID: " + flor2.getId());
        System.out.println("Nombre: " + flor2.getNombre());
        System.out.println("Color: " + flor2.getColor());
        System.out.println("Tipo: " + flor2.getTipo());
        System.out.println("Fragancia: " + flor2.getFragancia());
        System.out.println("Número de Pétalos: " + flor2.getPetalos());
        System.out.println("Altura: " + flor2.getAltura());
        System.out.println("Disponibilidad: " + flor2.getDisponibilidad());
        System.out.println("Precio: " + flor2.getPrecio());
        System.out.println("Cantidad en Stock: " + flor2.getCantidad());

        System.out.println("Datos del Proveedor 1:");
        System.out.println("Nombre: " + proveedor1.getNombre());
        System.out.println("Teléfono: " + proveedor1.getTelefono());
        System.out.println("Dirección: " + proveedor1.getDireccion());
        System.out.println("ID Proveedor: " + proveedor1.getId());
        System.out.println("Calificación: " + proveedor1.getCalificacion());
        System.out.println("Tipo de Producto: " + proveedor1.getTipoProducto());
        System.out.println("Activo: " + proveedor1.getActivo());
        System.out.println("Tiempo de Entrega (días): " + proveedor1.getTiempoEntregaDias());
        System.out.println("Método de Pago: " + proveedor1.getMetodoPago());
        System.out.println("Cantidad de Productos Ofrecidos: " + proveedor1.getCantidadProductosOfrecidos());

        System.out.println("Datos del Proveedor 2:");
        System.out.println("Nombre: " + proveedor2.getNombre());
        System.out.println("Teléfono: " + proveedor2.getTelefono());
        System.out.println("Dirección: " + proveedor2.getDireccion());
        System.out.println("ID Proveedor: " + proveedor2.getId());
        System.out.println("Calificación: " + proveedor2.getCalificacion());
        System.out.println("Tipo de Producto: " + proveedor2.getTipoProducto());
        System.out.println("Activo: " + proveedor2.getActivo());
        System.out.println("Tiempo de Entrega (días): " + proveedor2.getTiempoEntregaDias());
        System.out.println("Método de Pago: " + proveedor2.getMetodoPago());
        System.out.println("Cantidad de Productos Ofrecidos: " + proveedor2.getCantidadProductosOfrecidos());

        System.out.println("Datos del Repartidor 1:");
        System.out.println("Nombre: " + repartidor1.getNombre());
        System.out.println("Teléfono: " + repartidor1.getTelefono());
        System.out.println("Vehículo: " + repartidor1.getVehiculo());
        System.out.println("ID Repartidor: " + repartidor1.getId());
        System.out.println("Calificación: " + repartidor1.getCalificacion());
        System.out.println("Disponibilidad: " + repartidor1.getDisponibilidad());
        System.out.println("Zona de Cobertura: " + repartidor1.getZonaCobertura());
        System.out.println("Número de Entregas: " + repartidor1.getNumEntregas());
        System.out.println("Años de Experiencia: " + repartidor1.getExperienciaAnos());
        System.out.println("Activo: " + repartidor1.getActivo());

        System.out.println("Datos del Repartidor 2:");
        System.out.println("Nombre: " + repartidor2.getNombre());
        System.out.println("Teléfono: " + repartidor2.getTelefono());
        System.out.println("Vehículo: " + repartidor2.getVehiculo());
        System.out.println("ID Repartidor: " + repartidor2.getId());
        System.out.println("Calificación: " + repartidor2.getCalificacion());
        System.out.println("Disponibilidad: " + repartidor2.getDisponibilidad());
        System.out.println("Zona de Cobertura: " + repartidor2.getZonaCobertura());
        System.out.println("Número de Entregas: " + repartidor2.getNumEntregas());
        System.out.println("Años de Experiencia: " + repartidor2.getExperienciaAnos());
        System.out.println("Activo: " + repartidor2.getActivo());


    }

}