/**
 * <h1> Laboratorio 1 </h1>
 * <h2> Main (Clase principal) </h2>
 * 
 * <p>
 * Programación de plataformas móviles - Universidad del Valle de Guatemala
 * </p>
 * 
 * Creado por:
 * 
 * @author Pablo Daniel Barillas Moreno || Carné No. 22193
 * @version 1.0
 * @since 16/07/2023
 * 
 **/ 

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ItemDataJ {
    
    private Object originalValue;


    public ItemDataJ(Object originalValue) {
        this.originalValue = originalValue;
    }

    public static void main(String[] args) {

        ItemDataJ data = new ItemDataJ(args);

        data.start();
    }

    public int mainMenu(){
        JOptionPane.showMessageDialog(null,
            "\n=======================================================\n"
            + "Bienvenido al identificador de variables, el programa del laboratorio 1\n"
            + "Entrando al sistema...."
            +"\n======================================================\n"
            );
        String[] options = {"Iniciar programa", "Salir del programa"};
        for(int i = 0;i < options.length;i++){
            System.out.println();
            System.out.println((i+1) + ". " + options[i]);
        }
        return options.length;
    }

    public int selection(int options) {
        boolean next_step = false;
        int selection = 0;
        do{
            try{
                // Opciones disponibles, cantidad
                // opción de entrada, del usuario
                selection = Integer.parseInt(JOptionPane.showInputDialog("\nIngrese una de las opciones"));
                if(selection < 1 || selection> options){
                    System.err.println("\n¡Debe de ingresar una de las opciones disponibles!\n");
                }else{
                    next_step = true;
                }
            }catch(NumberFormatException e){
                System.err.println("\n¡Debe ingresar un valor numérico!\n");
            }
        }while(!next_step);
        return selection;
    }

   

    public void start() {
        Scanner scan = new Scanner(System.in);
        int selection = 0;
        int options = 1;
        while(selection != options){
            options = mainMenu();
            selection = selection(options);
            switch(selection){
                case 1:
                    System.out.println("\n Ingrese el dato que desee: ");
                    System.out.println();
                    Object originalValue = scan.nextLine();
                    System.out.println("\nEl dato ingresado es: " + originalValue);
                    System.out.println("\nEl tipo de la variable ingresada es: " + getType());
                    // Inicio del juego
                    break;
                default:
                System.out.println("\nGracias por utilizar el programa, Saliendo... espere...");
                    // Juego terminado
                    break;
            }
        }
    }

    public String getType() {
        if (originalValue instanceof String) {
            return "cadena";
        } else if (originalValue instanceof Integer) {
            return "entero";
        } else if (originalValue instanceof Boolean) {
            return "booleano";
        } else {
            return null;
        }
    }

    public String getInfo() {
        if (originalValue instanceof String) {
            return "L" + ((String) originalValue).length();
        } else if (originalValue instanceof Integer) {
            int value = (Integer) originalValue;
            if (value % 10 == 0) {
                return "M10";
            } else if (value % 5 == 0) {
                return "M5";
            } else if (value % 2 == 0) {
                return "M2";
            } else {
                return null;
            }
        } else if (originalValue instanceof Boolean) {
            boolean value = (Boolean) originalValue;
            return value ? "Verdadero" : "Falso";
        } else {
            return null;
        }
    }
}
