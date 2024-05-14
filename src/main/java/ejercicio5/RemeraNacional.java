package ejercicio5;

public class RemeraNacional extends Remera{
private double recargo= 0.015;
private  double bonificacion=0.2;
private  double adicionFinal=0.15;
    public RemeraNacional(double precioUnitario) {
        super(precioUnitario);
    }

    @Override
    protected double adicionFinal() {
        return super.precioUnitario * adicionFinal;
    }

    @Override
    protected double bonificacion() {
        return precioUnitario * bonificacion;
    }

    @Override
    protected double impuestoAduana() {
        return 0;
    }

    @Override
    protected double recargo() {
        return precioUnitario * recargo;
    }
}
