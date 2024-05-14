package ejercicio5;

public class RemeraInternacional extends Remera{
    private double recargo= 0.03;
    private  double  impuestoAduana=0.05;
    private  double adicionFinal=0.25;
    public RemeraInternacional(double precioUnitario) {
        super(precioUnitario);
    }

    @Override
    protected double adicionFinal() {
        return super.precioUnitario *adicionFinal;
    }

    @Override
    protected double bonificacion() {
        return 0;
    }

    @Override
    protected double impuestoAduana() {
        return super.precioUnitario * impuestoAduana;
    }

    @Override
    protected double recargo() {
        return super.precioUnitario * recargo;
    }
}
