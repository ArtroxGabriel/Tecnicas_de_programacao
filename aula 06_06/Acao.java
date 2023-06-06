public class Acao extends Subject {

    float valor;

    void setValor (float valor) {
        this.valor = valor;
        this.notifyObservers();
    }

    float valor() {
        return this.valor;
    }
}

abstract class Subject {

    Observer observers[] = new Observer[10];
    int count = 0;

    void attach(Observer ob) {
        this.observers[this.count++] = ob;
    }

    void deAttach(Observer o) {
        // implementar
    }

    void notifyObservers () {
        System.out.println(count);
        for (int i = 0; i < this.count; i++) {
            this.observers[i].update();
        }
    }
} 