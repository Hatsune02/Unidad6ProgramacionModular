package src;

import java.util.Scanner;

public class Ejercicio1Java{

    Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        Ejercicio1Java ej1 = new Ejercicio1Java();

    }


    public Ejercicio1Java(){
        int[] arreglo1 = new int[5];
        llenarArreglo(arreglo1);
        mostrarArreglo(arreglo1);
    }

    public void llenarArreglo(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = getInt("Ingresa un número al arreglo");
        }
    }

    public void mostrarArreglo(int[] arreglo){
        System.out.println("El orden del arreglo es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print((i+1) + ") " + arreglo[i] + "\t");
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
