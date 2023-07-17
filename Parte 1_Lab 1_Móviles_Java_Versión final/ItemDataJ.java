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

import javax.swing.JOptionPane;

public class ItemDataJ {
    private Object originalValue;

    public ItemDataJ(Object originalValue) {
        this.originalValue = originalValue;
    }

    public static void main(String[] args) {
        String inputValue = JOptionPane.showInputDialog("Ingrese el dato que desee:");
        Object originalValue;
        try {
            originalValue = Integer.parseInt(inputValue);
        } catch (NumberFormatException e1) {
            try {
                originalValue = Double.parseDouble(inputValue);
            } catch (NumberFormatException e2) {
                originalValue = inputValue;
            }
        }
        ItemDataJ data = new ItemDataJ(originalValue);
        data.showInfo();
    }

    public String getType() {
        if (originalValue instanceof String) {
            String cadena = (String) originalValue;
            if (cadena.equals("true")) {
                return "Verdadero";
            } else if (cadena.equals("false")) {
                return "Falso";
            } else {
                return "cadena";
            }
        } else if (originalValue instanceof Integer) {
            return "entero";
        } else if (originalValue instanceof Double) {
            return "null";
        } else if (originalValue instanceof Boolean) {
            return "Booleano";
        } else {
            return null;
        }
    }

    public String getInfo() {
        if (originalValue instanceof String) {
            String cadena = (String) originalValue;
            return "L" + cadena.length();
        } else if (originalValue instanceof Integer) {
            int valor = (Integer) originalValue;
            if (valor % 10 == 0) {
                return "M10";
            } else if (valor % 5 == 0) {
                return "M5";
            } else if (valor % 2 == 0) {
                return "M2";
            } else {
                return null;
            }
        } else if (originalValue instanceof Double) {
            double valor = (Double) originalValue;
            return "Null: " + valor;
        } else {
            return null;
        }
    }

    public void showInfo() {
        String type = getType();
        String info = getInfo();
        String message = "El dato ingresado es: " + originalValue + "\n"
                + "El tipo de la variable ingresada es: " + type + "\n"
                + "Información del valor: " + (info != null ? info : "No aplica");
        JOptionPane.showMessageDialog(null, message);
    }
}
