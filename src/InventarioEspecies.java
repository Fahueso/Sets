import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class InventarioEspecies {
    public static void main(String[] args) {
        HashSet<String> especies = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        especies.add("León");especies.add("Tigre");
        especies.add("Cebra");especies.add("León");
        especies.add("Elefante");especies.add("Tigre");
        System.out.println("Hay " + especies.size() + " animales");
        for(String animal:especies){
            System.out.println(animal);
        }

        //Ampliación 1
        //Pedir al usuario un nombre, comprobar que
        //existe con contains, y proceder a eliminarlo
        System.out.println("Introduce el nombre del animal a trasladar");
        String animalTrasladar = sc.nextLine();

        if(especies.contains(animalTrasladar)){
            especies.remove(animalTrasladar);
            System.out.println("Trasladado!!");
        }else{
            System.out.println("Animal no encontrado");
        }
        System.out.println("Lista actualizada");
        for(String animal:especies){
            System.out.println(animal);
        }

    }
}
