package ejercicio3;

import java.util.*;

/**
 *
 * @author tania
 */
public class array {

    int[] vector = new int[10];
    int i, j, aux;
    Scanner sca = new Scanner(System.in);

    public void random_numbers() {
        for (i = 0; i < vector.length; i++) {
            vector[i] = 1 + (int) (Math.random() * 20);
        }
        for (i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + "\t");
        }
    }

    public int [] bubble_method(int[] vector) {
        for (i = 0; i < vector.length - 1; i++) {
            for (j = 0; j < vector.length - i - 1; j++) {
                if (vector[j + 1] < vector[j]) {
                    aux = vector[j + 1];
                    vector[j + 1] = vector[j];
                    vector[j] = aux;
                }
            }
        }
       return vector;
    }

    public void quicksort(int[] vector, int izq, int der) {
        int pivote = vector[izq]; // tomamos primer elemento como pivote
        int i = izq;         // i realiza la búsqueda de izquierda a derecha
        int j = der;         // j realiza la búsqueda de derecha a izquierda
        int aux;

        while (i < j) {                          // mientras no se crucen las búsquedas                                   
            while (vector[i] <= pivote && i < j) {
                i++; // busca elemento mayor que pivote
            }
            while (vector[j] > pivote) {
                j--;           // busca elemento menor que pivote
            }
            if (i < j) {                        // si no se han cruzado                      
                aux = vector[i];                      // los intercambia
                vector[i] = vector[j];
                vector[j] = aux;
            }
        }

        vector[izq] = vector[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
        vector[j] = pivote;      // los menores a su izquierda y los mayores a su derecha

        if (izq < j - 1) {
            quicksort(vector, izq, j - 1);          // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            quicksort(vector, j + 1, der);          // ordenamos subarray derecho
        }

    }

    public void menu() {
        boolean exit = false;
        do {
            System.out.println("\n 1. Metodo burbuja");
            System.out.println("2. Metodo quicksort");
            System.out.println("3. Salir");
            /* con el metodo try catch limitamos las opciones del menu a 6, en caso de que el usuario
            ingrese un valor diferente se repetira el menu hasta que elija una opcion permitida.
             */
            try {

                System.out.println("Escribe una de las opciones");
                int option = sca.nextInt();

                switch (option) {
                    case 1:
                        bubble_method(vector);
                        
                    case 2:
                        quicksort(vector, 0, vector.length - 1);
                        for (i = 0; i < vector.length; i++) {
                            System.out.print(vector[i] + "\t");
                        }
                        break;
                    case 3:
                        exit = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sca.next();
            }
        } while (!exit);
    }

}
