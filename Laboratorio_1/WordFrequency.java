import java.util.*;
/*
 *  Crie uma classe denomiada WordFrequency
 *  para receber um texto via teclado e contar a
 *  frequencia de cada palavra no texto.
 */

public class WordFrequency {
    public static void main(String[] args){
        ArrayList<String> lista = new ArrayList<>(Arrays.asList(args));
        HashMap <String, Integer> mapa = new HashMap<>();

        lista.forEach( e -> mapa.put(e, mapa.getOrDefault(e, 0) + 1));

        mapa.forEach((palavra, frequencia) -> System.out.println(palavra +" "+ frequencia));

    }
}
