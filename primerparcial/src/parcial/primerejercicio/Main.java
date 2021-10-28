package parcial.primerejercicio;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Punto3D primerPunto = new Punto3D("0", "0", "7");

        System.out.println(primerPunto);



        Punto3D segundoPunto = new Punto3D("7","0","0");

        System.out.println(segundoPunto);


        Punto3D tercerPunto = new Punto3D("2");

        System.out.println(tercerPunto);

        Punto3D segundoPunto = new Punto3D(primerPunto.distanciaDesdeOrigen());
        Punto3D segundoPunto = new Punto3D(primerPunto.distanciaDesdeOtroPunto("0","0","0"));
        Punto3D segundoPunto = new Punto3D(primerPunto);

        Vector3D primerVector = new Vector3D("1","2");

        System.out.println(primerVector);


        Vector3D segundoVector = new Vector3D("3");

        System.out.println(segundoVector);

    }




}
