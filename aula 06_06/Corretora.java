class Corretora extends Observer {
    Acao acao;

    Corretora (Acao acao){
        this.acao = acao;
        acao.attach(this);
    }
    void update () {
        if (acao.valor() < 10) this.compra();
        if (acao.valor() > 100) this.vende();
    }

    void compra () {
        System.out.println("Compre mais");
    }
    void vende () {
        System.out.println("Vende agora");
    }
}

abstract class Observer{
    abstract void update ();
}