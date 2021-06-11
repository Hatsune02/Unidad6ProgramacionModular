package src;

import java.util.Scanner;

public class Ejercicio11Java{
    static Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        Ejercicio11Java ej11 = new Ejercicio11Java();
    }

    public Ejercicio11Java(){
        String[] nombres = new String[6];
        float[] notas = new float[6];
        
        llenarArreglos(nombres, notas);
        mostrar(nombres, notas);
    }

    public void llenarArreglos(String[] nombres, float[] notas){
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = getString("Ingrese el nombre del alumno " + (i+1));
            do{
                notas[i] = getFloat("Ingrese la nota del alumno " + (i+1));
            } while(notas[i] < 0 || notas[i] > 10);
        }
    }

    public void mostrar(String[] nombres, float[] notas){
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("");
            System.out.print("Nombre: " + nombres[i] + "  Nota: " + notas[i] + "  ");
            compararNotas(notas[i]);          
        }
    }

    public void compararNotas(float notas){
        if(notas >= 0 && notas < 5){
            System.out.println("Suspenso.");
        }
        else if(notas >= 5 && notas < 7){
            System.out.println("Bien.");
        }
        else if(notas >= 7 && notas < 9){
            System.out.println("Notable.");
        }
        else{
            System.out.println("Sobresaliente.");
        }
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

    public float getFloat(String titulo){
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = leer.nextLine();
            if(!n.matches("[0-9 (.9)]*$")){
                n = "";
            }
        }
        
        return Float.parseFloat(n);
    }
}