import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class CONSOLA {

    public static int calcularEdad(int añoNacimiento) {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(añoNacimiento, 1, 1); // Suponiendo 1 de enero del año de nacimiento
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        return periodo.getYears();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("hola biemvenido ayudame con tus datos: ");
        System.out.println();

        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido de la persona: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese el año de nacimiento de la persona: ");
        int añoNacimiento = scanner.nextInt();

        int edad = calcularEdad(añoNacimiento);

        System.out.println("Hola, feliz día " + nombre + " " + apellido + ", usted tiene " + edad + " años de edad un placer ayudarte.");

        scanner.close();
    }
}