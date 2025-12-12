import java.lang.management.ManagementFactory;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StockFruteria {
    public static void main(String[] args) {
        HashMap<String, Double> producto = new HashMap<>();

        producto.put("Manzana", 1.5);
        producto.put("Pera", 1.8);
        producto.put("Platano", 2.1);

        System.out.println("--- Inventario ---");

        for(Map.Entry<String, Double> pareja: producto.entrySet()){
            System.out.println("Nombre del producto: "+pareja.getKey());
            System.out.println("Precio del producto: "+pareja.getValue());
        }
        System.out.println(producto.containsKey("Manzana"));//imprime true
        System.out.println(producto.containsKey("Fresa")); // imprime false
        System.out.println(producto.get("Manzana")); //imprime 1.5

    }
}
