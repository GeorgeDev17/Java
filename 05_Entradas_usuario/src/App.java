/*
 * Programa: Recibir información de un usuario
 * Datos de entrada: nombre, edad
 * Salida: concatenacion ambos datos recibidos
*/

import java.util.Scanner;
class User {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println(name+": " + age);
        sc.close();
    }
}
