package org.marv;
    public class Car {
        //atributos de la clase car
        private final String brand;
        private final String model;
        private final int year;
        private double km;

        //constructor que inicializa los atriutos
        public Car(String brand, String model, int year, double km) {

            this.brand = brand;
            this.model = model;
            this.year = year;
            this.km = 0;
        }

        //metodo donde se incrementa el km
        public void drive(double km) {
            if (km > 0) {
                this.km += km;
            }
        }
        //metodo para mostrar informacion actual del coche
        public void showInformation(){
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
            System.out.println("KM: " + km + "km");
        }
    }

