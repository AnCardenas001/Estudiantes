import java.util.Scanner;

public class Estudiante {

    private String nombre;
    private String fechaNacimiento;
    private double notaMateria1;
    private double notaMateria2;
    private double notaMateria3;

    public Estudiante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getNotaMateria1() {
        return notaMateria1;
    }

    public void setNotaMateria1(double notaMateria1) {
        this.notaMateria1 = notaMateria1;
    }

    public double getNotaMateria2() {
        return notaMateria2;
    }

    public void setNotaMateria2(double notaMateria2) {
        this.notaMateria2 = notaMateria2;
    }

    public double getNotaMateria3() {
        return notaMateria3;
    }

    public void setNotaMateria3(double notaMateria3) {
        this.notaMateria3 = notaMateria3;
    }

    public int getEdad() {
        int anioActual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        int anioNacimiento = Integer.parseInt(fechaNacimiento.substring(6));
        return anioActual - anioNacimiento;
    }

    public double getPromedio() {
        return (notaMateria1 + notaMateria2 + notaMateria3) / 3;
    }

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
