package src;

import java.util.*;

public class Ejercicio3Java{
    Random aleatorio = new Random();
    Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        Ejercicio3Java ej3 = new Ejercicio3Java();

    }


    public Ejercicio3Java(){
        int[] arreglo3 = new int[8];
        llenarArreglo(arreglo3);
        adivinarNumero(arreglo3);
        mostrarArreglo(arreglo3);
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

    public void adivinarNumero(int[] arreglo){
        boolean encontrado = false;
        int numero = getInt("Ingrese un número que cree que pueda estar en el arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] == numero){
                System.out.println("El número aparece en el arreglo");
                encontrado =true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("El número no aparece en el arreglo");
            encontrado = false;
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