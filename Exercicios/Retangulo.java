package Exercicios;

class Retangulo {
    Ponto origem;
    float base, altura;

    Retangulo(){
        this(new Ponto(), 0, 0);
    }
    Retangulo(Ponto origem, float base, float altura){
        this.origem = origem;
        this.base = base;
        this.altura = altura;
    }

    boolean igual(Retangulo r){
        return (this.origem == r.origem && this.base == r.base && this.altura == r.altura);
    }
}
