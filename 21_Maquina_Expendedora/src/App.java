/*
 * Estás realizando un programa para una máquina expendedora de bebidas.

 * El menú de las bebidas se almacena en un array llamado menú:

 * Tome la elección del cliente como un número entero de entrada y obtenga el 
   elemento correspondiente del menú.

 * Además, comprueba si hay errores: en caso de que la entrada esté fuera del 
   rango de la matriz, muestra "No válido".
 */

import  java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        //your code goes here
        int choice = sc.nextInt ();

        if (choice < 0 || choice > 4 ){
            System.out.print ("Invalid");
        } else {
            System.out.print (menu [choice]);
        }
        sc.close();
    }
}