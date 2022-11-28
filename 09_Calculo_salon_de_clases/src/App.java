/*
 * Programa: Calcular cuantos lapices hay en el salón de clases
 * Entrada: numero de estudiantes y numero de lapices que tiene
 * cada uno de ellos
*/
import java.util.Scanner;
class Classroom {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int students = sc.nextInt();
        int pencil = sc.nextInt ();
        int sum = students * pencil;
        System.out.println(sum);
        sc.close();
    }
}

