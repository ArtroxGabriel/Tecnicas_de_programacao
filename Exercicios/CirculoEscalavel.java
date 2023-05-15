package Exercicios;

public class CirculoEscalavel extends Circulo implements Escalavel{
    public CirculoEscalavel(float raio) {
        super(raio);
    }

    public void amplia(double escala) {
        this.raio *= escala;
    }

    public void espelha() {
        this.raio *= -1;
    }
}
