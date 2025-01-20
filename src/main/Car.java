package main;

    public class Car {
        private String brand;
        private String model;
        private int speed;

        public Car(String brand, String model) {
            this.brand = brand;
            this.model = model;
            this.speed = 0;
        }

        public void setBrand(String brand) {
         this.brand = brand;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getSpeed() {
            return speed;
        }

        public void status() {
            System.out.println("Auto: " + brand + " " + model + ", Nopeus: " + speed +" km/h");
        }

        public void accelerate(int change) {
        if (change > 0) {
            speed += change;
        } else {
            System.out.println("Nopeuden täytyy olla positiivinen luku.");
        }
    }

    public void decelerate(int change) {
        if (change > 0) {
            if (change > speed) {
                speed = 0;
            } else {
                speed -= change;
            }
        } else {
            System.out.println("Nopeuden täytyy olla positiivinen luku.");
        }
    }
    }