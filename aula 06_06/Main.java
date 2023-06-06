class Main {
    public static void main(String[] args) {
        Acao a1 = new Acao(); //  Sujeit
        Acao a2 = new Acao();

        Corretora c1 = new Corretora(a1); // Observador
        a1.setValor(50);
        a1.setValor(200);
        a1.setValor(10);
    
    }
}