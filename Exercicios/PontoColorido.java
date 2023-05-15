package Exercicios;

public class PontoColorido extends Ponto {
    int cor;
    PontoColorido(float x, float y, int cor){
        super(x, y);
        this.cor = cor;
    }
    void setCor(int cor){
        this.cor = cor;
    }
}
