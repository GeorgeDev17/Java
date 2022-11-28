/*
 * Tu profesor de matemáticas te ha pedido que calcules la suma de los 
 * números del 1 al N, donde N es un número dado.
 
    Tarea: Tomar un número entero N de entrada y obtener la suma de los 
    números del 1 al N, ambos inclusive.
 */

import  java.util.Scanner;

class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int sum = 0;
        int num = sc.nextInt();
        while (num > 0){
           sum += num --;
        }
        System.out.println(sum);
        sc.close(); 
    }
}