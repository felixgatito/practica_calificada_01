/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prac_ejercicio_01;
import java.util.Scanner;
//5.- Crear un arreglo, que nos pida ingresar una palabra, para mostrarlo letra por letra y la suma de sus caracteres.
/**
 *
 * @author WINDOWS
 */
public class Prac_Ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner dato=new Scanner(System.in);
int c=0; System.out.println("Escriba una palabra: ");
String palabra=dato.nextLine();
 char caracteres[]=new char[palabra.length()];
for(int i=0;i<palabra.length();i++){
c=c+1;
caracteres[i]=palabra.charAt(i); System.out.println(caracteres[i]);
}
System.out.println("la cantidad de caracteres es : "+c);
}
}
