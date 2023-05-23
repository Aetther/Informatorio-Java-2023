package POO.Escenario2v2.Servicio.Producto.Impl;

import POO.Escenario2v2.Dominio.Producto;
import POO.Escenario2v2.Dominio.PrecioActual;
import POO.Escenario2v2.Servicio.Descuento.DescuentoService;
import POO.Escenario2v2.Servicio.Descuento.Impl.DescuentoServiceImpl;
import POO.Escenario2v2.Servicio.Entrada.InputService;
import POO.Escenario2v2.Servicio.Precio.PrecioService;
import POO.Escenario2v2.Servicio.Precio.Impl.PrecioServiceImpl;
import POO.Escenario2v2.Servicio.Producto.ServicioProducto;

import java.util.UUID;

public class ServicioProductoImpl implements ServicioProducto {

    private final DescuentoService descuentoService = new DescuentoServiceImpl();

    private final PrecioService precioService = new PrecioServiceImpl();

    @Override
    public Producto crearProducto() {
        Producto productoNuevo = new Producto();

        productoNuevo.setId(UUID.randomUUID());

        System.out.println("INGRESE EL NOMBRE DEL PRODUCTO : ");
        // String nombreProducto = entrada.nextLine(); Es lo mismo
        productoNuevo.setNombre(InputService.scanner.nextLine());
        System.out.println("INGRESE LA DESCRIPCION DEL PRODUCTO : ");
        productoNuevo.setDescripcion(InputService.scanner.nextLine());

        PrecioActual precioActual = precioService.crearPrecioActual();
        productoNuevo.setPrecioActual(precioActual);

        System.out.println("TIENE DESCUENTO? Si ingrese 1 - No ingrese 0: ");
        int quieroDescuento = InputService.scanner.nextInt();

        if (quieroDescuento == 1){
            //Envio de mensaje
            descuentoService.generarDescuento(productoNuevo);
        }

        return productoNuevo;
    }

}
