
public class ArvoreBinaria {
    private No raiz;
    
    public ArvoreBinaria() {
            this.raiz = null;
        }

    public No getRaiz() {
        return raiz;
    }
        
    public void inserir(long id) {
        raiz = inserirRecursivo(raiz, id);
    }

    private No inserirRecursivo(No noAtual, long id) {
        if (noAtual == null) {
            return new No(id, null, null);
        }

        if (id < noAtual.getId()) {
            noAtual.setEsq(inserirRecursivo(noAtual.getEsq(), id));
        }
        else if (id > noAtual.getId()) {
            noAtual.setDir(inserirRecursivo(noAtual.getDir(), id));
        }

        return noAtual;
    }
    
    public int contarNosEsquerda() {
            return contarNosEsquerda(this.raiz, false);
        }

        private int contarNosEsquerda(No no, boolean isEsquerda) {
            if (no == null) {
                return 0;
            }
    
            int contador = isEsquerda ? 1 : 0;
    
            
            contador += contarNosEsquerda(no.getEsq(), true); 
            contador += contarNosEsquerda(no.getDir(), false); 
    
            return contador;
        }

        public void exibir() {
            exibir(raiz, 0);
        }
        
        private void exibir(No no, int nivel) {
    
            for (int i = 0; i < nivel * 4; i++) { 
                System.out.print(" ");
            }
            
            if (no == null) {
                System.out.println("-");
                return;
            }
        
            System.out.println(no.getId());
        

            exibir(no.getEsq(), nivel + 1);
            exibir(no.getDir(), nivel + 1);
        }
        
}

