package POO.Escenario2.Dominio;

import java.time.LocalDateTime;

public class PrecioTachado {
    private double valor;
    private LocalDateTime fechaDeCarga;
    private LocalDateTime fechaDeFinalizacion;

    public PrecioTachado() {
    }

    public PrecioTachado(double valor, LocalDateTime fechaDeCarga, LocalDateTime fechaDeFinalizacion) {
        this.valor = valor;
        this.fechaDeCarga = fechaDeCarga;
        this.fechaDeFinalizacion = fechaDeFinalizacion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getFechaDeCarga() {
        return fechaDeCarga;
    }

    public void setFechaDeCarga(LocalDateTime fechaDeCarga) {
        this.fechaDeCarga = fechaDeCarga;
    }

    public LocalDateTime getFechaDeFinalizacion() {
        return fechaDeFinalizacion;
    }

    public void setFechaDeFinalizacion(LocalDateTime fechaDeFinalizacion) {
        this.fechaDeFinalizacion = fechaDeFinalizacion;
    }

    @Override
    public String toString() {
        return "PrecioTachado{" +
                "valor=" + valor +
                ", fechaDeCarga=" + fechaDeCarga +
                ", fechaDeFinalizacion=" + fechaDeFinalizacion +
                '}';
    }
}
