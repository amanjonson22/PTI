public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
    
        arvore.inserir(555);
        arvore.inserir(333);
        arvore.inserir(111);
        arvore.inserir(444);
        arvore.inserir(888);
        arvore.inserir(999);
    

        int numeroNosEsquerda = arvore.contarNosEsquerda();

        System.out.println("Número de nós da esquerda festiva: " + numeroNosEsquerda);

        System.out.println("Árvore com recuos proporcionais ao nível:");
        arvore.exibir();
    }
}
