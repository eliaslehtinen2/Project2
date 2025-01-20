package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Anna auton merkki: ");
        String brand = sc.nextLine();
        System.out.print("Anna auton malli: ");
        String model = sc.nextLine();

        Car car = new Car(brand, model);

        boolean exit = false;

        while (!exit) {
            System.out.println("1) Näytä auton tila");
            System.out.println("2) Muokkaa auton merkkiä ja mallia");
            System.out.println("3) Kiihdytä autoa");
            System.out.println("4) Hidasta autoa");
            System.out.println("0) Lopeta ohjelma");

            if (sc.hasNext()) {
                int i = 0;
                String input = sc.nextLine();
                i = Integer.parseInt(input);

                switch (i) {
                    case 1:
                        car.status();
                        break;
                    case 2:
                        System.out.println("Anna uusi auton merkki:");
                        String newBrand = sc.nextLine();
                        car.setBrand(newBrand);

                        System.out.println("Anna uusi auton malli:");
                        String newModel = sc.nextLine();
                        car.setModel(newModel);
                        break;
                    case 3:
                        System.out.println("Kuinka monta km/h haluat kiihdyttää?");
                        int speedIncrease = Integer.parseInt(sc.nextLine());
                        car.accelerate(speedIncrease);
                        break;
                    case 4:
                        System.out.println("Kuinka monta km/h haluat hidastaa?");
                        int speedDecrease = Integer.parseInt(sc.nextLine());
                        car.decelerate(speedDecrease);
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
        }

        sc.close();
    }
}