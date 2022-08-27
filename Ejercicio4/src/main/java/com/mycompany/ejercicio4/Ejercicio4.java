package com.mycompany.ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {
private Scanner teclado;
private String[] nombres;
private float[] edades;

public void cargar(){
    teclado = new Scanner(System.in);
    nombres = new String [5];
    edades = new float [5];
    
    for(int f=0;f<nombres.length;f++){
        System.out.println("Ingrese nombres: ");
        nombres [f]= teclado.next();
        System.out.println("Ingrese edades: ");
        edades [f]= teclado.nextInt();
    }
    
}

public void mayoresEdad(){
    System.out.println("Personas mayores de edad.");
    for(int f=0;f<nombres.length;f++){
        if (edades [f]>=18){
            System.out.println(nombres[f]);
        }
    }
}
    public static void main(String[] args) {
        Ejercicio4 llamar =new Ejercicio4();
        llamar.cargar();
        llamar.mayoresEdad();
    }
}
