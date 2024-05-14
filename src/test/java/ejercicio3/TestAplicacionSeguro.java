package ejercicio3;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestAplicacionSeguro {
    @Test
    public void test1(){//paquete con mas de un seguro
        var seguroHogar= new Seguro("Hogar",500.00);
        var seguroVehiculo= new Seguro("Auto",300.00);
        var paquete1= new PaqueteServicios("paquete1",5);
        paquete1.agregarUnServicio(seguroHogar);
        paquete1.agregarUnServicio(seguroVehiculo);
        var aplicacion= new AplicacionSeguro();
        aplicacion.agregarServicio(paquete1);
        assertEquals(760.0,aplicacion.precioDelServicio(paquete1),0.1);
    }
    @Test
    public void test2(){//Si el paquete solo tiene un seguro que no aplique el descuento;
        var seguroHogar= new Seguro("Hogar",500.00);
        var paquete1= new PaqueteServicios("paquete1",5);
        paquete1.agregarUnServicio(seguroHogar);
        var aplicacion= new AplicacionSeguro();
        aplicacion.agregarServicio(paquete1);
        assertEquals(500.0,aplicacion.precioDelServicio(paquete1),0.1);

    }
}
