package ejercicio4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public abstract class CalculadorCliente implements Calculador {
    private LogTransaction log;
    private int mesEnPromocion;

     CalculadorCliente(LogTransaction log, int mesEnPromocion) {
        this.log = log;
        this.mesEnPromocion = mesEnPromocion;
    }
    public double calcularPrecio(double precioProducto) {
        double precioTotal = precioProducto;
        if (!of(mesEnPromocion).equals(now().getMonth())) {
            precioTotal = mesNoPromocion(precioProducto);
        }
        else {
            precioTotal = mesPromocion(precioProducto);
        }
        log.log(CalculadorJubilado.class.getName());
        return precioTotal;
    }
    protected abstract double mesPromocion(double precioProducto);
    protected abstract double mesNoPromocion(double precioProducto);
}
