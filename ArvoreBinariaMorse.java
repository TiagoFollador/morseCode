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

    private char parseMorseCodeToChar(char[] morseCode)
    {
        Node noAtual = this.raiz;
        for (char simbolo: morseCode){
            if (simbolo == '.'){
                noAtual = noAtual.getFilhoEsquerdo();
            } else if (simbolo == '_'){
                noAtual = noAtual.getFilhoDireito();
            }
        }
        System.out.println(noAtual.getCaracter());
        return noAtual.getCaracter();
    }

    public void consulta(String completeMorseCode)
    {
        Node noAtual = this.raiz;
        int comecoDoCodigoMorse = 0;
        int fimDoCodigoMorse = 1;
        int indexTranslated = 0;
        completeMorseCode += " ";
        char[] morseCodeSplitted = completeMorseCode.toCharArray();
        char[] letter = new char[7];
        char[] morseCodeTranslated = new char[50];
        for(char simbolo: morseCodeSplitted){
            if (simbolo == ' '){
                for (int i = comecoDoCodigoMorse, j = 0; i < fimDoCodigoMorse ; i++, j++) {
                    letter[j] = morseCodeSplitted[i];
                }
                morseCodeTranslated[indexTranslated] = parseMorseCodeToChar(letter);
                indexTranslated++;
                comecoDoCodigoMorse = fimDoCodigoMorse;
            }
            fimDoCodigoMorse++;
        }
    }
}
