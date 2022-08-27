package com.mycompany.ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {
private Scanner teclado;
private float[] turnoman;
private float[] turnotar;


public void cargar(){
    teclado = new Scanner(System.in);
    turnoman = new float [4];
    turnotar = new float [4];
    
    System.out.println("Sueldos de empleados del turno de la mañana.");
    for (int f=0;f<4;f++){
        System.out.println("Ingrese el sueldo: ");
        turnoman [f]= teclado.nextFloat();
        
    }
    System.out.println("Sueldos de empleados del turno de la tarde.");
    for (int f=0;f<4;f++){
        System.out.println("Ingrese el sueldo: ");
        turnotar [f]= teclado.nextFloat();
        
    }
}
public void calcularGastos(){
    float Salario_man=0;
    float Salario_tar=0;
    for(int f=0;f<4;f++){
        Salario_man = Salario_man+turnoman[f];
        Salario_tar = Salario_tar + turnotar[f];
        
    }
    System.out.println("Toatal de gastos del turno de la Manana: "+Salario_man);
    System.out.println("Toatal de gastos del turno de la tarde: "+Salario_tar);
    
}
    
    public static void main(String[] args) {
        Ejercicio3 llamar = new Ejercicio3();
        llamar.cargar();
        llamar.calcularGastos();
    }
}
