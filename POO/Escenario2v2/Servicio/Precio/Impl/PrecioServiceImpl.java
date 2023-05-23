package POO.Escenario2v2.Servicio.Precio.Impl;

import POO.Escenario2v2.Dominio.PrecioActual;
import POO.Escenario2v2.Dominio.PrecioTachado;
import POO.Escenario2v2.Servicio.Entrada.InputService;
import POO.Escenario2v2.Servicio.Precio.PrecioService;

import java.time.LocalDateTime;

public class PrecioServiceImpl implements PrecioService {


    @Override
    public PrecioActual crearPrecioActual(double precioNuevo) {
        PrecioActual precioActual = new PrecioActual();

        precioActual.setValor(precioNuevo);
        precioActual.setFechaDeCarga(LocalDateTime.now());
        return precioActual;
    }

    @Override
    public PrecioActual crearPrecioActual() {

        PrecioActual precioActual = new PrecioActual();
        System.out.println("INGRESE PRECIO DEL PRODUCTO : ");
        precioActual.setValor(InputService.getScanner().nextDouble());
        precioActual.setFechaDeCarga(LocalDateTime.now());


        return precioActual;
    }

    @Override
    public PrecioTachado crearPrecioTachado(PrecioActual precioActual) {



        PrecioTachado precioTachado = new PrecioTachado();
        System.out.println("INGRESE PRECIO DEL PRODUCTO : ");
        precioTachado.setValor(InputService.getScanner().nextDouble());
        precioTachado.setFechaDeCarga(LocalDateTime.now());
        precioTachado.setFechaDeFinalizacion(LocalDateTime.of(2024,5,10,0,0,0));

        return precioTachado;
    }
}
