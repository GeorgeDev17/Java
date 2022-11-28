/*
 * Estas empacando huevos en canastas, cada una de ellas con 8 huevos.
 * Todas las cestas empacadas deben estar llenas.
 * Complete para calcular ¿Cuantos de los huevos quedaran?
*/


class Egg {
    public static void main(String[] args) {
        int eggs = 52;
        int count = 8;
        int result = eggs % count;
        System.out.println(result);
    }
}