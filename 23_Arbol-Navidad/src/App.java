class Navidad {
    public static void main(String[] args) {
        // Salidas de color \033[33m amarillo,\033[32m verde,\033[31m rojo
        System.out.println("\033[33m\n--- Merry Christmas ---\n");
        // Estrella 
        for (int s = 0; s < 2; s++) {  //parte arriba
            for (int t = 0; t < 10 - s; t++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * s + 1; k++) {
                System.out.print("\033[33m*");
            }
            System.out.print("" + "\n");
        }        
        for (int s = 1; s >= 0; s--) {  //parte abajo
            if ( s == 1) {
                s--;
            } 
            for (int t = 0; t < 10 - s;  t++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * s + 1;  k++) {
                System.out.print("\033[33m*");
            }
            System.out.print("" + "\n");
        }
        // Cuerpo del árbol
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("\033[32m*");
            }
            System.out.print("" + "\n");
        } // tronco
        System.out.println("\033[31m        *****\n        *****\n");
    }
}