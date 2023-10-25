import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("-_-_- Validar palíndromos -_-_-");
        System.out.println("Digite la cadena");
        
        String cadena = scanner.nextLine();
        
        System.out.println(esPalindromo(cadena));
    }
    
    public static boolean esPalindromo(String cadena) {
        boolean sw = true;
        
        cadena = cadena.replace(" ", "");
        
        for (int i = 0; i < cadena.length() / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(cadena.length() - 1 - i)) {
                sw = false;
                break;
            }
        }
        
        return sw;
    }
}