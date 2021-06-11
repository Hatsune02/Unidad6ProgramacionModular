package src;

import java.util.Scanner;

public class Ejercicio5Java{
    static Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        Ejercicio5Java ej5 = new Ejercicio5Java();
    }

    int cantidadNotas = 0;

    public Ejercicio5Java(){
        int[] notas = new int[100];
        int[] notas1 = {5,7,2,3,9,5,6,8,-50};
        int[] notas2 = {6,-50};
        int[] notas3 = {1,5,4,7,6,2,7,8,3,2,9,4,5,3,6,6,8,8,-50};
        
        llenarArreglos(notas, notas1);
        mostrar(notas);
        cantidadNotas = 0;
        llenarArreglos(notas, notas2);
        mostrar(notas);
        cantidadNotas = 0;
        llenarArreglos(notas, notas3);
        mostrar(notas);
        cantidadNotas = 0;
    }

    public void llenarArreglos(int[] notas, int[] nota){

        do{
            //notas[cantidadNotas] = getInt("Ingrese la nota del alumno " + (cantidadNotas+1));
            notas[cantidadNotas] = nota[cantidadNotas];

            if(notas[cantidadNotas] == -50){
                break;
            }
            else{
                cantidadNotas++;
            }
            

        } while (true);
        
    }

    public void mostrar(int[] notas){
        float sumaNotas = 0;

        for (int i = 0; i < cantidadNotas; i++) {
            System.out.println("");
            System.out.print("Nota: " + notas[i]);
            sumaNotas = sumaNotas + notas[i];
        }
        float promedio = sumaNotas / cantidadNotas;
        System.out.println("");
        System.out.println("Promedio: " + promedio);
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