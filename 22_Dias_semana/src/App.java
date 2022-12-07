/*
 * El programa de calendario dado debería mostrar el día de la semana correspondiente 
   a partir de la entrada del usuario
 */


import java.util.Scanner;
class Demo{
    public static void main(String[] args) {

        //fix the declaration of array
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner scanner = new Scanner(System.in);
        int  number = scanner.nextInt();
        System.out.println(days[number]);
        scanner.close();
    }
}