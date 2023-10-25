import java.util.Scanner;

public class LeerNumeros {

    public static void main(String[] args) {
        // Crear un array para almacenar los números enteros
        int[] numerosEnteros = new int[10];

        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Usar un bucle for para leer 10 números enteros desde el teclado
        for (int i = 0; i < 10; i++) {
            try {
                System.out.print("Ingrese el número " + (i + 1) + ": ");
                numerosEnteros[i] = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Ingrese un número entero válido.");
                // Limpiar el buffer del scanner para evitar bucles infinitos
                scanner.nextLine();
                i--;  // Restar 1 al índice para volver a solicitar el mismo número
            }
        }

        // Cerrar el scanner para evitar fugas de recursos
        scanner.close();

        // Imprimir el array con los números ingresados
        System.out.println("Los números ingresados son:");
        for (int numero : numerosEnteros) {
            System.out.print(numero + " ");
        }
    }
}
