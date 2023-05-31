/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. 
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList. 

 */
package main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MiriamNahuel
 */
public class Java2Encuentros1Al9Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creo las herramientas
        ArrayList<String> razasPerros = new ArrayList();
        Scanner lector = new Scanner(System.in);
        int continuar;

        //bucle
        do {

            System.out.println("Ingrese una nueva raza de perro");
            String nuevoPerro = lector.nextLine();
            razasPerros.add(nuevoPerro);

            System.out.println("Quiere añadir otra raza? 1-Si  2-No");
            continuar = lector.nextInt();
            lector.nextLine();
        } while (continuar != 2);
        
        System.out.println("Las razas en la lista son:");
        for (String raza : razasPerros) {
            System.out.println(raza);
        }
    }

}
