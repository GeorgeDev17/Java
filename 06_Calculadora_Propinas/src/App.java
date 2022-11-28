/*
 * Se da una propina del 15% del importe de la factura.
 * Tome el monto de la factura como entrada y emita el 
 * monto de la propina correspondiente que debe ser el 15 % del monto.
 */

 import java.util.Scanner;
class Tips {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double bill = sc.nextDouble();
        System.out.println(bill * 15 / 100);
        sc.close();
    }
}
