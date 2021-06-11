package src;

import java.util.*;

public class Ejercicio7Java{
    Random aleatorio = new Random();
    Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        Ejercicio7Java ej7 = new Ejercicio7Java();

    }

    public Ejercicio7Java(){
        int[][] arreglo7 = new int[4][3];
        llenarArreglo(arreglo7);
        mostrarArreglo(arreglo7);
        sumar(arreglo7);
    }

    public void llenarArreglo(int[][] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                arreglo[i][j] = aleatorio.nextInt(555 - 0);
            }   
        }
    }

    public void sumar(int[][] arreglo){
        int suma = 0;
        for (int i = 1; i < arreglo.length; i=i+2) {
            for (int j = 0; j < arreglo[i].length; j++) {
                suma = suma + arreglo[i][j];
            }   
        }
        System.out.println("Suma de todos los números que estén en una fila par: " + suma);

    }

    public void mostrarArreglo(int[][] arreglo){
        System.out.println("Arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.print((i+1) + "." + (j+1) + ") " + arreglo[i][j] + "    \t");
            }
            System.out.println("");
        }   
        System.out.println("");
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