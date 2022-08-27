package com.mycompany.ejercicio5;
import java.util.Scanner;
public class Ejercicio5 {
private Scanner teclado;
private int[][] matriz;

public void cargar(){
    teclado = new Scanner(System.in);
    matriz =new int [3][5];
    for(int i=0;i<3;i++){
        for(int j=0;j<5;j++){
            System.out.println("Ingrese el elemento en posicion de matriz["+i+"]["+j+"] : ");
            matriz [i][j]= teclado.nextInt();
            
        }
    }
    
}
    public void imprimir(){
        for (int f=0;f<3;f++){
            for(int c=0;c<5;c++){
                System.out.println(matriz[f][c]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Ejercicio5 llamar =new Ejercicio5();
        llamar.cargar();
        llamar.imprimir();
    }
}
