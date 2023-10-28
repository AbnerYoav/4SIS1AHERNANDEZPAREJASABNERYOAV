public class Rectangulo extends Figura{
    double alto;
    double ancho;
 
    public Rectangulo(double alto, double ancho, double area, double perimetro) {
        super(area, perimetro);
        System.out.println("Coloca el alto del recangulo");
        Scanner sc= new Scanner(System.in);
        this.alto = sc.nextDouble();
        System.out.println("Ahora el ancho");
        this.ancho = sc.nextDouble();
    }
 
    public double getArea() {
 
        return alto*ancho;
    }
 
    public void setArea(double area) {
        this.area = area;
    }
 
    public double getPerimetro() {
        return alto*2.0+ancho*2.0;
    }
 
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
 
    public double getAlto() {
        return alto;
    }
 
    public void setAlto(double alto) {
        System.out.println("Coloque lo alto");
        Scanner sc= new Scanner(System.in);
        this.alto = sc.nextDouble();
    }
 
    public double getAncho() {
        return ancho;
    }
 
    public void setAncho(double ancho) {
        System.out.println("Ahora el ancho");
        Scanner sc= new Scanner(System.in);
        this.ancho = sc.nextDouble();
    }
}