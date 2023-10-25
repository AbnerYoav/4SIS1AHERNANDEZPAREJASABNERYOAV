//Vamos a crear un programa mediante el cual debemos tener un menú
//de selección para elegir alguna de las 14 opciones sig:
//1: Bono o descuento por edad
//2: Convertir números decimales a binarios
//3: Convertir temperaturas
//4: Número de positivos y negativos
//5: Tiendita
//6: Área y Perímetro
//7: Tabla
//8: Factorial
//9: Dibujitos
//10: Figura Hueca
//11: Patrón
//12: Diamante
//13: Calculadora
//14: Salir

// Declarar son las librerías que vamos a ocupar
//Se debe estructurar el tipo de dato acorde a su entrada
// Si es entero obtenerlo como entero, si es char, obtenerlo como char
import java.util.Scanner;

class EstructurasControl{

    //Método Principal
    public static void main(String[] args){
        //el manejo de objetos, nos ayuda a poder instancear, (mandando a llamar al objeto)
        //para hacer instancia, es necesario 1: Identificar el tipo de objeto
        //2: nombrar al objeto
        //3: Crear al objeto
        Scanner entrada = new Scanner (System.in);
        Scanner lector = new Scanner (System.in);

        //Crear una instancia del objeto de la entrada por defecto de la computadora
        //Vamos a identificar con Scanner el tipo de dato qu ese está instanceando
        //Entrada es el objeto que va a poder identificar si es int, double, float, etc.
        
        //Es declarar a las variables que se van a utilizar en el programa
        //las variables son de dos tipos, globales y locales
        //Si declaro dentro de un método es local

        int opcion = 0, numbinario, total, cantidadproducto, num1, edad, lado;
        float precio, area, perimetro, base, altura, resultado = 0;
        Double descuento, multiplicacion, s, Perimetro, Area, radio, Altura;
        double gradoF = 0;
        double gradoC = 0;
        double gradoK = 0;
        double gradoR = 0;
        double compra = 0;
        String nombreproducto, binario = "";
        char letra;

        do{
            //aquí va todo el programa
            System.out.println("Bienvenido al programa feo ;3");
            System.out.println("Elije alguna opción deseada: ");
            System.out.println("1- Descuento por edad ");
            System.out.println("2- Convertir número decimal a binario ");
            System.out.println("3- Convertir Temperaturas");
            System.out.println("4- Números Positivos y Negativos");
            System.out.println("5- Tiendita");
            System.out.println("6- Area y Perímetro");
            System.out.println("7- Tabla");
            System.out.println("8- Factorial");
            System.out.println("9- Dibujito");
            System.out.println("10- Figura Hueca");
            System.out.println("11- Patrones de Código");
            System.out.println("12- Diamante");
            System.out.println("13- Calculadora");
            System.out.println("14- Salir");

            opcion = entrada.nextInt();

            //menu
            switch(opcion){
                case 1:
                //Descuento por edad

                System.out.println("Ingrese el monto de la compra: ");
                compra = lector.nextDouble();

                System.out.println(" Ingrese su edad: ");
                edad = entrada.nextInt();

                if (edad > 65 ){

                  System.out.println("Se le hara el descuento del 40%");


                } else if (edad <= 21 ){
                   System.out.println("¿Tus padres son socios? (Si/No)");
                   Scanner scanne = new Scanner(System.in);
                opcion = scanner.nextInt();

                }
                   break;

                case 2:
                //Decimal a Binario
                 System.out.println("Ingresa un numero positivo entero que desee convertir a binario");
                 numbinario = entrada.nextInt();
                 //Primero tengo que saber que sea positivo
                if(numbinario > 0 ){
                    //se cuantas veces el número se va a dividir entre 2?
                    while(numbinario >0){
                        if (numbinario%2 == 0){
                            binario = "0" + binario;
                        } else{
                            binario = "1" + binario;
                        }
                        numbinario = (int)numbinario/2;
                    }

                 } else if(numbinario == 0){
                    binario = "0" + binario;
                 }else{
                    binario = "No se puede convertir un numero negativo no mms";
                 }
                 System.out.println("El número binario es: " + binario);
                   break;
                case 3:
                //Temperatura

                System.out.println("Escribe 1 si quieres pasar de °C a °F, escribe 2 si quieres pasar de °F a °C, escriba 3 si quieres pasar de kelvine a rankine o escribe 4 si quieres pasar de rankine a kelvine");
                Scanner scanner = new Scanner(System.in);
                opcion = scanner.nextInt();

                if(opcion == 1) {
                    System.out.println("Cuantos °C quieres convertir a °F: ");
                    gradoC = scanner.nextDouble();
                    gradoF = (gradoC*9/5) + 32;
                    System.out.println(gradoC + "°C Equivale a " + gradoF + "°F");
                
                } if(opcion == 2) {
                    System.out.println("Cuantos °F quieres convertir a °C: ");
                    gradoC = scanner.nextDouble();
                    gradoF = ((gradoF - 32)*5/9);
                    System.out.println(gradoF + "°F Equivale a " + gradoC + "°C");
                
                } if(opcion == 3) {
                    System.out.println("Cuantos °K quieres convertir a °R");
                    gradoK = scanner.nextDouble();
                    gradoR = (gradoK * 1.8);
                    System.out.println(gradoK + "°K equivale a " + gradoR + "°R");

                } if(opcion == 4) {
                    System.out.println("Cuantos °R quieres convertir a °K: ");
                    gradoK = scanner.nextDouble();
                    gradoR = (gradoR * 5/9);
                    System.out.println(gradoR + "°R equivale a " + gradoK + "°K");

                }

                   break;

                case 4:
                //Positivos y negativos
                        int cantidadNumeros, numero;
                        int contarPositivos = 0;
                        int contarNegativos = 0;
                        
                        System.out.print("Ingresa la cantidad de números: ");
                        cantidadNumeros = scanner.nextInt();
                        
                        for (int i = 1; i <= cantidadNumeros; i++) {
                            System.out.print("Ingresa el número " + i + ": ");
                            numero = scanner.nextInt();
                            
                            if (numero > 0) {
                                contarPositivos++;
                            } else if (numero < 0) {
                                contarNegativos++;
                            }
                        }
                        
                        System.out.println("Cantidad de números positivos: " + contarPositivos);
                        System.out.println("Cantidad de números negativos: " + contarNegativos);
                        
                        scanner.close();

                    break;

                case 5:
                  System.out.println("Bienvenido a la tiendita kawaii");
                  System.out.println("Por favor ingrese el numero de productos que desea comprar");
                  total = entrada.nextInt();

                  for (int i = 1; i <= total; i++){
                    System.out.println("Ingrese el nombre del producto: ");
                    nombreproducto = entrada.next();
                    System.out.println("Ingrese el precio: ");
                    precio = entrada.nextFloat();
                    System.out.println("Ingrese la cantidad del producto: ");
                    cantidadproducto = entrada.nextInt();
                    //operacion
                    resultado = precio * cantidadproducto;
                    compra = compra + resultado; // compra += resultado;

                  }
                  System.out.println("El total de la compra es: " + compra);
                  compra = 0;
                    break;
                case 6:
                //Area y perimetro
                Scanner input = new Scanner(System.in);
                Scanner sc = new Scanner (System.in);
                System.out.println("Bienvenido, por favor seleccione una de las figuras");
                System.out.println(" Presione 1 si quiere sacar el area y perimetro del rectangulo, Presione 2 si quiere sacar el perimetro y area del triangulo, presione 3 si quiere sacar el volumen de una esfera o presione 4 si quiere sacar el volumen de un cilindro");
                scanner = new Scanner(System.in);
                opcion = scanner.nextInt();

                if (opcion == 1) {
                    System.out.println("Ingrese la base del rectangulo: ");
                    base = input.nextFloat();
                    System.out.println("Ingrese la altura");
                    altura = input.nextFloat();
                    area = base * altura;
                    perimetro = (base * altura) *2;
                    System.out.println("El area del rectangulo es: "+area+" cm2");
                    System.out.println("El perimetro es: "+perimetro+" cm");
                    input.close();
                
                } if( opcion == 2) {
                    System.out.println("Ingrese la longitud del primer lado del triángulo: ");
                    double lado1 = sc.nextDouble();
                    System.out.println("Ingrese la longitud del segundo lado del triángulo: ");
                    double lado2 = sc.nextDouble();
                    System.out.println("Ingrese la longitud del tercer lado del triángulo: ");
                    double lado3 = sc.nextDouble();

                    Perimetro = lado1 + lado2 + lado3;
                    s = Perimetro / 2;
                    Area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
                    System.out.println("El perímetro del triángulo es: " + Perimetro);
                    System.out.println("El área del triángulo es: " + Area);
                    sc.close();
                } if (opcion == 3){
                    scanner = new Scanner(System.in);
                    System.out.print("Ingrese el radio de la esfera: ");
                    radio = scanner.nextDouble();

                    double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
                    System.out.println("El volumen de la esfera con radio " + radio + " es " + volumen);
                    
                    scanner.close();
                } if (opcion == 4){
                    scanner = new Scanner(System.in);
                    System.out.print("Ingresa el radio del cilindro: ");
                    radio = scanner.nextDouble();
                    
                    System.out.print("Ingresa la altura del cilindro: ");
                    Altura = scanner.nextDouble();
                    double volumen = Math.PI * Math.pow(radio, 2) * altura;
                    System.out.println("El volumen del cilindro es: " + volumen);
                    
                    scanner.close();    
                }

                    break;
                case 7:
                
                int[][] data = {
                    {1, 10, 100, 1000},
                    {2, 20, 200, 2000},
                    {3, 30, 300, 3000},
                    {4, 40, 400, 4000},
                    {5, 50, 500, 5000},
                    {6, 60, 600, 6000},
                    {7, 70, 700, 7000},
                    {8, 80, 800, 8000},
                    {9, 90, 900, 9000},
                    {10, 100, 1000, 10000}
                };
                
                System.out.printf("%-10s%-10s%-10s%-10s%n", "Col 1", "Col 2", "Col 3", "Col 4");
                System.out.println("--------------------------------");


                for (int[] row : data) {
                     System.out.printf("%-10d%-10d%-10d%-10d%n", row[0], row[1], row[2], row[3]);
                    
                    } 

                    break;

                case 8:
                long factorial = 1;
                System.out.println("Bienvenido al programa para un factorial");
                    System.out.println("Introduzca el numero para el factorial");
                    int num = entrada.nextInt();
                    for (int i = 1; i<= num; i++){
                    factorial *= i;
                    }
                    System.out.println("El factorial de " + num + " es: " + factorial);
                    break;

                case 9:
                System.out.print("Ingrese el tamaño del lado del cuadrado (entre 1 y 20): ");
                lado = scanner.nextInt();
                // Verificar si el valor ingresado está dentro del rango permitido
                
                if (lado >= 1 && lado <= 20) {
                    for (int i = 0; i < lado; i++) {
                // Itegrar a través de las columnas
                for (int j = 0; j < lado; j++) {
                    // Imprimir un asterisco en cada posición
                    System.out.print("* ");
                }
                // Salto de línea al final de cada fila
                System.out.println();
                }

                } else {
                    System.out.println("El tamaño del lado debe estar entre 1 y 20.");
                }
                scanner.close();

                    break;

                case 10:
                System.out.print("Ingrese el tamaño del lado del cuadrado (entre 1 y 20): ");
                lado = scanner.nextInt();
                // Verificar si el valor ingresado está dentro del rango permitido
                if (lado >= 1 && lado <= 20) {

                    for (int i = 0; i < lado; i++) {
                        // En la primera y última fila, imprimir asteriscos en todas las posiciones
                        if (i == 0 || i == lado - 1) {
                            for (int j = 0; j < lado; j++) {
                                System.out.print("* ");
                            }
                        } else {
                            System.out.print("* ");
                            for (int j = 1; j < lado - 1; j++) {
                                System.out.print("  ");
                            }
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("El tamaño del lado debe estar entre 1 y 20.");
                }
                
                scanner.close();

                    break;

                case 11:
                int filas = 8; // Número de filas del patrón
                
                for (int i = 1; i <= filas; i++) {
                    for (int j = 1; j <= filas; j++) {
                        if ((i + j) % 2 == 0) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                        System.out.println(); // Salto de línea al final de cada fila
                    }
                }

                    break;
                case 12:
                filas = 7; // Número de filas del diamante (debe ser impar)
                for (int i = 1; i <= filas; i++) {
                    for (int j = 1; j <= filas - i; j++) {
                        System.out.print(" ");
                    }
                    
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println(); // Salto de línea al final de cada fila
                }
                
                for (int i = filas - 1; i >= 1; i--) {
                    for (int j = 1; j <= filas - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                    break;
                case 13:
                    break;
                case 14:
                    break;


            }

            //aquí adentro de preguntar
            System.out.println("Deseas repetir el programa? Presiona S para Sí");
            //Vamos a leer elprimer caracter de la entrada por defecto de la computadora
            letra = entrada.next().charAt(0);


        } while (letra == 's' || letra == 'S');
    }
}