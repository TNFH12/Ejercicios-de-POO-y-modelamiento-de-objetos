package ejercicio6;
import java.util.*;
/**
 *
 * @author tania
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n = 0, m = 0; 
       Scanner sca = new Scanner(System.in);
       System.out.println("Digite el numero de la lista: ");
       n = sca.nextInt();
       int [] vector = new int [n];
       for(int i = 0; i < vector.length; i++){
           do{
           vector[i] = sca.nextInt();
           }while(vector[i]== vector[i-1]);
        
       }
       for(int i = 0; i < vector.length; i++){
           //if(vector[i]== vector[i-1]){
            System.out.print(vector[i] + "\t"); 
        //}
       }
       
    }
    
}
