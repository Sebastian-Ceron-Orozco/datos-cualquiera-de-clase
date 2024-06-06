import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class App {

    public static boolean isunico (String palabra){
        HashSet<Character> conjuntoLetras = new HashSet<Character>();

        for(int i = 0; i < palabra.length(); i++){
            char letra = palabra.charAt(i);
            if (conjuntoLetras.add(letra) == false){
                return false;
            }
        }
        return true;
    }

    public static void check(String palabra){
        HashMap<Character,Integer> diccionario = new HashMap<Character,Integer>();
        for(int i = 0; i < palabra.length(); i++){
            char letra = palabra.charAt(i);
            if (!diccionario.containsKey(letra)){
                diccionario.put(letra, 1); 
            }else{
            diccionario.put(letra, diccionario.get(letra)+1);
        }
        }
        Iterator<Character> iterator = diccionario.keySet().iterator();
        while(iterator.hasNext()){
            char letra = iterator.next();
            System.out.println(letra + ":" + diccionario.get(letra));
        }
    }    

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(isunico("carro"));
        System.out.println(isunico("adios"));
    }


}
