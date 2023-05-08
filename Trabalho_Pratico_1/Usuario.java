import java.util.Objects;

class Usuario {
    Long CPF;
    String nome;

    public Usuario(Long cpf, String nome) {
        this.CPF = cpf;
        this.nome = nome;
    }

    public Long getCpf() {
        return this.CPF;
    }

    public void setCpf(Long cpf) {
        this.CPF = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Usuario cpf(Long cpf) {
        this.CPF = cpf;
        return this;
    }

    public Usuario nome(String nome) {
        this.nome = nome;
        return this;
    }

    public byte[] asBytes(){
        String str = new String(this.getCpf() + ";" + this.getNome());
        return str.getBytes();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Usuario)) {
            return false;
        }
        Usuario usuario = (Usuario) o;
        return Objects.equals(CPF, usuario.CPF) && Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CPF, nome);
    }

    @Override
    public String toString() {
        return "{" +
            " cpf='" + getCpf() + "'" +
            ", nome='" + getNome() + "'" +
            "}";
    }

}