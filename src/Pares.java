import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hola estudiante ingrese un número:");
        int numero = scanner.nextInt();

        System.out.println("Números pares entre 1 y " + numero + ":");
        for (int i = 2; i <= numero; i += 2) {
            System.out.print(i + " ");
        }
    }
}