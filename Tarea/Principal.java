//Realizar el area y perimetro de 
//un circulo
//rectangulo
//triangulo 

public class Principal {
 
    public static void main(String[] args) {
 
        boolean enEjecucion= true;
 
 
        do{
 
        System.out.println("1.Rectangulo");
        System.out.println("2.Circulo");
        System.out.println("3.Triangulo");
        System.out.println("Seleccione una opcion");
        Scanner sc = new Scanner (System.in);
        int opcion= sc.nextInt();

//Abriremos opcion multiple al resultado deseado
//El get y set son necesarios para obtener los resultados de las figuras
        switch(opcion){
            case 1:{
                Rectangulo rectangulo = new Rectangulo(0,0,0,0);
                System.out.println("El alto de un rectangulo es "+ rectangulo.getAlto()+ " y de ancho "+ rectangulo.getAncho()+
                " El area del rectangulo es "+ rectangulo.getArea()+ " y su perimetro es "+
                rectangulo.getPerimetro()
                );
                break;
            }
            case 2:{
                Circulo circulo = new Circulo (0,0,0);
                System.out.println("El radio del circulo es "+ circulo.getRadio()+ " con lo cual su area es "
                        + circulo.getArea()+ " y su perimetro es "+ circulo.getPerimetro());
                break;
            }
            case 3:{
                Triangulo triangulo = new Triangulo (0,0,0,0,0,0);
                System.out.println("El area del triangulo es "+ triangulo.getArea()+ " y su perimetro es "+
                        triangulo.getPerimetro());
                break;
            }
            default:{
                System.out.println("No existe, por favor introduzca una opción valida :b");
            }
 
        }

//Ahora podemos seleccionar si repetimos otra figura o le damos final al codigo
            System.out.println("¿Quiere poner otra figura? Y/N ");
            String respuesta = leerTeclado();
            if(respuesta.equalsIgnoreCase("N")){
            enEjecucion=false;
            }
 
        }while(enEjecucion);
    }
   private static String leerTeclado (){
   String retorno= "";
   Scanner sc =  new Scanner (System.in);
   retorno= sc.nextLine();
   return retorno;
  }
}