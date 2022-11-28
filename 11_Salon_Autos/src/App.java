/*
 * Tienes $12000 para comprar un auto.
 * El programa toma el precio de un automóvil como entrada
 * Debe generar "Suficiente" si el precio es inferior o igual a $12000,
 * de lo contrario, no genere nada. 
 * Utiliza la instrucción if
 */

import java.util.Scanner;

class Demo{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        if (price <= 12000){
            System.out.println("enough");
            scanner.close();
        }
    }
}
