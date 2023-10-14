# Sistema de Control de Préstamos de Libros

Este repositorio contiene una aplicación diseñada para gestionar el sistema de préstamos de libros de una biblioteca pública. La aplicación está desarrollada en Java utilizando la librería gráfica Swing.

## Descripción del Caso

Una biblioteca pública del país requiere el desarrollo de un sistema de control de préstamos de libros. Los estudiantes activos en cualquier universidad o colegio pueden inscribirse en la biblioteca y, una vez inscritos, pueden solicitar préstamos de libros. Cada estudiante está identificado por su número de carnet, nombre, dirección y carrera que estudia. El sistema permite realizar consultas para determinar la cantidad de libros que un estudiante tiene en préstamo. Un estudiante no puede tener más de 6 libros en préstamo. De cada libro se conoce su código o ISBN, título, autor, disponibilidad para préstamo y su ubicación en la biblioteca.

## Interfaz Gráfica

Para el desarrollo de la interfaz gráfica de la aplicación, se utilizó la librería Swing de Java. Esta librería proporciona clases y componentes que permiten crear y personalizar la apariencia de ventanas y otros elementos de la interfaz. Se han utilizado clases como `JFrame`, `JLabel`, `JTextField`, `JButton`, entre otras.

## Comparativa de Librerías Gráficas

| Característica | Swing | JavaFX |
|----------------|-------|--------|
| Tipo de librería | Librería estándar de Java | Librería de interfaz gráfica de Java |
| Plataforma soportada | Plataformas que soporten Java | Plataformas que soporten Java |
| Lanzamiento | Introducido en JDK 1.2 | Introducido en Java SE 8 |
| Arquitectura | Basada en AWT (Abstract Window Toolkit) | Basada en una arquitectura moderna y escalable |
| Estilo de programación | Basada en Componentes | Basada en Cascading Style Sheets (CSS) y FXML |
| Personalización de apariencia | Menos flexible | Mayor flexibilidad y capacidad de personalización |
| Gráficos y animaciones | Gráficos básicos y animaciones sencillas | Potentes capacidades gráficas y de animación |
| Herramientas de diseño | Menos herramientas de diseño gráfico | Herramientas de diseño gráfico más avanzadas |
| Interoperabilidad | Buena interoperabilidad con aplicaciones más antiguas | Mejor interoperabilidad y compatibilidad con tecnologías web |
| Popularidad y comunidad | Ampliamente utilizado y comunidad activa | Aumentando su popularidad y comunidad activa |

## Eventos en la Interfaz Gráfica

- En la ventana principal, al hacer clic en "Opciones", se despliega un menú con 3 opciones.
- Al seleccionar "Inscripción de estudiantes", se carga la ventana correspondiente con funciones CRUD.
- Al seleccionar "Solicitud de préstamos", se solicita primero el carnet del estudiante y luego el ISBN del libro.
- Al seleccionar "Ver libros prestados", se muestra un listado de los libros prestados y a quién se les prestó.

---

**Creado por Jorge Peñaloza**


