/*
 * Creando un sistema telefónico automatizado para clientes bancarios.
 * Las selecciones de números deben activar las acciones que se indican 
 * a continuación

    1 => Selección de idioma
    2 => Atención al cliente
    3 => Consultar el saldo de la cuenta
    0 => Salir

 * Puede utilizar los 3 primeros comandos en una secuencia aleatoria sin 
 * interrumpir la llamada telefónica - sólo el número 0 la interrumpe. 
 * El código dado toma los números continuamente.
 
 * En caso de que el usuario introduzca un número incorrecto, el programa no debería emitir nada.
 */

 import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int menu;
        do{
             menu = sc.nextInt();
             switch (menu){
                case 1:
                System.out.println("Language selection");
                break;
                case 2:
                System.out.println("Customer support");
                break;
                case 3: 
                System.out.println("Check the balance");
                break;
                case 0:
                System.out.println("Exit");
                break;
             }
        }
        while (menu != 0);
        sc.close();
    }
}