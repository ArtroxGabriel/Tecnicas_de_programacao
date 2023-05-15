package Exercicios;

class Pessoa {
    String nome;
    int idade;
    
    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    String getNome() {
        return this.nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    int getIdade() {
        return this.idade;
    }

    void setIdade(int idade) {
        this.idade = idade;
    }

    Pessoa nome(String nome) {
        setNome(nome);
        return this;
    }

    Pessoa idade(int idade) {
        setIdade(idade);
        return this;
    } 
}
