
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class LimpiadorBD {
//    Enunciado: El sistema antiguo del zoo ha generado una lista de identificadores de animales con errores (duplicados).
//
//    Crea un ArrayList<Integer> y añádele estos IDs: 101, 102, 103, 101, 104, 102, 105.
//    Muestra la lista original con los duplicados.
//    Crea un HashSet<Integer> y pásale la lista completa en su constructor (new HashSet<>(lista)).
//    Muestra el conjunto resultante. ¡Los IDs duplicados han desaparecido automáticamente!

    public static void main(String[] args) {
        Integer[] auxiliar = {101, 102, 103, 101, 104, 102, 105};
        ArrayList<Integer> ids = new ArrayList<>(Arrays.asList(auxiliar));
        System.out.println("Imprimimos la lista");
        for (Integer numero:ids){
            System.out.println(numero);
        }
        HashSet<Integer> conjunto = new HashSet<>(ids);
        for (Integer numero:conjunto){
            System.out.println(numero);
        }


    }
}
