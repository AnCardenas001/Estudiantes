import java.util.Scanner;

public class Estudiante {

    private String nombre;
    private String fechaNacimiento;
    private double notaMateria1;
    private double notaMateria2;
    private double notaMateria3;

    /**
     * Complejidad temporal: O(1) constante
     */
    public Estudiante() {
    }

    /**
     * Obtiene el nombre del estudiante.
     * @return El nombre del estudiante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del estudiante.
     * @param nombre El nombre del estudiante.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la fecha de nacimiento del estudiante como una cadena.
     * @return La fecha de nacimiento en formato dd/MM/yyyy.
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Establece la fecha de nacimiento del estudiante como una cadena.
     * @param fechaNacimiento La fecha de nacimiento en formato dd/MM/yyyy.
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Obtiene la nota de la materia 1.
     * @return La nota de la materia 1.
     */
    public double getNotaMateria1() {
        return notaMateria1;
    }

    /**
     * Establece la nota de la materia 1.
     * @param notaMateria1 La nota de la materia 1.
     */
    public void setNotaMateria1(double notaMateria1) {
        this.notaMateria1 = notaMateria1;
    }

    /**
     * Obtiene la nota de la materia 2.
     * @return La nota de la materia 2.
     */
    public double getNotaMateria2() {
        return notaMateria2;
    }

    /**
     * Establece la nota de la materia 2.
     * @param notaMateria2 La nota de la materia 2.
     */
    public void setNotaMateria2(double notaMateria2) {
        this.notaMateria2 = notaMateria2;
    }

    /**
     * Obtiene la nota de la materia 3.
     * @return La nota de la materia 3.
     */
    public double getNotaMateria3() {
        return notaMateria3;
    }

    /**
     * Establece la nota de la materia 3.
     * @param notaMateria3 La nota de la materia 3.
     */
    public void setNotaMateria3(double notaMateria3) {
        this.notaMateria3 = notaMateria3;
    }

    /**
     * Calcula la edad del estudiante en base a la fecha de nacimiento.
     * @return La edad del estudiante en años.
     */
    public int getEdad() {
        int anioActual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        int anioNacimiento = Integer.parseInt(fechaNacimiento.substring(6));
        return anioActual - anioNacimiento;
    }

    /**
     * Calcula el promedio de las notas del estudiante.
     * @return El promedio de las notas.
     */
    public double getPromedio() {
        return (notaMateria1 + notaMateria2 + notaMateria3) / 3;
    }

    /**
     * Permite al usuario ingresar los datos del estudiante utilizando la consola.
     */
    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        this.nombre = scanner.nextLine();

        System.out.print("Ingrese la fecha de nacimiento (en formato dd/MM/yyyy): ");
        this.fechaNacimiento = scanner.nextLine();

        System.out.print("Ingrese la nota de la materia 1: ");
        this.notaMateria1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingrese la nota de la materia 2: ");
        this.notaMateria2 = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingrese la nota de la materia 3: ");
        this.notaMateria3 = Double.parseDouble(scanner.nextLine());
    }

    /**
     * Imprime los datos del estudiante en la consola.
     */
    public void imprimirDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Fecha de nacimiento: " + this.fechaNacimiento);
        System.out.println("Edad: " + this.getEdad() + " años");
        System.out.println("Nota Materia 1: " + this.notaMateria1);
        System.out.println("Nota Materia 2: " + this.notaMateria2);
        System.out.println("Nota Materia 3: " + this.notaMateria3);
        System.out.println("Promedio: " + this.getPromedio());
    }

}

