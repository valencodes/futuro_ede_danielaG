import java.util.Scanner;
public class Main {
    private static void main(String[] args) {
        String nombre;
        //Prepara el programa para leer datos desde el teclado
        Scanner leer = new Scanner(System.in);

        //Pide que introduzca el nombre y apellido esperando un String con nextLine()
        System.out.print("Escribe nombre y apellido: ");
        nombre = leer.nextLine();

        System.out.println("Estudiante" + " " + nombre);
    }
}