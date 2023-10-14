package Biblioteca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudentForm extends JFrame implements ActionListener {
    // Componentes del formulario
    private JLabel lblCarnet;
    private JLabel lblNombre;
    private JLabel lblDireccion;
    private JLabel lblCarrera;
    private JTextField txtCarnet;
    private JTextField txtNombre;
    private JTextField txtDireccion;
    private JTextField txtCarrera;
    private JButton btnBuscar;
    private JButton btnGuardar;
    private JButton btnEliminar;
    private JButton btnCerrar;
    private ArrayList<Estudiante> listaEstudiantes;
    public StudentForm(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
        // Configuración de la ventana
        setTitle("Formulario de Estudiantes");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        // Creación de los componentes
        lblCarnet = new JLabel("Carnet:");
        lblNombre = new JLabel("Nombre:");
        lblDireccion = new JLabel("Dirección:");
        lblCarrera = new JLabel("Carrera:");
        txtCarnet = new JTextField();
        txtNombre = new JTextField();
        txtDireccion = new JTextField();
        txtCarrera = new JTextField();
        btnBuscar = new JButton("Buscar");
        btnGuardar = new JButton("Guardar");
        btnEliminar = new JButton("Eliminar");
        btnCerrar = new JButton("Cerrar");

        // Agregar los componentes al formulario
        add(lblCarnet);
        add(txtCarnet);
        add(lblNombre);
        add(txtNombre);
        add(lblDireccion);
        add(txtDireccion);
        add(lblCarrera);
        add(txtCarrera);
        add(btnBuscar);
        add(btnGuardar);
        add(btnEliminar);
        add(btnCerrar);

        // Configuración de los botones
        btnBuscar.addActionListener(this);
        btnGuardar.addActionListener(this);
        btnEliminar.addActionListener(this);
        btnCerrar.addActionListener(this);

        // Mostrar la ventana
        pack();
        setSize(400,220);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnBuscar) {
            // Lógica para buscar el estudiante
            boolean sw = false;
            JButton source = (JButton) e.getSource();
            if (source.getText().equals("Buscar")) {
                String carnetBuscado = txtCarnet.getText();

                for (Estudiante estudiante : listaEstudiantes) {
                    if (estudiante != null && estudiante.getCarnet().equals(carnetBuscado)) {
                        txtCarnet.setText(estudiante.getCarnet());
                        txtNombre.setText(estudiante.getNombre());
                        txtDireccion.setText(estudiante.getDireccion());
                        txtCarrera.setText(estudiante.getCarrera());
                        sw = true;
                        break;
                    }
                }
                if(!sw) {
                    JOptionPane.showMessageDialog(this, "Estudiante no existe");
                }
            }
        } else if (e.getSource() == btnGuardar) {
            String carnet = txtCarnet.getText();
            String nombre = txtNombre.getText();
            String direccion = txtDireccion.getText();
            String carrera = txtCarrera.getText();

            Estudiante estudianteExistente = null;
            for (Estudiante estudiante : listaEstudiantes) {
                if (estudiante != null && estudiante.getCarnet().equals(carnet)) {
                    estudianteExistente = estudiante;
                    break;
                }
            }

            if (estudianteExistente != null) {
                // Actualizar los datos del estudiante existente
                estudianteExistente.setNombre(nombre);
                estudianteExistente.setDireccion(direccion);
                estudianteExistente.setCarrera(carrera);
                JOptionPane.showMessageDialog(this, "Datos actualizados correctamente");
            } else {
                // Crear un nuevo estudiante y agregarlo al array
                Estudiante nuevoEstudiante = new Estudiante(carnet, nombre, direccion, carrera);
                listaEstudiantes.add(nuevoEstudiante);
                JOptionPane.showMessageDialog(this, "Estudiante agregado correctamente");
            }
        } else if (e.getSource() == btnEliminar) {
            String carnet = txtCarnet.getText();

            // Buscar el estudiante en el ArrayList
            Estudiante estudianteEncontrado = null;
            for (Estudiante estudiante : listaEstudiantes) {
                if (estudiante.getCarnet().equals(carnet)) {
                    estudianteEncontrado = estudiante;
                    txtCarnet.setText("");
                    txtNombre.setText("");
                    txtDireccion.setText("");
                    txtCarrera.setText("");
                    break;
                }
            }

            // Eliminar el estudiante si fue encontrado
            if (estudianteEncontrado != null) {
                listaEstudiantes.remove(estudianteEncontrado);
                JOptionPane.showMessageDialog(this, "Estudiante eliminado");
                // Aquí puedes agregar la lógica adicional que desees después de eliminar el estudiante
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró un estudiante con el carnet especificado");
            }
        } else if (e.getSource() == btnCerrar) {
            // Cerrar la ventana
            dispose();
        }
    }
}
