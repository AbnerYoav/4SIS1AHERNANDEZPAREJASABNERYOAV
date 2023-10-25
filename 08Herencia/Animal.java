// Vamos a crear una tienda de mascotas de adopcion

import java.util.Scanner;

public class Animal {

    /*principio de encapsulamiento Es poder restrimgir el acceso a los datos, vamos a poder agrupar
    *en una clase el acceso a los diferentes atributos y metodos u objetos de la clase para que no puedan ser modificados 
    *desde otro lugar
    */

    //definir las variables
    private String nombre, raza, tipoalimento;
    private int edad;

    //se debe de crear el constructor, el contructor sirve para poder declarar
    //la existencia de una clase, para poder inicializar las variables, 
    //para crear las instancias de una clase 

    public Animal(){
        //contructor por defecto
    }

    //cuando  existe una construccion del objeto, de acuerdo a las necesidades
    //por parte del usuario es necesario utilizar la sobrecarga de lso metodos
    //en este caso la sobre carga del contructor

    //parametros del registro
    public Animal (String nom,String raza,String tipoalimento,int edad){
        //pero como son privados los atributos, debemos tener una forma de  acceso
        //la palabra reservada this, nos sirve para poder acceder a los atributos privados

        this.nombre = nom;
        this.raza = raza;
        this.tipoalimento = tipoalimento;
        this.edad = edad;
    }

    //para poder modificar los valores  de la asignacion, es necesario poder utilizar los metodos:
    //getter and setter
    //get ----obtener ----recibir
    //set ----asignar ----enviar
    
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nom){
        this.nombre = nom;
    }

    public String getRaza(){
        return raza;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }

    public String getTipoalimento(){
        return tipoalimento;
    }

    public void setTipoalimento(String tipoalimento){
        this.tipoalimento = tipoalimento;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }


     //variables
    int opcion;
    char letra;
   
    //Entrada de datos
    Scanner entrada = new Scanner(System.in);

    //metodos

    public void menu(){
      
       do{
            System.out.println("Bienvenido al programa donde muestra informacion de una mascota");
            System.out.println("Elija una opcion deseada: ");
            System.out.println("1.Michi");
            System.out.println("2.Perro");
            System.out.println("3.Hamster");
            System.out.println("4.Conejo");
            System.out.println("5.Cuyo");
            System.out.println("6.Huron");
            System.out.println("Salir");

            //obtener la lectura de la opcion 
            opcion = entrada.nextInt();

            switch(opcion){
                case 1:
                Michi michi = new Michi("Morgana", "De la calle", "Atun",6,"7 vidas");
                michi.mostrarMichi();
                case 2:
                Perro perro = new perro("Walter", "Huski","Retaso",3,"Alto");
                perro.mostrarPerro();
                    break;
                case 3 :
                Hamster hamster = new Hamster("Mandarina", "Tienda de mascota","Semillas de girasol",4,"Gordito");
                hamster.mostrarHamster();
                    break;
                case 4 :
                Conejo conejo = new conejo("Boris", "Campo","Zanahorias",44,"Negro");
                Conejo.mostrarconejo();
                    break;
                case 5 :
                Cuyo cuyo = new cuyo("Nugget", "Tienda de mascotas","verduras",5,"hembra");
                Cuyo.mostrarcuyo();
                    break;
                case 6 :
                Huron huron = new huron("Mofin", "Hurón Bull","Ratones",5,"Moderada");
                Huron.mostrarhuron();
                    break;
                default: 
                    System.out.println("Gracias por elegir este programa");
                    break;
            }
            System.out.println("Deseas repetir el programa digital S");
            letra = entrada.next().charAt(0);

        }while(letra == 'S' || letra == 's');

    }
}