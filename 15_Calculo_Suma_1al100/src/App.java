/*
 * Calcular la suma de los números del 1 al 100
 */

class Demo {
    public static void main(String[ ] args) {
        int sum = 0;
        int num = 0;

        while(num <= 100) {
            sum += num;
            num++;
        }
        System.out.println(sum);

    }
}