/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prac_ejercicio_01;
import java.util.Scanner;
//6.- Ingresar 10 números enteros y mostrar los números pares.
/**
 *
 * @author WINDOWS
 */
public class Prac_Ejercicio_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dato=new Scanner(System.in);
int par[]=new int[10]; 
int valor[]=new int[10];
int contador=0;
int i;
System.out.println("Ingrese los 10 números a evaluar");
for( i=0;i<10;i++){
par[i]=dato.nextInt();
if(par[i]%2==0) {
valor[contador]=par[i];
contador++;
}
}
System.out.println("los numeros pares son : " );
for( i=0;i<contador;i++) {
 System.out.println(valor[i]);
}
}
}
