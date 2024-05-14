package ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestRemera {
    @Test
    public void testRemeraNacinal(){
        var remeraNacional= new RemeraNacional(100);
        var resultado= remeraNacional.calcularPrecioVenta();
        assertEquals(136.5, resultado,0.1);
    }
    @Test
    public void testRemerainternacinal(){
        var remeraInternacional= new RemeraInternacional(200);
        var resultado= remeraInternacional.calcularPrecioVenta();
        assertEquals(266.0, resultado,0.1);
    }
}
