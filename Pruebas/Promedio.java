import java.util.Scanner;

public class promedio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido <3");
            System.out.println("Elije alguna opción deseada: ");
            System.out.println("1- Imprimir todas las calificaciones junto al promedio");
            System.out.println("2- Calificacion más alta y baja");
            System.out.println("3- El número de calificaciones superiores al promedio. ");

            opcion = entrada.nextInt();

            switch(opcion){
                case 1:
                System.out.println("Ingrese 10 calificaciones por favor");
                int cantidadcalificacion = scanner.nextInt();
                double[] calificaciones = new double[cantidadcalificacion];
                
                for (int i = 0; i < cantidadcalificacion; i++) {
                    System.out.print("Ingrese la calificación " + (i + 1) + ": ");
                    calificaciones[i] = scanner.nextDouble();
                }   
                    scanner.close();
                    System.out.println("Calificaciones ingresadas:");
                    for (int i = 0; i < cantidadCalificaciones; i++) {
                        
                        System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
                        double sumaCalificaciones = 0;
                        for (i = 0; i < cantidadCalificaciones; i++) {
                            
                            sumaCalificaciones += calificaciones[i];
                        }
                        double promedio = sumaCalificaciones / cantidadCalificaciones;
                        System.out.println("Promedio de calificaciones: " + promedio);
                        
                    }
                    
                    break;
                    
                case 2:
                System.out.print("Ingrese 10 calificaciones: ");
                int cantidadCalificaciones = scanner.nextInt();
                double[] calificaciones = new double[cantidadCalificaciones];
                
                for (int i = 0; i < cantidadCalificaciones; i++) {
                    System.out.print("Ingrese la calificación " + (i + 1) + ": ");
                    calificaciones[i] = scanner.nextDouble();
                }
                scanner.close();
                double calificacionMasAlta = calificaciones[0];
                double calificacionMasBaja = calificaciones[0];
                
                for (int i = 1; i < cantidadCalificaciones; i++) {
                    if (calificaciones[i] > calificacionMasAlta) {
                        calificacionMasAlta = calificaciones[i];
                    }
                    if (calificaciones[i] < calificacionMasBaja) {
                        calificacionMasBaja = calificaciones[i];
                    }
                }
                System.out.println("La calificación más alta es: " + calificacionMasAlta);
                System.out.println("La calificación más baja es: " + calificacionMasBaja);

                break;

                case 3:
                System.out.print("Ingrese la cantidad de calificaciones: ");
                int cantidadcalificaciones = scanner.nextInt();
                
                double[] calificaciones = new double[cantidadCalificaciones];
                for (int i = 0; i < cantidadCalificaciones; i++) {
                    System.out.print("Ingrese la calificación " + (i + 1) + ": ");
                    
                    calificaciones[i] = scanner.nextDouble();
                }
                scanner.close();
                
                double sumaCalificaciones = 0;
                for (int i = 0; i < cantidadCalificaciones; i++) {
                    sumaCalificaciones += calificaciones[i];
                }
                double promedio = sumaCalificaciones / cantidadCalificaciones;
                //  Se cuentan las calificaciones que están en el rango de 6 a 8 (Superior al promedio)
                int contadorCalificacionesSuperiores = 0;
                for (int i = 0; i < cantidadCalificaciones; i++) {
                    if (calificaciones[i] > promedio && calificaciones[i] > 6.0 && calificaciones[i] < 8.0) {
                        contadorCalificacionesSuperiores++;
                    }
                }
                System.out.println("Número de calificaciones por encima del promedio y en el rango de 6 a 8: " + contadorCalificacionesSuperiores);

                break;
            }
    }

}
        