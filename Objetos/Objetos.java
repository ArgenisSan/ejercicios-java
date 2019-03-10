import java.util.Scanner;
import java.util.InputMismatchException;

class Cuadrado {
    double calcularArea;
    double calcularPerimetro;

    double calarea() { //constructor
        return calcularArea*calcularArea;
    }

    double calperim() { //constructor
        return calcularPerimetro*4;
    }
}


class Cubo extends Cuadrado {
    double calcularVolumen;

    //constructor
    double calvol() { //constructor
        return calcularVolumen*calcularVolumen*calcularVolumen;
    }

    double calperim1() {
        return calcularPerimetro*12;
    }
}


class Objetos {
    public static void main(String[] args) {

        int menu;
        double lado;
        boolean salir = false;

        //Scanner de las entradas
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la medida de un lado para realizar calculos");
        lado = Double.parseDouble(entrada.nextLine()); //definir una nueva entrada de lado

        while(!salir) {
            try {
                Cuadrado cuarea = new Cuadrado();
                cuarea.calcularArea = lado;

                Cuadrado cuper = new Cuadrado();
                cuper.calcularPerimetro = lado;

                Cubo cubvol = new Cubo();
                cubvol.calcularVolumen = lado;

                Cubo cubper = new Cubo();
                cubper.calcularPerimetro = lado;

                System.out.println("MENU PRINCIPAL \nIngrese el numero de la opcion que desea realizar");
                System.out.println("1. Calcular el area del cuadrado \n2. Calcular el perimetro del cuadrado"
                +"\n3. Calcular el volumen del cubo \n4. Calcular el perimetro del cubo" 
                +"\n5. Cancelar \n6. Salir");
                menu = entrada.nextInt();

                if (menu == 5 || menu == 6) {
        
                } else {
                    System.out.println("\nLa medida del lado es: "+lado+"\n");
                }

                switch (menu) { //Menu de los casos 1-6
                    case 1: System.out.println("El area del cuadrado es: "+cuarea.calarea()+"\n");
                    break;

                    case 2: System.out.println("El perimetro del cuadrado es: "+cuper.calperim()+"\n");
                    break;

                    case 3: System.out.println("El volumen del cubo es: "+cubvol.calvol()+"\n");
                    break;

                    case 4: System.out.println("El  perimetro del cubo es: "+cubper.calperim1()+"\n");
                    break;

                    case 5:
                    Scanner entrada1 = new Scanner(System.in); 
                    System.out.println("Ingresa la medida de un lado para realizar calculos ");
                    lado = Double.parseDouble(entrada1.nextLine()); //definir una nueva entrada de lado
                    break;

                    case 6: salir = true;
                    System.out.println("Has salido del programa");
                    break;
                
                }

            } catch (InputMismatchException e) {
                System.out.println("Por favor inserte un numero valido");
                entrada2.next();
            }
        }
        
    }

}
