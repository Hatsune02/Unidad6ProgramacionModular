package src;

import java.util.*;

public class Ejercicio2Java{
    Random aleatorio = new Random();
    Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        Ejercicio2Java ej2 = new Ejercicio2Java();

    }

    

    public Ejercicio2Java(){
        int mayor = 0;
        int repetido = -1;
        int[] arreglo2 = new int[10];
        llenarArregloAleatorio(arreglo2);
        mostrarArreglo(arreglo2);
        elementoMayor(arreglo2, mayor, repetido);
    }

    public void llenarArregloAleatorio(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = aleatorio.nextInt(99 - 0);
        }
    }

    public void mostrarArreglo(int[] arreglo){
        System.out.println("El orden del arreglo es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print((i+1) + ") " + arreglo[i] + "\t");
        }
        System.out.println("");
    }

    public void elementoMayor(int[] arreglo, int mayor, int repetido){
        for (int i = 0; i < arreglo.length-1; i++) {
            if(arreglo[i] > arreglo[i+1]){
                mayor = arreglo[i];
            }
        }

        for (int i = 0; i < arreglo.length-1; i++) {
            if(arreglo[i] == mayor){
                repetido++;
            }    
        }
        
        System.out.println("El número mayor del arreglo es :" + mayor + " y las veces que se repite son: " + repetido);
    }

}