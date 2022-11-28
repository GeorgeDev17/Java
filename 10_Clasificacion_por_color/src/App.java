
/*
 * Estás haciendo un robot que debe clasificar los artículos por su color.
 * Cada color corresponde a una caja con un número específico.
 * Para simplificar, nuestro programa manejará 3 colores:
 * el rojo va a la caja #1
 * el verde va a la caja #2
 * el negro va a la caja #3
 * El programa necesita tomar un color como entrada y dar como salida 
 * el número de caja correspondiente.
 
 * Ejemplo de entrada
 * verde
 * Ejemplo de salida
 * 2
 
 * Recuerda que puedes utilizar la sentencia switch para comprobar diferentes condiciones.
*/

import java.util.Scanner;
class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String color = sc.nextLine();
        switch (color){
        case "red":
            System.out.println(1);
            break;
        case "green":
            System.out.println(2);
            break;
        case "black":
            System.out.println(3);
            break;
        default:
            System.out.println("Another color");
        sc.close();
        }
    }
}