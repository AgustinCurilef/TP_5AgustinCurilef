package ejercicio2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestProyectoScrum {
    @Test
    public void test1(){
        var historia= new Historia();
        var proyecto= new ProyectoScrum();
        proyecto.agregarItem(historia);
        assertEquals(0, proyecto.horasDelProyecto());
    }
    @Test
    public void test2(){
        var historia= new Historia();
        var tareaSpike= new Tarea("Spike",3);
        historia.agregarTarea(tareaSpike);
        var proyecto= new ProyectoScrum();
        proyecto.agregarItem(historia);
        assertEquals(3, proyecto.horasDelProyecto());
    }
    @Test
    public void test3(){
        var historia= new Historia();
        var tareaComun1= new Tarea("Comun",1);
        var tareaComun2= new Tarea("Comun",2);
        var tareaSpike= new Tarea("Spike",3);
        historia.agregarTarea(tareaSpike);
        historia.agregarTarea(tareaComun1);
        historia.agregarTarea(tareaComun2);
        var proyecto= new ProyectoScrum();
        proyecto.agregarItem(historia);
        assertEquals(6, proyecto.horasDelProyecto());
    }

}
