package Biblioteca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LoanForm extends JFrame implements ActionListener {
    private ArrayList<Estudiante> listaEstudiantes;
    private ArrayList<Libro> listaLibros;

    private JLabel lblCarnet;
    private JTextField txtCarnet;
    private JButton btnSolicitar;

    public LoanForm(ArrayList<Estudiante> listaEstudiantes, ArrayList<Libro> listaLibros) {
        this.listaEstudiantes = listaEstudiantes;
        this.listaLibros = listaLibros;

        // Configuración de la ventana y los componentes
        setTitle("Formulario de Solicitud de Préstamo");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());

        lblCarnet = new JLabel("Carnet:");
        txtCarnet = new JTextField(10);
        btnSolicitar = new JButton("Solicitar");
        btnSolicitar.addActionListener(this);

        add(lblCarnet);
        add(txtCarnet);
        add(btnSolicitar);

        pack();
        setLocationRelativeTo(null);  // Centrar la ventana en la pantalla
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSolicitar) {
            String carnet = txtCarnet.getText();

            // Buscar el estudiante en la lista de estudiantes
            Estudiante estudianteEncontrado = null;
            for (Estudiante estudiante : listaEstudiantes) {
                if (estudiante.getCarnet().equals(carnet)) {
                    estudianteEncontrado = estudiante;
                    break;
                }
            }

            // Verificar si el estudiante existe y si puede solicitar más libros
            if (estudianteEncontrado != null) {
                if (estudianteEncontrado.getLibrosPrestados().size() < 5) {
                    // Solicitar el préstamo del libro
                    String isbn = JOptionPane.showInputDialog("Ingrese el ISBN del libro a solicitar:");
                    Libro libroEncontrado = null;
                    if (listaLibros != null)
                    {
                        for (Libro libro : listaLibros)
                        {
                            System.out.println(libro);
                            if (libro.getIsbn().equals(isbn))
                            {
                                libroEncontrado = libro;
                                break;
                            }
                        }
                    }
                    if (libroEncontrado != null && libroEncontrado.isDisponible()) {
                        estudianteEncontrado.agregarLibroPrestado(libroEncontrado);
                        libroEncontrado.setDisponible(false);
                        JOptionPane.showMessageDialog(this, "Préstamo realizado exitosamente");
                    } else {
                        JOptionPane.showMessageDialog(this, "El libro no está disponible");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "El estudiante ha alcanzado el límite máximo de préstamos");
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró un estudiante con el carnet especificado");
            }
        }
    }
}
