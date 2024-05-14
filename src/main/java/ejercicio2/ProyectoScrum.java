package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class ProyectoScrum {
    private List<ItemTrabajo> items;
    public ProyectoScrum(){
        items= new ArrayList<>();
    }
    public int horasDelProyecto(){
        int total=0;
        for (ItemTrabajo item : items){
            total= total + item.horasTrabajadas();
        }
        return total;
    }
    public void agregarItem(ItemTrabajo item){
        items.add(item);
    }
}
