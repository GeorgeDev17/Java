/*
 * Considere un programa que toma un número de día como entrada 
 * y genera el día de la semana correspondiente, en lugar de usar muchos 
 * if else modifique el código usando switch

        int day = 2;
        if(day == 1) {
          System.out.println("Monday");
        } else if(day == 2) {
          System.out.println("Tuesday");
        } else if(day == 3) {
          System.out.println("Wednesday");
        }
*/

class Day {
    public static void main(String[ ] args) {
        int day = 3;
        switch(day) {
        /*Each case needs a break statement, 
        or the code of the other cases will continue to get executed.*/
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        //The default case can be used to run code if none of the cases match.
        default: 
            System.out. println("Another day");
        }
    }
}