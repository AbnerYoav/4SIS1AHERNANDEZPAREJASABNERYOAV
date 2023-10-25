public class Perro extends Animal{

    //como se puede heredar todas las caracteristicas de la clase padre 

    private String tamaño;


    public Perro(String nombre,String raza,String tipoalimento,int edad, String tamaño){
    //y para poder acceder a la clase se utiliza la palabra reservada super
    super(nombre, raza, tipoalimento, edad);
    this.tamaño = tamaño;
    }


    public void setTamaño(String tamaño){
        this.tamaño = tamaño;
    }
    public String getTamaño(){
        return tamaño;
    }

    public void mostrarperro(){
        System.out.println("El nombre del perro es: "+ getNombre() + "\n"
        +"La raza del perro es: "+ getRaza() + "\n"
        +"Se alimenta de: "+ getTipoalimento() + "\n"
        +"El perro tiene la edad de : "+ getEdad() + "\n"
        +"El tamaño  del perro es: "+ tamaño+ "\n");

    }
}