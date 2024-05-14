package ejercicio5;

public abstract class Remera {
    protected double precioUnitario;
    public Remera(double precioUnitario){
        this.precioUnitario= precioUnitario;
    }
    public double calcularPrecioVenta(){
        return precioUnitario+ recargo() + impuestoAduana() + bonificacion() + adicionFinal();
    }

    protected abstract double adicionFinal();

    protected abstract double bonificacion();

    protected abstract double impuestoAduana();

    protected abstract double recargo() ;

}
