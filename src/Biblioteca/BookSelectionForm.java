package Biblioteca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BookSelectionForm extends JFrame implements ActionListener {
    private ArrayList<Libro> listaLibros;
    private Estudiante estudiante;

    private JLabel lblSeleccionarLibro;
    private JComboBox<Libro> cmbLibros;
    private JButton btnSolicitar;

    public BookSelectionForm(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;


        // Configuración de la ventana y los componentes
        setTitle("Selección de Libro");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());

        lblSeleccionarLibro = new JLabel("Seleccionar Libro:");
        cmbLibros = new JComboBox<>();
        for (Libro libro : listaLibros) {

            cmbLibros.addItem(libro);
        }

        btnSolicitar = new JButton("Solicitar");
        btnSolicitar.addActionListener(this);

        add(lblSeleccionarLibro);
        add(cmbLibros);
        add(btnSolicitar);

        pack();
        setLocationRelativeTo(null);  // Centrar la ventana en la pantalla
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSolicitar) {
            Libro libroSeleccionado = (Libro) cmbLibros.getSelectedItem();
            if (libroSeleccionado != null) {
                estudiante.agregarLibroPrestado(libroSeleccionado);
                JOptionPane.showMessageDialog(this, "Préstamo realizado exitosamente");
            }
            dispose();  // Cerrar la ventana de selección de libro
        }
    }
}
