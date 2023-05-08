import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Stream;

class Table {
    private HashSet<Usuario> map;

    public Table() {
        this.map = new HashSet<>();
    }

    public void insert_file(String path) throws IOException {
        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            stream.forEach(e -> {
                String[] aux = e.split(";");
                Long cpf = Long.parseLong(aux[0]);
                String nome = aux[1];
                this.insert(cpf, nome);
            });
        } catch (IOException e) {
            System.out.println("Erro na leiura do arquivo");
            e.printStackTrace();
        }
    }

    private void insert(Long cpf, String nome) {
        this.map.add( new Usuario(cpf, nome));
    }

    public void merge(String path) throws IOException {
        FileOutputStream out = new FileOutputStream(new File(path));
        Iterator<Usuario> iter = this.map.iterator();
        System.out.println("Gerando arquivo de saída...");

        try {
            while (iter.hasNext()) {
                out.write(iter.next().asBytes());
                out.write("\n".getBytes());
            }
        } catch (IOException e) {
            System.out.println("Erro ao gerar arquivo de saída");
            System.exit(1);
        }
        out.close();
    }
}