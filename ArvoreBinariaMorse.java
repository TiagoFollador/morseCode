public class ArvoreBinariaMorse {
    private Node raiz;

    public ArvoreBinariaMorse() {
        this.raiz = new Node();
    }


    /**
     *
     * @param morse
     * String Codigo morse a ser recebido
     *
     * @param caracter
     * Char Caracter que o codigo representa
     *
     * Realiza a insersao de um novo Node(Letra), por meio do codigo morse recebido.
     * */
    public void insert(String morse, char caracter )
    {
        Node nodeAtual = this.raiz;
        char[] morseCode = morse.toCharArray();
        for (char simbolo: morseCode){
            if (simbolo == '.'){ // caso seja ponto, se locomove para a esquerda
                if (nodeAtual.getFilhoEsquerdo() == null) {
                    nodeAtual.setFilhoEsquerdo(new Node());
                    nodeAtual = nodeAtual.getFilhoEsquerdo();
                } else {
                    nodeAtual = nodeAtual.getFilhoEsquerdo();
                }
            } else if ( simbolo == '_') { // caso seja traco, se locomove para adireita
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

    /**
     * @param morseCode
     * String codigo morse em string
     *
     * Metodo reponsavel por pesquisar qual qual char
     * o codigo morse esta representando
     *
     * retorna o char do Node caso ele tenha sido encontrado
     * Caso nao tenham encontrado, retorna um ! que representa caracter desconhecido/nenhum
     *
     * */
    private char parseMorseCodeToChar(String morseCode)
    {
        Node noAtual = this.raiz;
        char[] morseCodeSplitted = morseCode.toCharArray();
        for (char simbolo: morseCodeSplitted){
            if(noAtual != null) {
                if (simbolo == '.') {
                    noAtual = noAtual.getFilhoEsquerdo();
                } else if (simbolo == '_') {
                    noAtual = noAtual.getFilhoDireito();
                }
            }
        }
        if (noAtual != null) {
            return noAtual.getCaracter();
        } else {
            return '!';
        }
    }


    /**
     * @param completeMorseCode
     * String Codigo morse recebido do input do usuario, pode ser uma letra ou uma palavra
     *
     * consulta na arvore binaria oque cada parte do codigo representa em char. Transforma o v
     * alor recebido pela funcao em um char array. Após isso ele procura por espacos, que reprensentam
     * a divisao entre cada letra do codigo morse. A cada espaco encontrado ele envia para
     * a funcao parseMorseCodeToChar e adiciona o retorno dela no array da traducao.
     * */
    public void consulta(String completeMorseCode)
    {
        int comecoDoCodigoMorse = 0;
        int fimDoCodigoMorse = 1;
        completeMorseCode += " ";
        String letter = "";
        String morseCodeTranslated = "";
        char[] morseCodeSplitted = completeMorseCode.toCharArray();

        for(char simbolo: morseCodeSplitted){
            if (simbolo == ' '){
                letter = completeMorseCode.substring(comecoDoCodigoMorse, fimDoCodigoMorse);
                morseCodeTranslated += parseMorseCodeToChar(letter);
                comecoDoCodigoMorse = fimDoCodigoMorse;
            }
            fimDoCodigoMorse++;
        }
        System.out.println(morseCodeTranslated);
    }


    /**
     * funcao para montar e exibir a arvore binaria
     * */
    public void exibirArvore()
    {
        montarArvore(this.raiz, 0);
    }

    /**
     * @param node
     * Node atual
     * @param tamanho
     * o tamanho atual da arvore
     *
     * Esse metodo recursivo retorna a arvore binaria, ele inicia buscando o valor da extrema direita
     * na maior altura e a monta a partir dali. No caso indo da altura maxima a direita e terminando na
     * altura minima a esquerda. Ele
     * */
    private void montarArvore(Node node, int tamanho)
    {
        if (node == null){
            return;
        }

        montarArvore(node.getFilhoDireito(), tamanho + 1);

        for (int i = 0; i < tamanho; i++) {
//            if (i == tamanho - 1){
//                System.out.print(" " + tamanho + " ");
//
//            } else {
//                System.out.print("   ");
//
//            }
            System.out.print("    ");
        }
        System.out.println(node.getCaracter());

        montarArvore(node.getFilhoEsquerdo(), tamanho + 1);
    }
}
