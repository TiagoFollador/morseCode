public class Node {
    private char caracter;

    private Node filhoEsquerdo;

    private Node filhoDireito;

    public Node() {
        this.caracter = '!';
        this.filhoEsquerdo = null;
        this.filhoDireito = null;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public void setFilhoEsquerdo(Node filhoEsquerdo) {
        this.filhoEsquerdo = filhoEsquerdo;
    }

    public void setFilhoDireito(Node filhoDireito) {
        this.filhoDireito = filhoDireito;
    }

    public char getCaracter() {
        return caracter;
    }

    public Node getFilhoEsquerdo() {
        return filhoEsquerdo;
    }

    public Node getFilhoDireito() {
        return filhoDireito;
    }
}
