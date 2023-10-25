import java.util.*;

public class cadena {

    Scanner entrada = new Scanner(System.in)


    public void cadenas(){

        String s1 = "Habia una vez un patito que decia miau miau, y queria un chocolatito";

        System.out.println("El tamaño de la cadena es: " + s1.lenght() );
        
        System.out.println("La cadena inicia V o F con la palabra chocolatito? ") + s1.endsWith("Chocolatito");

        System.out.println("Ingresa una palabra: ");
        String s2 = entrada.nextLine();

        System.out.println("Parte de una subcadena de s1 es: " + s1.indexOf("Patito"));

    }

}