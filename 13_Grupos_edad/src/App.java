/*
 * Dada la edad de una persona como entrada, genera su grupo de edad.
 * Estos son los grupos de edad que debe manejar:

    Niño : 0 a 11

    Adolescente : 12 a 17

    Adulto : 18 a 64  
 */

import  java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        //your code goes here
        if(age >= 0 && age <= 11){
            System.out.println("Child");
        } else if (age >= 12 && age <= 17){
            System.out.println("Teen");
        } else if (age >= 18 && age <= 64){
            System.out.println("Adult");
            sc.close();
        }
        
    }
}