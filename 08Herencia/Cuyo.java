public class Cuyo extends Animal{

    //como se puede heredar todas las caracteristicas de la clase padre 

    private String genero;


    public Cuyo(String nombre,String raza,String tipoalimento,int edad, String genero){
    //y para poder acceder a la clase se utiliza la palabra reservada super
    super(nombre, raza, tipoalimento, edad);
    this.genero = genero;
    }


    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return genero;
    }

    public void mostrarcuyo(){
        System.out.println("El nombre del cuyo es: "+ getNombre() + "\n"
        +"La raza del cuyo es: "+ getRaza() + "\n"
        +"Se alimenta de: "+ getTipoalimento() + "\n"
        +"El cuyo tiene la edad de : "+ getEdad() + "\n"
        +"El genero del conejo es: "+ genero+ "\n");

    }
}