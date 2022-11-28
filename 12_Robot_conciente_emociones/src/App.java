/*
 * Programa: Robot consciente de emociones
 * puede reconocer tus emociones y asignarles un número que represente cada una de ellas:

   1 ¡Estás feliz!
   2 ¡Estás triste!
   3 ¡Estás enfadado!
   4 ¡Estás sorprendido!

 * El código dado toma el número de la emoción como entrada del usuario.
 */

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int emotion = scanner.nextInt();
        switch (emotion) {
        case 1:
            System.out.println("You are happy!");
            break;
        case 2:
            System.out.println("You are sad!");
            break;
        case 3:
            System.out.println("You are angry!");
            break;
        case 4:
            System.out.println("You are surprised!");
            break;   
        default: 
            System.out. println("Unknown emotion");
        scanner.close();
        }
    }
}