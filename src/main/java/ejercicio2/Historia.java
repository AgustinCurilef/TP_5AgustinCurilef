package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Historia implements ItemTrabajo {
    private List<ItemTrabajo> itemTrabajos;
    public Historia (){
        itemTrabajos = new ArrayList<>();
    }
    @Override
    public int horasTrabajadas() {
        int totalHoras= 0;
        for (ItemTrabajo item: itemTrabajos){
            totalHoras= totalHoras+ item.horasTrabajadas();
        }
        return totalHoras;
    }
    public void agregarTarea(ItemTrabajo tarea){
        itemTrabajos.add(tarea);
    }
}
