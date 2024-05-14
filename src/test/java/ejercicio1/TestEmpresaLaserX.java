package ejercicio1;

import ejercicio1.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestEmpresaLaserX {
    @Test
    public void test1() {//todos son empleados "hojas"
        var empleadoRegular1= new EmpleadoRegular("Rocio",10.00);
        var empleadoRegular2= new EmpleadoRegular("Rodrigo",10.00);
        var empleadoRegular3= new EmpleadoRegular("Pepe",10.00);
        EmpresaLaserX empresa= new EmpresaLaserX();
        empresa.cargarEmpleado(empleadoRegular1);
        empresa.cargarEmpleado(empleadoRegular2);
        empresa.cargarEmpleado(empleadoRegular3);
        double total= empresa.calcularMontoSalarioEmpresa();
        assertEquals(30,total);
    }
    @Test
    public void test2(){ //estructura de arbol
        var empleadoRegular1= new EmpleadoRegular("Rocio",10.00);
        var empleadoRegular2= new EmpleadoRegular("Rodrigo",10.00);
        var empleadoRegular3= new EmpleadoRegular("Pepe",10.00);
        var empleadoRegular4= new EmpleadoRegular("Sandra",10.00);
        var lider1= new EmpleadoNoRegular("Maxi",15.00,"LiderDeProyecto");
        var lider2= new EmpleadoNoRegular("Sol",15.00,"LiderDeProyecto");
        lider1.agregarEmpleado(empleadoRegular1);
        lider1.agregarEmpleado(empleadoRegular2);
        lider2.agregarEmpleado(empleadoRegular3);
        lider2.agregarEmpleado(empleadoRegular4);
        var mandoMedios1= new EmpleadoNoRegular("Tomas",17.00,"MandoMedios");
        var mandoMedios2= new EmpleadoNoRegular("Tomas",17.00,"MandoMedios");
        mandoMedios1.agregarEmpleado(lider1);
        mandoMedios2.agregarEmpleado(lider2);
        var gerente= new EmpleadoNoRegular("Jose",20.00,"Gerente");
        gerente.agregarEmpleado(mandoMedios1);
        gerente.agregarEmpleado(mandoMedios2);
        EmpresaLaserX empresa= new EmpresaLaserX();
        empresa.cargarEmpleado(gerente);
        double total= empresa.calcularMontoSalarioEmpresa();
        assertEquals(124,total);
    }
}
