package com.mycompany.ejercicio2;
import java.util.Scanner;
public class Ejercicio2 {
private Scanner teclado;
private float []altura;
private float promedio;

public void carga(){
    teclado = new Scanner (System.in);
    altura = new float[5];
    for(int i=0;i<=4;i++){
        System.out.println("Ingrese la altura de la persona: ");
        altura[i]=teclado.nextFloat();
        
    }
}
public void promedio(){
    float suma;
    suma=0;
    for(int j=0;j<=4;j++){
        suma=suma+altura[j];
    }
}

    public static void main(String[] args) {
        Ejercicio2 llamar = new Ejercicio2();
        llamar.carga();
        llamar.promedio();
    }
}
