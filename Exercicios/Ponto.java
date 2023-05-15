package Exercicios;

class Ponto {
    float x, y;

    Ponto(){
        this(0, 0);
    }

    Ponto(float x, float y) {
        this.x = x;
        this.y = y;
    }
    void setXY (float x, float y){
        this.x = x;
        this.y = y;
    }
    void mover(int dx, int dy){
        x += dx;
        y += dy;
    }
    void mover(int raio, float ang){
        x += raio*Math.cos(ang);
        y += raio*Math.sin(ang);
    }
}
