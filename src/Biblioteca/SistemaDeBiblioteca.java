package Biblioteca;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;
import java.util.ArrayList;

import Biblioteca.StudentForm;


public class SistemaDeBiblioteca extends JFrame implements ActionListener {
    // Componentes de la GUI
    private JFrame frame;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem menuItem1;
    private JMenuItem menuItem2;
    private JMenuItem menuItem3;
    private JMenuItem menuItem4;
    private JMenuItem menuItem5;

    //public  Estudiante[] listaEstudiantes = new Estudiante[50];
    private ArrayList<Estudiante> listaEstudiantes;
    private ArrayList<Libro> listaLibros;
    public SistemaDeBiblioteca() {
        // Creación de la ventana principal
        listaEstudiantes = new ArrayList<>();
        ArrayList<Libro> listaLibros = obtenerListaLibros();
        frame = new JFrame("Sistema de Control de Préstamos de Libros");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creación del menú
        menuBar = new JMenuBar();

        // Creación del primer menú
        menu = new JMenu("Opciones");
        menuBar.add(menu);

        // Creación de los elementos del menú
        menuItem1 = new JMenuItem("Inscripción de estudiantes");
        menuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentForm studentForm = new StudentForm(listaEstudiantes);  // Crear una instancia del formulario de inscripción de estudiantes
                studentForm.setVisible(true);
            }
        });
        menu.add(menuItem1);

        menuItem2 = new JMenuItem("Solicitud de préstamos");
        menuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                LoanForm loanForm = new LoanForm(listaEstudiantes, listaLibros); // Crear una instancia del formulario de inscripción de estudiantes
                loanForm.setVisible(true);
                /*frame.getContentPane().removeAll();  // Remover todos los componentes del contenido actual
                frame.getContentPane().add(loanform);  // Agregar el formulario de inscripción de estudiantes al contenido
                frame.revalidate();  // Actualizar la ventana
                frame.repaint();  // Repintar la ventana*/
            }
        });
        menu.add(menuItem2);

        menuItem3 = new JMenuItem("Ver libros prestados");
        menuItem3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //LoanForm loanForm = new LoanForm(listaEstudiantes, listaLibros); // Crear una instancia del formulario de inscripción de estudiantes
                LibrosPrestadosViewer librosPrestadosViewer = new LibrosPrestadosViewer(listaEstudiantes);
                //LibrosPrestadosViewer.setVisible(true);
                /*frame.getContentPane().removeAll();  // Remover todos los componentes del contenido actual
                frame.getContentPane().add(loanform);  // Agregar el formulario de inscripción de estudiantes al contenido
                frame.revalidate();  // Actualizar la ventana
                frame.repaint();  // Repintar la ventana*/
            }
        });
        menu.add(menuItem3);

        // Asignación del menú a la ventana
        frame.setJMenuBar(menuBar);

        // Establecer el tamaño de la ventana
        frame.setSize(500, 400);

        // Hacer visible la ventana
        frame.setVisible(true);
    }

    /**
     * Método principal que inicia la interfaz gráfica de usuario.
     * @param args Los argumentos de línea de comandos.
     */
    public static void main(String[] args) {

        //Libro[] listaLibros = obtenerListaLibros();
        //ArrayList<Libro> this.listaLibros = obtenerListaLibros();

        SwingUtilities.invokeLater(() -> new SistemaDeBiblioteca());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Este método se activará cuando ocurra un evento de acción.
    }

    public static ArrayList<Libro> obtenerListaLibros() {
        ArrayList<Libro> libros = new ArrayList<>();

        libros.add(new Libro("9780143128218", "To Kill a Mockingbird", "Harper Lee", true, "Fiction"));
        libros.add(new Libro("9780061120084", "1984", "George Orwell", true, "Fiction"));
        libros.add(new Libro("9780544003415", "The Hobbit", "J.R.R. Tolkien", true, "Fantasy"));
        libros.add(new Libro("9780062692127", "The Great Gatsby", "F. Scott Fitzgerald", true, "Fiction"));
        libros.add(new Libro("9780316769532", "The Catcher in the Rye", "J.D. Salinger", true, "Fiction"));
        libros.add(new Libro("9780385472579", "The Alchemist", "Paulo Coelho", true, "Fiction"));
        libros.add(new Libro("9780142424179", "Pride and Prejudice", "Jane Austen", true, "Fiction"));
        libros.add(new Libro("9780140275410", "Animal Farm", "George Orwell", true, "Fiction"));
        libros.add(new Libro("9780062315007", "Dune", "Frank Herbert", true, "Science Fiction"));
        libros.add(new Libro("9781451673319", "The Martian", "Andy Weir", true, "Science Fiction"));
        libros.add(new Libro("9780765326355", "Ender's Game", "Orson Scott Card", true, "Science Fiction"));
        libros.add(new Libro("9780312427982", "Brave New World", "Aldous Huxley", true, "Science Fiction"));
        libros.add(new Libro("9781451635751", "Ready Player One", "Ernest Cline", true, "Science Fiction"));
        libros.add(new Libro("9780441013593", "Foundation", "Isaac Asimov", true, "Science Fiction"));
        libros.add(new Libro("9780141439518", "Frankenstein", "Mary Shelley", true, "Science Fiction"));
        libros.add(new Libro("9780452284234", "The Road", "Cormac McCarthy", true, "Science Fiction"));
        libros.add(new Libro("9780143111593", "Freakonomics", "Steven D. Levitt, Stephen J. Dubner", true, "Economics"));
        libros.add(new Libro("9780195335735", "The Black Swan", "Nassim Nicholas Taleb", true, "Economics"));
        libros.add(new Libro("9780195163806", "Gödel, Escher, Bach", "Douglas R. Hofstadter", true, "Mathematics"));
        libros.add(new Libro("9780716749929", "The Elegant Universe", "Brian Greene", true, "Physics"));
        libros.add(new Libro("9780387943803", "The Structure of Scientific Revolutions", "Thomas S. Kuhn", true, "Science"));
        libros.add(new Libro("9780521686157", "A Brief History of Time", "Stephen Hawking", true, "Physics"));
        libros.add(new Libro("9780812981605", "Sapiens: A Brief History of Humankind", "Yuval Noah Harari", true, "History"));
        libros.add(new Libro("9780143038580", "The Power of Now", "Eckhart Tolle", true, "Self-Help"));
        libros.add(new Libro("9780062315007", "Slaughterhouse-Five", "Kurt Vonnegut", true, "Fiction"));
        libros.add(new Libro("9780446310789", "To Kill a Mockingbird", "Harper Lee", true, "Fiction"));
        libros.add(new Libro("9780671027032", "The Hitchhiker's Guide to the Galaxy", "Douglas Adams", true, "Science Fiction"));
        libros.add(new Libro("9780345549334", "The Girl on the Train", "Paula Hawkins", true, "Mystery"));
        libros.add(new Libro("9780385317226", "The Da Vinci Code", "Dan Brown", true, "Mystery"));
        libros.add(new Libro("9780446310789", "The Hunger Games", "Suzanne Collins", true, "Young Adult"));
        libros.add(new Libro("9781408855652", "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", true, "Fantasy"));
        libros.add(new Libro("9781401201196", "Watchmen", "Alan Moore, Dave Gibbons", true, "Graphic Novel"));
        libros.add(new Libro("9780142402511", "The Picture of Dorian Gray", "Oscar Wilde", true, "Fiction"));
        libros.add(new Libro("9780451524935", "Dracula", "Bram Stoker", true, "Horror"));
        libros.add(new Libro("9780140274116", "The Odyssey", "Homer", true, "Poetry"));
        libros.add(new Libro("9780679732266", "The Stranger", "Albert Camus", true, "Fiction"));
        libros.add(new Libro("9780743273565", "The Kite Runner", "Khaled Hosseini", true, "Fiction"));
        libros.add(new Libro("9780743273565", "The Lord of the Rings", "J.R.R. Tolkien", true, "Fantasy"));
        libros.add(new Libro("9780765326362", "Harry Potter and the Deathly Hallows", "J.K. Rowling", true, "Fantasy"));
        libros.add(new Libro("9780765378743", "The Book Thief", "Markus Zusak", true, "Fiction"));
        libros.add(new Libro("9780810984255", "The Diary of a Young Girl", "Anne Frank", true, "Biography"));
        libros.add(new Libro("9781400033416", "The Road Less Traveled", "M. Scott Peck", true, "Self-Help"));
        libros.add(new Libro("9780060850524", "The Tipping Point", "Malcolm Gladwell", true, "Psychology"));
        libros.add(new Libro("9780062312686", "Thinking, Fast and Slow", "Daniel Kahneman", true, "Psychology"));
        libros.add(new Libro("9780743269513", "The 7 Habits of Highly Effective People", "Stephen R. Covey", true, "Self-Help"));
        libros.add(new Libro("9780142004371", "The Count of Monte Cristo", "Alexandre Dumas", true, "Fiction"));
        libros.add(new Libro("9780062457714", "The Subtle Art of Not Giving a F*ck", "Mark Manson", true, "Self-Help"));
        libros.add(new Libro("9780812985580", "Born a Crime", "Trevor Noah", true, "Biography"));
        return libros;
    }
    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }
}
