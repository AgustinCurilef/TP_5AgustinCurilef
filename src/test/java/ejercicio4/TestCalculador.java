package ejercicio4;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class TestCalculador {
    @Test
    public void JubiladoDescuento(){
        var calculador= new CalculadorJubilado(new LogTransaction(), LocalDate.now().getMonthValue());
        var resultado= calculador.calcularPrecio(500.0);
        assertEquals(500.0, resultado,0.1);
    }
    @Test
    public void JubiladoNoDescuento(){
        var calculador= new CalculadorJubilado(new LogTransaction(), LocalDate.now().minusMonths(1).getMonthValue());
        var resultado= calculador.calcularPrecio(500.0);
        assertEquals(550.0, resultado,0.1);
    }
    @Test
    public void NoJubiladoDescuento(){
        var calculador= new CalculadorNoJubilado(new LogTransaction(), LocalDate.now().getMonthValue());
        var resultado= calculador.calcularPrecio(500.0);
        assertEquals(575.0, resultado,0.1);
    }
    @Test
    public void NoJubiladoNoDescuento(){
        var calculador= new CalculadorNoJubilado(new LogTransaction(), LocalDate.now().minusMonths(1).getMonthValue());
        var resultado= calculador.calcularPrecio(500.0);
        assertEquals(605.0, resultado,0.1);
    }
}
