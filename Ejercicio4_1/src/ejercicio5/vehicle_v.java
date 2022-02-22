package ejercicio5;

import java.util.*;

/**
 *
 * @author tania
 */
public class vehicle_v {

    Scanner sca = new Scanner(System.in);
    public String id, crew_member, number_of_wheels, registration_date, communting, tipo;
    public int passenger_number,op;

    public void createList(ArrayList<Vehicle> Introduce) {
        System.out.println("Ingrese una Id");
        id = sca.next();
        System.out.println("Ingrese un numero de pasajeros");
        passenger_number = sca.nextInt();
        System.out.println("Estado de tripulante\n 1.Presencia\n 2.Ausencia");
        op = sca.nextInt();
        switch (op) {
            case 1:
                crew_member = "Presencia";
                break;
            case 2:
                crew_member = "Ausencia";
                break;
        }
        System.out.println("Ingrese el numero de ruedas");
        number_of_wheels = sca.next();
        System.out.println("Ingrese fecha de matriculacion");
        registration_date = sca.next();
        System.out.println("Ingrese medio que se desplaza\n1.Agua\n 2.Tierra");
        op = sca.nextInt(op);
         switch (op) {
            case 1:
                communting = "Agua";
                break;
            case 2:
                communting = "Tierra";
                break;
        }
        switch (passenger_number) {
            case 1:
                tipo = "Bicicleta";
                break;
            case 2:
                tipo = "Moto";
                break;
            case 3:
                tipo = "Camion";
                break;
            case 4:
                tipo = "Coche";
                break;
            case 5:
                tipo = "Lanza";
                break;
        }

        Introduce.add(new Vehicle(id, passenger_number, crew_member, number_of_wheels, registration_date, communting, tipo));

    }

}
