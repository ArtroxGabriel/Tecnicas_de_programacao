package Exercicios;

class Quadrado implements ObjetoGeometrico {
    private float lado;

    public Quadrado(float lado) {
        this.lado = lado;
    }

    public float calculaArea() {
        return lado * lado;
    }

    public float calcularPerimetro() {
        return 4 * lado;
    }
}
