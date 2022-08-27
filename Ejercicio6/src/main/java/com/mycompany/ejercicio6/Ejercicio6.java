package com.mycompany.ejercicio6;
import java.util.Scanner;
public class Ejercicio6 {
private Scanner teclado;
private int[][] matriz;


public void cargar(){
    teclado = new Scanner(System.in);
    matriz = new int [4][4];
    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            System.out.println("Ingrese el elemento en posicion de matriz["+i+"]["+j+"] : ");
            matriz[i][j]= teclado.nextInt();
            
        }
    }
    
}
    public void imprimir(){
        for (int k=0;k<3;k++){
            System.out.println(matriz[k][k]+" ");
        }
    }


    public static void main(String[] args) {
        
        Ejercicio6 llamar = new Ejercicio6();
        llamar.cargar();
        llamar.imprimir();
    }
}
