package ejercicio1;

import java.lang.Math;
import java.util.*;

/**
 *
 * @author tania
 */
public class Planetary extends Gravitational_attraction {

    planetary_system p1 = new planetary_system("1", "Mercurio", "2017", "3:59", "Bachata", "RomeoSantos.jpg");
    planetary_system p2 = new planetary_system("2", "Venus", "2017", "4:52", "Bachata", "PrinceRoyce.jpg");
    planetary_system p3 = new planetary_system("3", "Tierra", "2000", "5:01", "Merengue", "EddyHerrera.jpg");
    planetary_system p4 = new planetary_system("4", "Marte", "1995", "4:42", "Merengue", "Loscantantes.jpg");
    planetary_system p5 = new planetary_system("5", "Jupiter", "2017", "3:24", "Rock", "Imagine Dragons.jpg");
    planetary_system p6 = new planetary_system("6", "Saturno", "2000", "4:57", "Rock", "Mago de oz.jpg");
    planetary_system p7 = new planetary_system("7", "Urano", "2013", "3:51", "Pop", "SelenaGomez.jpg");
    planetary_system p8 = new planetary_system("8", "Neptuno", "2011", "3:49", "Pop", "Adele.jpg");
    planetary_system p9 = new planetary_system("9", "Pluton", "1989", "2:32", "Clasica", "JulioJaramillo.jpg");
    public List<planetary_system> p = new ArrayList<planetary_system>();

    public double F, G = 6.67e-11, M1, M2, d1, d2, td, d;
    Scanner sca = new Scanner(System.in);

    @Override
    public void formula() {
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);
        p.add(p5);
        p.add(p6);
        p.add(p7);
        p.add(p8);
        p.add(p9);
        for(planetary_system ver : p){
            System.out.println(ver);
        }
        System.out.println("F(fuerza gravitacional en N)");
        System.out.println("G (Constante de gravitación universal) =  6,67·10^(-11) N·m^2/kg^2");
        System.out.println("M1 y M2: masa de los cuerpos (medida en kilogramos)");
        System.out.println("d1 y d2  (distancia del sol)");
        System.out.println("Ingresar M1 Y M2");
        M1 = sca.nextDouble();
        M2 = sca.nextDouble();
        System.out.println("Ingresar distancia");
        d1 = sca.nextDouble();
        d2 = sca.nextDouble();
        td = d1 - d2;
        d = Math.pow(td, 2);
        F = G * (M1 * M2 / d);
        System.out.println("Fuerza gravitacional es:" + F + "N");
    }

}
