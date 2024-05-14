package ejercicio4;
import static java.time.LocalDate.now;
import static java.time.Month.of;
public class CalculadorJubilado extends CalculadorCliente {

    public CalculadorJubilado(LogTransaction log, int mesEnPromocion) {
        super(log, mesEnPromocion);
    }

    @Override
    protected double mesPromocion(double precioProducto) {
        return precioProducto;
    }

    @Override
    protected double mesNoPromocion(double precioProducto) {
        return  (precioProducto+precioProducto * 0.1);
    }
}