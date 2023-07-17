public class ItemDataJ {
    private Object originalValue;

    public ItemDataJ(Object originalValue) {
        this.originalValue = originalValue;
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
        } else if (originalValue instanceof Boolean) {
            boolean valor = (Boolean) originalValue;
            return valor ? "Verdadero" : "Falso";
        } else {
            return null;
        }
    }

}
