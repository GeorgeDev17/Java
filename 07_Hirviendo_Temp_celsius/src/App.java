/* 
 * Programa: Sensor que comprueba si el agua esta hirviendo.
 * Tome la temperatura entera en Celsius como entrada
 * como salida "Boiling" si la temperatura es superior o igual a 100.
 */

import java.util.Scanner;
class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int Celsius = sc.nextInt();
        if (Celsius >= 100){
            System.out.println("Boiling");
        } else {
            System.out.println("Not boiling");
            sc.close();
        }
        
    }
}
