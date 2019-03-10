import java.util.Scanner;
class Romanos {
    public static void main(String[] args){

        //Declaracion de variables
        int entero;
        int i = 0;

        //Arreglo de String de los numeros romanos
        String[] strArray = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL",
        "X", "IX", "V", "IV", "I"};

        //Arreglo de int de los numeros enteros
        int[] intArray = new int[] {1000, 900, 500, 400, 100, 90, 
        50, 40, 10, 9, 5, 4, 1};

        //Solicitud y entrada de datos
        System.out.println("Introduce un numero entero del 1 al 1000:");
        Scanner entrada = new Scanner(System.in);
        entero = entrada.nextInt();

        //Condicion para establecer el rango de numeros
        if (entero > 1000 || entero < 1) {
            throw new IllegalArgumentException("Por favor introduce un numero entero del 1 al 1000");
        }

        //Creacion del Stringbuilder y ciclo while que interactua con los arreglos
        StringBuilder num2 = new StringBuilder();
        while (entero > 0) {
            if (entero - intArray[i] >= 0) {
                num2.append(strArray[i]);
                entero -= intArray[i];
            } else {
                i++;
            }
        }
        //Impresion del resultado del ciclo while
        System.out.println("La conversion a numero romano es= "+num2);
    }
}