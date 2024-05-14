package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoNoRegular implements Empleado {
    private List<Empleado> empleados;
    private String nombre;
    private double salario;
    private String cargo;
    public EmpleadoNoRegular(String nombre, double salario, String cargo){
        this.nombre=nombre;
        this.salario=salario;
        this.cargo= cargo;
        empleados= new ArrayList<>();
    }
    @Override
    public double devolverMontoSalario() {
        double total=salario;
        for (Empleado empleado : empleados){
            total= total + empleado.devolverMontoSalario();
        }
        return total;
    }
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

}
