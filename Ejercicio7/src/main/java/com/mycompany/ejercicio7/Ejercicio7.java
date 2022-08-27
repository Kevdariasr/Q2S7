package com.mycompany.ejercicio7;
import java.util.Scanner;
public class Ejercicio7 {
private Scanner teclado;
private int[][] matriz;

public void cargar(){
    teclado = new Scanner(System.in);
    matriz =new int [3][5];
    for(int f=0;f<3;f++){
        for(int j=0;j<5;j++){
            System.out.println("Ingrese el elemento en posicion de matriz["+f+"]["+j+"] : ");
            matriz [f][j]= teclado.nextInt();
            
        }
    }
    
}
public void primerFila(){
    System.out.println("Primer fila de la matriz: ");
    for(int c=0;c<4;c++){
        System.out.println(matriz[0][c]);
    }
    
}

public void UltimaFila(){
    System.out.println("Primer fila de la matriz: ");
    for(int c=0;c<4;c++){
        System.out.println(matriz[2][c]);
    }
    
}
public void Primercolumna(){
    System.out.println("Primer fila de la matriz");
    for(int f=0;f<3;f++){
        System.out.println(matriz[f][0]);
    }
    
}


    public static void main(String[] args) {
        Ejercicio7 llamar = new Ejercicio7();
        llamar.cargar();
        llamar.Primercolumna();
        llamar.UltimaFila();
        llamar.primerFila();
    }
}
