package src;

import java.util.*;

public class Ejercicio9Java{
    Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        Ejercicio9Java ej9 = new Ejercicio9Java();

    }

    public Ejercicio9Java(){
        int [][] arreglo9_1;
        int [][] arreglo9_2;

        int x = getInt("Ingrese las filas de la matriz " + 1);
        int y = getInt("Ingrese las columnas de la matriz " + 1);
        arreglo9_1 = new int[x][y];

        int x2 = getInt("Ingrese las filas de la matriz " + 2);
        int y2 = getInt("Ingrese las columnas de la matriz " + 2);
        arreglo9_2 = new int[x2][y2];
        
        llenarArreglo(arreglo9_1, 1);
        llenarArreglo(arreglo9_2, 2);
        mostrarArreglo(arreglo9_1, 1);
        mostrarArreglo(arreglo9_2, 2);
        sumarArreglos(arreglo9_1, arreglo9_2);

    }

    public void llenarArreglo(int[][] arreglo, int numero){
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                arreglo[i][j] = getInt("Ingresa un número al arreglo " + numero + " posicion "+ (i+1)+"."+(j+1));
            }   
        }
    }

    public void mostrarArreglo(int[][] arreglo, int numero){
        if(numero == 3){
            System.out.println("Arreglo sumado");
        }
        else{
            System.out.println("Arreglo " + numero);
        }
        
        for (int i = 0; i < arreglo.length; i++) {
            
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.print((i+1) + "." + (j+1) + ") " + arreglo[i][j] + "    \t");
            }
            System.out.println("");
        }   
        System.out.println("");
    }

    public void sumarArreglos(int[][] arreglo, int[][] arreglo1){
        if(arreglo.length == arreglo1.length && arreglo[0].length == arreglo1[0].length){
            int [][] arregloSuma = new int[arreglo.length][arreglo[1].length];
            System.out.println("");
            for (int i = 0; i < arreglo.length; i++) {
                for (int j = 0; j < arreglo[i].length; j++) {
                    arregloSuma[i][j] = arreglo[i][j] + arreglo1[i][j];
                }
            }
            mostrarArreglo(arregloSuma, 3);
        }
        else{
            System.out.println("Las matrices no son del mismo tamaño");
        }
    }

    public int getInt(String titulo){
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = leer.nextLine();
            if(!n.matches("[0-9 (-9)]*$")){
                n = "";
            }
        }
        
        return Integer.parseInt(n);
    }
}