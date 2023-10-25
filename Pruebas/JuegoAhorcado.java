import java.util.Scanner;
import java.util.Arrays;

public class JuegoAhorcado {

    public static void main(String[] args) {
        String[] palabras = {"kawaii", "reprobar", "Llorar", "tronar", "bailar", "ingenio"};
        int posicionAleatoria = (int) Math.floor(Math.random() * palabras.length);
        String palabra = palabras[posicionAleatoria];

        System.out.println(palabra);

        char[] letras = palabra.toCharArray();
        char[] letrasConGuiones = new char[letras.length];

        for (int i = 0; i < letras.length; i++) {
            letrasConGuiones[i] = '_';
        }

        System.out.println(letrasConGuiones);

        int aciertos = 0;
        int fallos = 0;
        boolean hemosGanado = false;

        Scanner lector = new Scanner(System.in); 
        
        while (!hemosGanado) {
            System.out.println("Introduce una letra");
            char letraIntroducida = lector.next().charAt(0);

            boolean acierto = false;

            for (int i = 0; i < letras.length; i++) {
                if (letras[i] == letraIntroducida && letrasConGuiones[i] == '_') {
                    letrasConGuiones[i] = letraIntroducida;
                    aciertos++;
                    acierto = true;
                }
            }

            if (!acierto) {
                fallos++;
            }

            if (Arrays.equals(letras, letrasConGuiones)) {
                hemosGanado = true;
                System.out.println("Éxito");
            }

            System.out.println("Letras con guiones: " + Arrays.toString(letrasConGuiones));
            System.out.println("Aciertos: " + aciertos);
            System.out.println("Fallos: " + fallos);
        }

        lector.close();
    }
}