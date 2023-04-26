import java.util.*;

/* 
    // Crie uma classe denomiada CountWords para receber um texto 
    // via teclado e conte o número de palavras ocorridas neste texto 
    // e a quantidade de palavras distintas.
*/

public class CountWords {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>(Arrays.asList(args));
        HashSet<String> set = new HashSet<>(lista);

        System.out.println("Total de Palavras: "+ lista.size());
        System.out.println("Total de Palavras Distintas: "+set.size());
    }
}