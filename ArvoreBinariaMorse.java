public class ArvoreBinariaMorse {
    private Node raiz;

    public ArvoreBinariaMorse() {
        this.raiz = new Node();
    }

    /**
     *
     * bah preguica de comentar tudo agora, tenho qeu trabalhar amanha, dps comento e termino.
     * Vejam o discord
     * */
    public void insert(String morse, char caracter )
    {
        Node nodeAtual = this.raiz;
        char[] morseCode = morse.toCharArray();
        for (char simbolo: morseCode){
            if (simbolo == '.'){ // caso seja ponto, adiciona a esquerda
                if (nodeAtual.getFilhoEsquerdo() == null) {
                    nodeAtual.setFilhoEsquerdo(new Node());
                    nodeAtual = nodeAtual.getFilhoEsquerdo();
                } else {
                    nodeAtual = nodeAtual.getFilhoEsquerdo();
                }
            } else if ( simbolo == '_') { // caso seja traco, adiciona a direita
                if (nodeAtual.getFilhoDireito() == null) {
                    nodeAtual.setFilhoDireito(new Node());
                    nodeAtual = nodeAtual.getFilhoDireito();
                } else {
                    nodeAtual = nodeAtual.getFilhoDireito();
                }
            }
        }
        nodeAtual.setCaracter(caracter);

    }

    private Node criarNode(String morse, char Caracter )
    {
        Node node = new Node();
        node.setCaracter(Caracter);
        return node;
    }
}
