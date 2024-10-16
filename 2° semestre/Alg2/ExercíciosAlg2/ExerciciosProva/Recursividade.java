package ExerciciosProva;

public class Recursividade {
    public static void main(String[] args) {
        /*for (int counter = 0; counter <= 5; counter++){
            if (counter == 5){
                System.out.println(factorial(counter));
            }
        }*/

        /*for (int counter = 0; counter <= 13; counter++){
            System.out.println(somarNumeros(counter));
        }*/

        /*int n = 6;
        System.out.println(fibonacci(n));*/

        /*System.out.println(contadorDigitos(1234));*/
    }

    public static long factorial(long number){
        if (number <= 1){
            return 1;
        } else {
            return number *= factorial(number-1);
        }
    }

    public static int somarNumeros(int number){
        if (number == 0){
            return 0;
        } else {
            return number += somarNumeros(number - 1);
        }
    }

    public static int fibonacci(int number){
        if (number<=1){
            return number;
        } else {
            return fibonacci(number - 1) + fibonacci(number -2);
        }
    }

    public static int contadorDigitos(int number){
        if (number < 10){
            return 1;
        } else {
            return 1 + contadorDigitos(number/10);
        }
    }

}
