package ejercicio2;

public class Tarea implements ItemTrabajo{
    private String tipo;
    private int tiempo;
    public Tarea (String tipo, int horasTrabajadas){
        this.tipo= tipo;
        this.tiempo= horasTrabajadas;
    }
    @Override
    public int horasTrabajadas() {
        return tiempo;
    }
}
