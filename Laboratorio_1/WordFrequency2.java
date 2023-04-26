import java.util.*;
/*
    Crie uma classe denomiada WordFrequency2
    para receber um texto via teclado e imprimir a
    frequencia de palavras em ordem alfabética.
 */

public class WordFrequency2 {
    public static void main(String[] args){
        ArrayList<String> lista = new ArrayList<>(Arrays.asList(args));
        TreeMap<String, Integer> mapa = new TreeMap<>();

        lista.forEach( e -> mapa.put(e.toLowerCase(), mapa.getOrDefault(e, 0) + 1));

        mapa.forEach((palavra, frequencia) -> System.out.println(palavra +" "+ frequencia));

    }
}
