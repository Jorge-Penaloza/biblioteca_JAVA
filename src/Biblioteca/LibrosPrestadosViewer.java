package Biblioteca;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class LibrosPrestadosViewer extends JFrame {
    private ArrayList<Estudiante> listaEstudiantes;

    public LibrosPrestadosViewer(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;

        // Configuración de la ventana
        setTitle("Libros Prestados");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        // Creación del modelo de tabla
        String[] columnas = {"Carnet", "Nombre", "Libros Prestados"};
        Object[][] datos = obtenerDatosTabla();
        JTable tablaLibrosPrestados = new JTable(datos, columnas);

        // Configuración de la tabla
        JScrollPane scrollPane = new JScrollPane(tablaLibrosPrestados);
        add(scrollPane, BorderLayout.CENTER);

        // Mostrar la ventana
        pack();
        setSize(500, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private Object[][] obtenerDatosTabla() {
        int totalLibrosPrestados = 0;
        for (Estudiante estudiante : listaEstudiantes) {
            totalLibrosPrestados += estudiante.getLibrosPrestados().size();
        }

        Object[][] datos = new Object[totalLibrosPrestados][3];
        int fila = 0;

        for (Estudiante estudiante : listaEstudiantes) {
            ArrayList<Libro> librosPrestados = estudiante.getLibrosPrestados();
            for (Libro libro : librosPrestados) {
                datos[fila][0] = estudiante.getCarnet();
                datos[fila][1] = estudiante.getNombre();
                datos[fila][2] = libro.getTitulo();
                fila++;
            }
        }

        return datos;
    }
}
