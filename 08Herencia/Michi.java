//Para poder aplicar la herencia a una clase, se utiliza la palabra reservada extends

public class Michi extends Animal {

    //Como puede heredar todas las caracteristicas de la clase padre 

    private int num_vidas;

    public Michi(String nombre, String raza, String tipoalimento, int edad, int num_vidas){
        //Y para poder acceder a la clase padre se utiliza la palabra reservada super
        super(nombre, raza, tipoalimento, edad);
        this.num_vidas = num_vidas;
    }

    //get y set 

    public void setNum_vida(int setnum_vida){
        this.num_vidas = num_vidas;
    }

    public int getNum_vida(){
        return num_vidas; 
    }

    public void mostrarMichi(){
        System.out.println("El nombre del michi es : " + getNombre() + "\n"
                        + "La raza del michi es : " + getRaza() + "\n"
                        + "Se alimenta de : " + getTipoalimento() + "\n"
                        + "El michi tiene la edad de : " + getEdad() + "\n"
                        + "Las vidas del michi son : " + num_vidas + "\n");
    }


}