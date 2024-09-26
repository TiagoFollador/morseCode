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
    {   Node nodeCriado = criarNode(morse, caracter);
        Node nodeAtual = this.raiz;
        char[] morseCode = morse.toCharArray();
        for (char simbolo: morseCode){
            if (simbolo == '.'){
                do {
                    if (nodeAtual.getFilhoEsquerdo() == null) {
                        nodeAtual.setFilhoEsquerdo(nodeCriado);
                    } else {
                        nodeAtual = nodeAtual.getFilhoEsquerdo();
                    }
                } while (nodeAtual != null);
            } else if ( simbolo == '_') {
                do {
                    if (nodeAtual.getFilhoDireito() == null) {
                        nodeAtual.setFilhoDireito(nodeCriado);
                    } else {
                        nodeAtual = nodeAtual.getFilhoDireito();
                    }
                } while (nodeAtual != null);
            }
        }
    }

    private Node criarNode(String morse, char Caracter )
    {
        Node node = new Node();
        node.setCaracter(Caracter);
        return node;
    }
}
