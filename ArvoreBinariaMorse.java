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
