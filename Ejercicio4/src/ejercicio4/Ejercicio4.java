/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.*;

/**
 *
 * @author tania
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         List<Vehicle> v = new ArrayList<Vehicle>();
         vehicle_v s = new vehicle_v();
         for(int i = 0; i < 10; i++){
         s.createList((ArrayList<Vehicle>) v);
         }
         for(Vehicle list:v){
             System.out.println(list);
         }
    }
    
}
