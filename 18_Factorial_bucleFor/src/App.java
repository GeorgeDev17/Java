/*
 *Factorial
 *El factorial de un número N es igual a 1 * 2 * 3 * ... * N

 *Por ejemplo, el factorial de 5 es 1 * 2 * 3 * 4 * 5 = 120.

 *Crea un programa que tome un número de entrada y produzca el factorial de ese número.

 *Utiliza un bucle for para realizar el cálculo, e inicia el bucle desde el número 1.
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int fact = 1;
        for (int x = 1; x <= num; x ++){
            fact *= x;
        }
        System.out.println(fact);
        scanner.close();
    }
}