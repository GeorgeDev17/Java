/*
 * identifique los países pequeños. Un país se considera pequeño si su población 
 * es inferior a 10000 y su superficie es inferior a 10000 hectáreas.
 * El código dado toma la población y el área de la entrada del usuario.
 * 
 * Objetivo: Completar el código para que dé como resultado "país pequeño" si se cumplen 
 * ambas condiciones. En caso contrario, no se mostrará nada.
 * 
 * Sugerencia: Utilice && en la sentencia if para combinar las condiciones.
 */

import java.util.Scanner;

class Demo {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int population = read.nextInt();
        int area = read.nextInt();
        //Complete the code
        if (population < 10000 && area < 10000){
            System.out.println("small country");
        }
        read.close();
    }  
}