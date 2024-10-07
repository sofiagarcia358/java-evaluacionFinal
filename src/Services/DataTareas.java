package Services;

import java.util.ArrayList;
import model.Tarea;


public class DataTareas {

        public static ArrayList listaTarea(){

            ArrayList<Tarea> data = new ArrayList<>();
            data.add(new Tarea("Matematica", "Ecuaciones", "15 mayo",false, true, false));
            data.add(new Tarea("Fisica", "Ecuaciones", "16 mayo",false, true, false));
            data.add(new Tarea("Ingles", "Ecuaciones", "17 mayo",true, false, false));
            data.add(new Tarea("sociales", "Ecuaciones", "18 mayo",false, true, false));
            data.add(new Tarea("Musica", "Ecuaciones", "15 mayo",true, false, false));

            return data;
        }
    }

