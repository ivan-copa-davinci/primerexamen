package parcial.primerejercicio;

public class Punto3D {
    //ATRIBUTOS
    double x;
    double y;
    double z;

    //CONSTRUCTOR

    public Punto3D (double x, double y, double z) {

        this.x = x;
        this.y = y;
        this.z = z;

    }

    public Punto3D (double x){

        this.x = x;
        this.y = y;

    }

    public Punto3D (){
        this.x = 0;
        this.y = 0;
        this.z = 0;

    }

    //METODO

    public double distanciaDesdeOrigen (){

        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));

    }

    public double distanciaDesdeOtroPunto (double x, double y, double z){

        return Math.sqrt(Math.pow(x-x,2)+Math.pow(y-y,2)+Math.pow(z-z,2));

    }

    @Override
    public String toString (){

        return "El punto tiene coordenadas: ( " + this.x + " , " + this.y + " ) ";

    }

}
