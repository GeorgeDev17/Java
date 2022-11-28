/*
Para tu clase de matemáticas necesitas un programa 
para calcular el factorial de un número.

El código dado toma el número de la entrada del 
usuario y declara una variable "fact" para el cálculo.

El factorial de un número es igual al producto de 
todos los números menores o iguales al número dado.

El factorial de 6 será 6*5*4*3*2*1 = 720.
*/

import java.util.Scanner;

class Demo{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int fact = 1;
        //your code goes here
        while (number > 0){
            fact *= number;
            number --;  
        }
        System.out.println(fact);
        scanner.close();
    }
}