package ejercicio3;

public class Seguro implements Servicio {
    private String tipo;
    private double precio;
    public Seguro(String tipo, double precio){
        this.tipo=tipo;
        this.precio= precio;
    }
    public double costoServicio(){
        return precio;
    }
}
