package POO.Escenario2v2.Servicio.Descuento.Impl;

import POO.Escenario2v2.Dominio.Producto;
import POO.Escenario2v2.Servicio.Descuento.DescuentoService;
import POO.Escenario2v2.Servicio.Precio.PrecioService;
import POO.Escenario2v2.Servicio.Precio.Impl.PrecioServiceImpl;

public class DescuentoServiceImpl implements DescuentoService {

    private final PrecioService precioService = new PrecioServiceImpl();

    @Override
    public void generarDescuento(Producto producto) {
        //Precio tachado
        producto.setPrecioTachado(precioService.crearPrecioTachado(producto.getPrecioActual()));

        //Precio con descuento
        producto.setPrecioActual(precioService.crearPrecioActual());

        double precioTachado =  producto.getPrecioTachado().getValor();
        double precioActual = producto.getPrecioActual().getValor();

        //= (1 - (online / tachado)) * 100
        int descuento = (int) (100 - ((precioActual*precioTachado) / 100)) ;
        producto.setDescuento(descuento);
    }
}
