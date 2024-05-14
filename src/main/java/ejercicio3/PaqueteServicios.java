package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class PaqueteServicios implements Servicio{
    private String nombrePaquete;
    private List<Servicio> servicios;
    private int descuento;
    public PaqueteServicios(String nombrePaquete, int descuento){
        this.nombrePaquete= nombrePaquete;
        servicios= new ArrayList<>();
        this.descuento=descuento;
    }
    public double costoServicio(){
        var total=0.0;
        if (servicios.size()>1) {
            for (Servicio servicio : servicios) {
                total = total + aplicarDescuento(servicio.costoServicio());
            }
        }
        else {
            return servicios.getFirst().costoServicio();
        }
        return total;
    }
    public void agregarUnServicio(Servicio servicio){
        servicios.add(servicio);
    }
    private double aplicarDescuento(double precio){
        return (precio-(precio*descuento)/100);
    }

}
