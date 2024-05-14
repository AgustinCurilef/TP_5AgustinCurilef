package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class EmpresaLaserX {
    private List<Empleado> empleados;
    public EmpresaLaserX(){
        empleados= new ArrayList<>();
    }
    public double calcularMontoSalarioEmpresa(){
        double totalFinal=0;
        for (Empleado empleado: empleados){
            totalFinal=totalFinal+empleado.devolverMontoSalario();
        }
        return totalFinal;
    }
    public void cargarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
}
