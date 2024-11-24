import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        int A, B, S;

        Scanner leer = new Scanner(System.in); // Preparo el programa para leer desde el teclado

        // Leo el primer numero
        System.out.print("Introduce el primer numero: ");
        A = leer.nextInt();

        //Leo el segundo numero
        System.out.print("Introduce el segundo numero: ");
        B = leer.nextInt();

        S = A + B;

        System.out.println("El resultado de la suma es: " + S);
    }
}
