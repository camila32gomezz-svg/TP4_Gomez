package tp4_ejercicio1;
import java.util.Scanner;
public class TP4_EJERCICIO1 {


    public static void main(String[] args) {
        //TODO code application logic here  
        //ZONA DE DECLARACIONES  
        Scanner Lector = new Scanner(System.in);
        
        int [] numeros = new int[7];
        System.out.println("Ingrese 7 numeros: "); 
       for (int contador = 0 ; contador < 7; contador++){
           numeros[contador] = Lector.nextInt();
           
       }
       System.out.println("-----");
       int indice = 0;
       while (indice < 7) {
           //CADA PASADA ES UNA ITERACIÓN 
           System.out.println(numeros [indice]);
           indice = indice + 1 ;
    }
}
}