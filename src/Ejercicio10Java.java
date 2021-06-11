package src;

import java.util.Scanner;

public class Ejercicio10Java{
    Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        Ejercicio10Java ej10 = new Ejercicio10Java();

    }

    public Ejercicio10Java(){
        int [][] matriz = new int [3][4];
        int [][] matrizTranspuesta = new int [4][3];

        llenarArreglo(matriz);
        mostrarArreglo(matriz, "");
        hallarTranspuesta(matriz, matrizTranspuesta);

    }


    public void llenarArreglo(int[][] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                arreglo[i][j] = getInt("Ingresa un número al arreglo en la posicion "+ (i+1)+"."+(j+1));
            }   
        }
    }

    public void mostrarArreglo(int[][] arreglo, String numero){
        
        System.out.println("Matriz " + numero);
        for (int i = 0; i < arreglo.length; i++) {
            
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.print((i+1) + "." + (j+1) + ") " + arreglo[i][j] + "    \t");
            }
            System.out.println("");
        }   
        System.out.println("");
    }

    public void hallarTranspuesta(int[][] arreglo, int[][] arreglo1){
        System.out.println("");
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
               arreglo1[i][j] = arreglo[j][i];
            }
        }
        mostrarArreglo(arreglo1, "Transpuesta");        
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