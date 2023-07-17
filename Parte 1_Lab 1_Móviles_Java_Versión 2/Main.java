import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un valor: ");
        Object valor;
        String input = scanner.nextLine();

        // Convertir el valor ingresado a su tipo correspondiente
        try {
            valor = Integer.parseInt(input); // Intenta convertir a entero
        } catch (NumberFormatException e1) {
            try {
                valor = Boolean.parseBoolean(input); // Intenta convertir a booleano
            } catch (NumberFormatException e2) {
                valor = input; // Si no se puede convertir, se deja como cadena
            }
        }

        ItemDataJ item1 = new ItemDataJ(valor);

        System.out.println("Tipo de dato ingresado: " + item1.getType());
        System.out.println("Información del valor: " + item1.getInfo());

        scanner.close();
    }
}





