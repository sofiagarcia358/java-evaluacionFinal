package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.HashMap;
import java.util.List;

public class TareasView  extends JFrame {
    private int[] pantalla = {1300, 800};

    public TareasView() {

                setTitle("Gestor de Tareas");
                setSize(600, 1200);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setLayout(new BorderLayout());

                JPanel panelControles = new JPanel();
                panelControles.setLayout(new FlowLayout());
                JButton btnAgregarTarea = new JButton("Agregar Tarea");
                JButton btnEliminarTarea = new JButton("Eliminar Tarea");
                panelControles.add(btnAgregarTarea);
                panelControles.add(btnEliminarTarea);


                JPanel panelTareas = new JPanel();
                panelTareas.setLayout(new BoxLayout(panelTareas, BoxLayout.Y_AXIS));


                JPanel panelNuevaTarea = new JPanel();
                panelNuevaTarea.setLayout(new GridLayout(2, 2));
                panelNuevaTarea.add(new JLabel("Nueva Tarea:"));
                JTextField campoNuevaTarea = new JTextField();
                panelNuevaTarea.add(campoNuevaTarea);
                JButton btnGuardarNuevaTarea = new JButton("Guardar");
                panelNuevaTarea.add(btnGuardarNuevaTarea);


                JPanel panelEliminarTarea = new JPanel();
                panelEliminarTarea.setLayout(new GridLayout(2, 1));
                panelEliminarTarea.add(new JLabel("ID de la tarea a eliminar:"));
                JTextField campoEliminarTarea = new JTextField();
                panelEliminarTarea.add(campoEliminarTarea);
                JButton btnEliminar = new JButton("Eliminar");
                panelEliminarTarea.add(btnEliminar);


                add(panelControles, BorderLayout.BEFORE_LINE_BEGINS);  // Controles arriba
                add(new JScrollPane(panelTareas), BorderLayout.EAST);  // Tareas al centro con scroll
                add(panelNuevaTarea, BorderLayout.PAGE_START);  // Formulario nueva tarea abajo
                add(panelEliminarTarea, BorderLayout.AFTER_LAST_LINE);

                setVisible(true);


            }
        }
