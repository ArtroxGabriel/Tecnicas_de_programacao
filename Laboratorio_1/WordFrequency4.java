import java.util.*;
/*
    Crie uma classe denomiada WordFrequency4 para
    receber um texto via teclado e imprimir a lista de
    palavras por ordem decrescente de frequencia.
 */

public class WordFrequency4 {
    public static void main(String[] args){
        ArrayList<String> lista = new ArrayList<>(Arrays.asList(args));
        HashMap<String, Integer> mapa = new HashMap<>();

        lista.forEach( e -> mapa.put(e.toLowerCase(), mapa.getOrDefault(e, 0) + 1));

        TreeMap<String, Integer> pelaFrequencia = new TreeMap<>((a, b) -> {
            Integer aV = mapa.get(a);
            Integer bV = mapa.get(b);
            return aV.equals(bV) ? a.compareTo(b) : bV - aV;
        });
        
        pelaFrequencia.putAll(mapa);
        pelaFrequencia.forEach((palavra, frequencia) -> System.out.println(palavra + " " + frequencia));
    }
}
