package org.marv;

public class Main {
    public static void main(String[] args) {
        //creamos un objeto de la clase car
        Car micar = new Car("toyota", "yaris", 2024, 0);
        //mostramos informacion inicial del coche
        System.out.println("Informacion Inicial del coche");
        micar.showInformation();

        //Simulando que el coche conduce una distancia en kilometros
        micar.drive(150);

        //mostrar informacion actualizada del coche
        micar.showInformation();

    }
}