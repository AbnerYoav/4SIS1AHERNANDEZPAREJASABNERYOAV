public class Huron extends Animal{

    //como se puede heredar todas las caracteristicas de la clase padre 

    private String cantidadcomida;

 
    public Huron(String nombre,String raza,String tipoalimento,int edad, String cantidadcomida){
    //y para poder acceder a la clase se utiliza la palabra reservada super
    super(nombre, raza, tipoalimento, edad);
    this.cantidadcomida = cantidadcomida;
    }


    public void setCantidadcomida(String cantidadcomida){
        this.cantidadcomida = cantidadcomida;
    }
    public String getCantidadcomida(){
        return cantidadcomida;
    }

    public void mostrarhuron(){
        System.out.println("El nombre del huron es: "+ getNombre() + "\n"
        +"La raza del huron es: "+ getRaza() + "\n"
        +"Se alimenta de: "+ getTipoalimento() + "\n"
        +"El huron tiene la edad de : "+ getEdad() + "\n"
        +"la cantidad de la comida del hueron es: "+ cantidadcomida+ "\n");

    }
}