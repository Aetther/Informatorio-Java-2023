package POO.Escenario2v2;

import POO.Escenario2v2.Servicio.Entrada.InputService;
import POO.Escenario2v2.Inicializacion.InitService;
import POO.Escenario2v2.Servicio.Producto.ServicioProducto;
import POO.Escenario2v2.Servicio.Producto.Impl.ServicioProductoImpl;

public class App {

    //Atributo global
    private static final ServicioProducto servicioProducto = new ServicioProductoImpl();

    public static void main(String[] args) {

        InitService.initCategories();

        InputService.createScanner();
        System.out.println(servicioProducto.crearProducto().toString());
        InputService.closeScanner();
    }

}
