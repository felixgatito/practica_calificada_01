/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prac_ejercicio_01;
//2.- En un arreglo, mostrar los datos de un usuario (nombre, edad y sexo)
/**
 *
 * @author WINDOWS
 */
public class Prac_Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    String nombres []={"Victor", "Ronald","Carolina","Paola"};
int edad []={25,30,19,22};
char sexo []={'M','M','M','F'};
System.out.println("Datos de los usuarios"); System.out.println("NOMBRES EDAD SEXO");
System.out.println("------- ---- ----");
for (int u=0;u<nombres.length;u++){
System.out.println(nombres[u]+ " "+ edad[u] + " " + sexo[u]);
}
}
}
