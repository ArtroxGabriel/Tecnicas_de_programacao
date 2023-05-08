import java.io.IOException;

class Main {
    public static void main(String[] args) {
        String arq1 = args[0];
        String arq2 = args[1];

        Table table = new Table();

        try {
            table.insert_file(arq1);
            table.insert_file(arq2);
            table.merge("saida.txt");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro ao inserir arquivo");
        }
        
    }
}