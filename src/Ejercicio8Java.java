package src;

import java.util.*;

public class Ejercicio8Java{
    Random aleatorio = new Random();
    Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        Ejercicio8Java ej8 = new Ejercicio8Java();

    }

    public Ejercicio8Java(){
        String [] arreglo8_1 = new String[5];
        String [] arreglo8_2 = new String[5];

        llenarArreglo(arreglo8_1 , 1);
        llenarArreglo(arreglo8_2, 2);
        mostrarArreglo(arreglo8_1);
        mostrarArreglo(arreglo8_2);
        compararArreglos(arreglo8_1, arreglo8_2);
    }

    public void llenarArreglo(String[] arreglo , int numero){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = getString("Ingresa una palabra al arreglo al arreglo " + numero);
        }
    }

    public void compararArreglos(String[] arreglo, String[] arreglo1){
        System.out.println("");
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i].length() == arreglo1[i].length()){
                System.out.println((i+1) + ") El tamaño del arreglo 1 es: " + arreglo[i].length() + " y el tamaño es igual al del arreglo 2, que es: " + arreglo1[i].length());
            } 
            else{
                System.out.println((i+1) + ") El tamaño del arreglo 1 es: " + arreglo[i].length() + " y el tamaño no es igual al del arreglo 2, que es: " + arreglo1[i].length());
            }
        }
    }

    public void mostrarArreglo(String[] arreglo){
        System.out.println("El orden del arreglo es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print((i+1) + ") " + arreglo[i] + "             \t");
        }
        System.out.println("");
    }

    

    public String getString(String titulo){
        String n = "";

        
        while(n.equals("")){
            System.out.println(titulo);
            n = leer.nextLine();
            if(!n.matches("^[A-Za-z ]*$")){
                n = "";
            }
        }
        
        return n;
    }
}