import java.util.HashMap;
import java.util.Map;

public class CensoPoblacion {
    public static void main(String[] args) {
        HashMap<String, String> censo = new HashMap<>();

        // 1. Inserción (put)
        censo.put("1111A", "Ana López");
        censo.put("2222B", "Carlos Ruiz");
        censo.put("3333C", "Alfonso Hueso");

        // Sobrescritura si la clave existe
        censo.put("1111A", "Ana López García");

        // 2. Recuperación (get)
        System.out.println("Nombre: " + censo.get("2222B"));

        // 3. Recorrido eficiente
        for (Map.Entry<String, String> entrada : censo.entrySet()) {
            System.out.println("DNI: " + entrada.getKey() + " -> " + entrada.getValue());
        }
    }
}