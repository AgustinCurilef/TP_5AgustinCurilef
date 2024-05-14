package ejercicio4;

import static java.time.LocalDate.now;
import static java.time.Month.of;
public class CalculadorNoJubilado extends CalculadorCliente {


    CalculadorNoJubilado(LogTransaction log, int mesEnPromocion) {
        super(log, mesEnPromocion);
    }

    @Override
    protected double mesPromocion(double precioProducto) {
        return  (precioProducto+ precioProducto * 0.15);
    }

    @Override
    protected double mesNoPromocion(double precioProducto) {
        return  (precioProducto+precioProducto * 0.21);
    }
}
