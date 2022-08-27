package com.mycompany.ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {
private Scanner teclado;
private int[] sueldos;

public void carga(){
    teclado = new Scanner(System.in);
    sueldos = new int[5];
    for (int i=0;i<5;i++){
        System.out.println("Ingrese el valor para sueldos ["+i+"]: ");
        sueldos[i]=teclado.nextInt();
    }
}

public void imprimir(){
    for(int f=0;f<5;f++){
        System.out.println(sueldos[f]);
    }
}

    public static void main(String[] args) {
        Ejercicio1 llamar = new Ejercicio1();
        llamar.carga();
        llamar.imprimir();
    }
}
