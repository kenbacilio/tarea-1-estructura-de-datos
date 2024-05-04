import javax.swing.JOptionPane;
import java.util.Arrays;

class OrdenarNumeros {

    public static void main(String[] args) {
        // Array para almacenar los números ingresados
        int[] numeros = new int[5];

        // Solicitar al usuario que ingrese los números
        for (int i = 0; i < 5; i++) {

            String input = JOptionPane.showInputDialog("Hola biemvenido Ingrese el número " + (i + 1) + ":");
            // Convertir la entrada a entero y almacenar en el array
            numeros[i] = Integer.parseInt(input);
        }

        // Ordenar los números de menor a mayor
        Arrays.sort(numeros);

        // Crear una cadena para imprimir los números ordenados
        StringBuilder resultado = new StringBuilder("Los números ordenados son: ");
        for (int i = 0; i < 5; i++) {
            // Agregar cada número al resultado
            resultado.append(numeros[i]);
            // Agregar una coma y un espacio si no es el último número
            if (i < 4) {
                resultado.append(", ");
            }
        }

        // Mostrar los números ordenados en una ventana emergente
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}