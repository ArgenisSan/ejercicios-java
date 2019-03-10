import java.util.*;
class MainMorse {
    public static void main(String[] args) {
        System.out.print("Ingresa el texto: ");
        Scanner sc= new Scanner(System.in);
        String original = sc.nextLine();
        Morse1 message = new Morse1(original);
        //Impresion del resultado
        System.out.println("La traduccion de: " +message.getOriginal()+" es:\n"+message.getMorse());
    }
}