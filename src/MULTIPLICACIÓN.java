import java.util.Scanner;
public class MULTIPLICACIÓN {
    public static int MULTIPLICACIÓN(int num1, int num2) {
        int resultado = 0;
        for (int i = 0; i < num2; i++) {
            resultado += num1;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        try {
            System.out.print("Hola soy tu asistente virtual bienvenido: ");
            System.out.println();

            System.out.print("Ingrese el primer número: ");
            num1 = scanner.nextInt();
            System.out.print("Ingrese el segundo número: ");
            num2 = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Por favor, ingrese números enteros válidos.");
            return;
        }

        int resultado = MULTIPLICACIÓN (num1, num2);
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}

