package src;

public class Ejercicio6Java{
    public static void main (String[] args){
       Ejercicio6Java ej6 = new Ejercicio6Java();
    }

    public Ejercicio6Java(){
        int[][] arreglo6 = new int[3][3];
        llenarArreglo(arreglo6);
        mostrarMatriz(arreglo6);
        multiplicarMatriz(arreglo6);
    }

    public void llenarArreglo(int[][] arreglo){
        arreglo[0][0] = 5;
        arreglo[0][1] = 6;
        arreglo[0][2] = 13;
        arreglo[1][0] = 14;
        arreglo[1][1] = 2;
        arreglo[1][2] = 4;
        arreglo[2][0] = 21;
        arreglo[2][1] = 7;
        arreglo[2][2] = 6;
    }

    public void mostrarMatriz(int[][] arreglo){
        System.out.println("Matriz");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.print((i+1) + "." + (j+1) + ") " + arreglo[i][j] + "\t\t");
            }
            System.out.println("");
        }   
        System.out.println("");
    }

    public void multiplicarMatriz(int[][] arreglo){
        System.out.println("Matriz multiplicada x2");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                arreglo[i][j] = arreglo[i][j] * 2;
                System.out.print((i+1) + "." + (j+1) + ") " + arreglo[i][j] + "\t\t");
            }
            System.out.println("");
        }   
    }

}