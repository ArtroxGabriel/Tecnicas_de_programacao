package Exercicios;

class Circulo implements ObjetoGeometrico {
    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float calculaArea() {
        return (float) (Math.PI * raio * raio);
    }

    public float calcularPerimetro() {
        return (float) (2 * Math.PI * raio);
    }
}
