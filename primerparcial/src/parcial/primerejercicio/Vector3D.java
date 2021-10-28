package parcial.primerejercicio;

public class Vector3D {

    //ATRIBUTOS
    Punto3D puntoInicial;
    Punto3D puntoFinal;

    //CONSTRUCTOR

    public Vector3D (Punto3D puntoInicial, Punto3D puntoFinal){

        this.puntoInicial = puntoInicial;
        this.puntoFinal = puntoFinal;

    }

    public Vector3D (Punto3D puntoFinal){

        this.puntoFinal = puntoFinal;

    }
    //METODOS

    public double magnitudVector(){

        return Math.sqrt(Math.pow(puntoInicial)-Math.pow(puntoFinal));

    }

    public void mostrarComponentes(){

        System.out.println(puntoInicial.y + " , " + puntoFinal.y);
        System.out.println(puntoInicial.x + " , " +puntoFinal.x);
        System.out.println(puntoInicial.z + " , " +puntoFinal.z);

    }

    @Override
    public String toString (){

        return "El vector comienza en el punto:  " + this.puntoInicial + " , y termina en el punto " + this.puntoFinal;

    }

}
