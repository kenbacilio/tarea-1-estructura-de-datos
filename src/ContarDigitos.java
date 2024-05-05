import java.util.Scanner;

public class ContarDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola saludos ingrese un número:");
        int numero = scanner.nextInt();

        int cantidadDigitos = ContarDigitos(numero);
        System.out.println("El número tiene " + cantidadDigitos + " dígitos muchas gracias fu un placer atenderlo.");
    }

    public static int ContarDigitos(int numero) {
        // Convertir el número a positivo para evitar problemas con el signo
        numero = Math.abs(numero);
        int contador = 0;

        // Contar los dígitos del número
        while (numero > 0) {
            numero = numero / 10;
            contador++;
        }

        return contador;
    }
}