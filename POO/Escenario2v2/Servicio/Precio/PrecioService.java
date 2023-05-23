package POO.Escenario2v2.Servicio.Precio;

import POO.Escenario2v2.Dominio.PrecioActual;
import POO.Escenario2v2.Dominio.PrecioTachado;

public interface PrecioService {

    PrecioActual crearPrecioActual(double precioNuevo);
    PrecioActual crearPrecioActual();
    PrecioTachado crearPrecioTachado(PrecioActual precioActual);
}
