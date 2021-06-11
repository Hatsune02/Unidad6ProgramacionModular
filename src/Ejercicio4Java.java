package src;

import java.util.*;

public class Ejercicio4Java{
    Random aleatorio = new Random();
    Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        Ejercicio4Java ej4 = new Ejercicio4Java();

    }


    public Ejercicio4Java(){
        int mayor = 0;
        int[] arreglo4 = new int[5];
        llenarArreglo(arreglo4);
        distanciaNumeroMayor(arreglo4, mayor);
        mostrarArreglo(arreglo4);
    }

    public void llenarArreglo(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = aleatorio.nextInt(99 - 0);
        }
    }

    public void mostrarArreglo(int[] arreglo){
        System.out.println("El orden del arreglo es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print((i+1) + ") " + arreglo[i] + "\t");
        }
    }

    public void distanciaNumeroMayor(int[] arreglo, int mayor){
        int diferencia;
        for (int i = 0; i < arreglo.length; i++) {
            if(mayor <= arreglo[i]){
                mayor = arreglo[i];
            }
        }

        for (int i = 0; i < arreglo.length; i++) {
            diferencia = mayor - arreglo[i];
            System.out.println("El número mayor del arreglo es :" + mayor + " y la distancia que los separa del numero actual ("+ arreglo[i] +") es: " + diferencia);
        }
        
    }

    public int getInt(String titulo){
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = leer.nextLine();
            if(!n.matches("[0-9]*$")){
                n = "";
            }
        }
        
        return Integer.parseInt(n);
    }
}