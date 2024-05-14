package ejercicio1;

public class EmpleadoRegular implements Empleado {
    private double salario;
    private  String nombre;
    public EmpleadoRegular(String nombre, double salario){
        this.nombre= nombre;
        this.salario=salario;
    }
    public double devolverMontoSalario(){
        return salario;
    }
}
