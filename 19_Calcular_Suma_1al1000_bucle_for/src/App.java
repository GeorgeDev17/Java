/*
 * calcular y obtener la suma de los números del 1 al 1000 
 * utilizando un bucle for.
 */

public class App {
    public static void main(String[] args) {
        int sum = 0;
        for (int x = 1; x <= 1000; x++){
            sum += x;
        }
        System.out.println(sum);
    }
}