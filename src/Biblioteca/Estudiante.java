package Biblioteca;

import java.util.ArrayList;

/**
 * La clase Estudiante representa a un estudiante en el sistema de préstamo de libros.
 */
public class Estudiante {
    // Atributos de la clase
    private String carnet;
    private String nombre;
    private String direccion;
    private String carrera;
    private ArrayList<Libro> librosPrestados;

    /**
     * Constructor de la clase Estudiante.
     * @param carnet El número del carnet del estudiante.
     * @param nombre El nombre del estudiante.
     * @param direccion La dirección del estudiante.
     * @param carrera La carrera que el estudiante está estudiando.
     */
    public Estudiante(String carnet, String nombre, String direccion, String carrera) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.direccion = direccion;
        this.carrera = carrera;
        this.librosPrestados = new ArrayList<>();
    }

    // Getters y Setters
    /**
     * @return El número del carnet del estudiante.
     */
    public String getCarnet() {
        return carnet;
    }

    /**
     * @param carnet El nuevo número de carnet del estudiante.
     */
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    /**
     * @return El nombre del estudiante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre El nuevo nombre del estudiante.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return La dirección del estudiante.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion La nueva dirección del estudiante.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return La carrera que el estudiante está estudiando.
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera La nueva carrera que el estudiante está estudiando.
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(ArrayList<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public void agregarLibroPrestado(Libro libro) {
        librosPrestados.add(libro);
    }
}
