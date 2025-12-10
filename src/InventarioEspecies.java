import java.util.HashSet;
import java.util.LinkedHashSet;

public class InventarioEspecies {
    public static void main(String[] args) {
        HashSet<String> especies = new HashSet<>();
        especies.add("León");especies.add("Tigre");
        especies.add("Cebra");especies.add("León");
        especies.add("Elefante");especies.add("Tigre");
        System.out.println("Hay " + especies.size() + " animales");
        for(String animal:especies){
            System.out.println(animal);
        }

    }
}
