package com.operacionconjuntos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        operaciones();
    }

    public static void operaciones(){
        try {
            Scanner sc = new Scanner(System.in);
        
            //Creación de los Sets
            Set<Integer> conjunto1 = new HashSet<Integer>();
            Set<Integer> conjunto2 = new HashSet<Integer>();
            int cant1, cant2,numero;

            System.out.print("\nCantidad de números para el primer conjunto ->  ");
            cant1 = sc.nextInt();
            System.out.print("\nCantidad de números para el segundo conjunto ->  ");
            cant2 = sc.nextInt();

            System.out.print("\nIngrese el primer conjunto: \n");
            for(int i = 0 ; i < cant1; i++){
                System.out.print("N°" + (i+1) + "-> ");
                numero = sc.nextInt();
                conjunto1.add(numero);
            }

            System.out.print("\nIngrese el segundo conjunto:\n ");
            for(int j = 0 ; j < cant2; j++){
                System.out.println("N°" + (j+1) + "-> ");
                numero = sc.nextInt();
                conjunto2.add(numero);
            }
            System.out.println("CONJUNTO #1 ->" + conjunto1);
            System.out.println("CONJUNTO #2 ->" + conjunto2 + "\n");

            //Union
            conjunto1.addAll(conjunto2);
            System.out.println("Unión: " + conjunto1);

            //Intersección 
            Set<Integer> interseccion = new HashSet<>(conjunto1);
            interseccion.retainAll(conjunto2);
            System.out.println("Intersección: " + interseccion);

            //Diferencia
            Set<Integer> diferencia = new HashSet<>(conjunto1);
            diferencia.removeAll(conjunto2);
            System.out.println("Diferencia: " + diferencia);

            sc.close();
        } catch (Exception e) {
            System.out.println("Ingresó caracteres incorrectos, se reinicia el programa. ");
            operaciones();
        }
        
    }
}