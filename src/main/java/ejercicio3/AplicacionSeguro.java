package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class AplicacionSeguro {
    private List<Servicio> servicios;
    public  AplicacionSeguro(){
        servicios= new ArrayList<>();
    }
    public void agregarServicio(Servicio servicio){
        servicios.add(servicio);
    }
    public double precioDelServicio(Servicio servicio){
        return servicio.costoServicio();
    }
}
