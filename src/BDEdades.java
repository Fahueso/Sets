import java.util.HashMap;
import java.util.Map;

public class BDEdades {
    public static void main(String[] args) {
        HashMap<String,Integer> nombreEdad = new HashMap<>();

        nombreEdad.put("Alfonso",15);
        nombreEdad.put("Manuel", 20);
        nombreEdad.put("Andrea", 25);


        int acu=0; int menor=Integer.MAX_VALUE;
        String nombreMenor="";
        for(Map.Entry<String, Integer> pareja: nombreEdad.entrySet()){
            acu+=pareja.getValue();
            if(pareja.getValue()<menor){
                menor = pareja.getValue();
                nombreMenor= pareja.getKey();
            }
        }
        System.out.println("La media es " + acu/nombreEdad.size());
        System.out.println("El más joven es " + nombreMenor + " con " + menor);
    }
}
