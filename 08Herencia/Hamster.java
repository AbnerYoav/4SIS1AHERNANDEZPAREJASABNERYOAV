public class Hamster extends Animal{

    //como se puede heredar todas las caracteristicas de la clase padre 

    private String complexion;

 
    public Hamster(String nombre,String raza,String tipoalimento,int edad, String complexion){
    //y para poder acceder a la clase se utiliza la palabra reservada super
    super(nombre, raza, tipoalimento, edad);
    this.complexion = complexion;
    }


    public void setComplexion(String complexion){
        this.complexion = complexion;
    }
    public String getComplexion(){
        return complexion;
    }

    public void mostrarhamster(){
        System.out.println("El nombre del hamster es: "+ getNombre() + "\n"
        +"La raza del hamster es: "+ getRaza() + "\n"
        +"Se alimenta de: "+ getTipoalimento() + "\n"
        +"El hamster tiene la edad de : "+ getEdad() + "\n"
        +"La complexion del hamster es: "+ complexion + "\n");

    }
}