
package boletin30;

import java.util.ArrayList;


public class Boletin30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<SeleccionFutbol> equipo = new ArrayList();
        equipo.add(new Futbolista(10, "defensa", 1, "Manuel", "Donter", 19));
        equipo.add(new Entrenador(88, 2, "Juan", "Rodriguez", 36));
        equipo.add(new Masajista("Deportivo", 2, 3, "Juan", "cosa", 16));
        equipo.add(new Seleccionador(4, "Paco", "El chocolatero", 56));

        for (int i = 0; i < equipo.size(); i++) {
            System.out.println(equipo.get(i));
        }
        
    }

}
