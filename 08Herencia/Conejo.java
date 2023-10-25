public class Conejo extends Animal{

    //como se puede heredar todas las caracteristicas de la clase padre 

    private String color;

    
    public Conejo(String nombre,String raza,String tipoalimento,int edad, String color){
    //y para poder acceder a la clase se utiliza la palabra reservada super
    super(nombre, raza, tipoalimento, edad);
    this.color = color;
    }


    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public void mostrarconejo(){
        System.out.println("El nombre del conejo es: "+ getNombre() + "\n"
        +"La raza del conejo es: "+ getRaza() + "\n"
        +"Se alimenta de: "+ getTipoalimento() + "\n"
        +"El conejo tiene la edad de : "+ getEdad() + "\n"
        +"El color del conejo es: "+ color+ "\n");

    }
}