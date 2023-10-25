import java.util.Scanner;

public class PromedioPositivosNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int sumaPositivos = 0;
        int cantidadPositivos = 0;
        int sumaNegativos = 0;
        int cantidadNegativos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        sc.close(); // Corregido: Cerrar el scanner después del bucle

        for (int i = 0; i < 10; i++) {
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                cantidadPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                cantidadNegativos++;
            }
        }

        double promedioPositivos = cantidadPositivos > 0 ? (double) sumaPositivos / cantidadPositivos : 0;
        double promedioNegativos = cantidadNegativos > 0 ? (double) sumaNegativos / cantidadNegativos : 0;

        // Mostrar resultados
        System.out.println("Promedio de valores positivos: " + promedioPositivos);
        System.out.println("Promedio de valores negativos: " + promedioNegativos);
    }
}