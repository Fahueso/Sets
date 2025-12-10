import java.util.HashSet;
import java.util.TreeSet;


public class FiestaPrivada {
    public static void main(String[] args) {
        // Usamos la interfaz Set para la referencia (Buenas prácticas)
        TreeSet<String> invitados = new TreeSet<>();
        boolean agregado;

        // 1. Añadir invitados
        invitados.add("Javier");
        invitados.add("Ana");
        invitados.add("Borja");
        invitados.add("Clara");

        // INTENTO DE DUPLICADO:
        // El método add devuelve 'false' si el elemento ya existía.
        agregado = invitados.add("Ana");

        System.out.println("¿Se ha añadido a Ana otra vez? ");
        if(!agregado) { // false
            System.out.println("No se ha podido agregar porque ya estaba");
        } else {
            System.out.println("Se ha podido agregar");
        }

        // 2. Comprobar existencia
        if (invitados.contains("Borja")) {
            System.out.println("Borja está en la lista.");
        }

        // 3. Eliminar
        invitados.remove("Clara");

        // 4. Recorrer (Solo con for-each o iterador, no hay índice)
        System.out.println("\n--- Lista Final (" + invitados.size() + ") ---");
        for (String nombre : invitados) {
            System.out.println("- " + nombre);
        }


    }
}
