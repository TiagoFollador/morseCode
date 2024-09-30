import java.util.Scanner;

public class UI {

    private ArvoreBinariaMorse ABM;

    public UI(){
        this.ABM = new ArvoreBinariaMorse();
        this.ABM.insert("._", 'A');
        this.ABM.insert("_...", 'B');
        this.ABM.insert("_._.", 'C');
        this.ABM.insert("_..", 'D');
        this.ABM.insert(".", 'E');
        this.ABM.insert(".._.", 'F');
        this.ABM.insert("__.", 'G');
        this.ABM.insert("....", 'H');
        this.ABM.insert("..", 'I');
        this.ABM.insert(".___", 'J');
        this.ABM.insert("_._", 'K');
        this.ABM.insert("._..", 'L');
        this.ABM.insert("__", 'M');
        this.ABM.insert("_.", 'N');
        this.ABM.insert("___", 'O');
        this.ABM.insert(".__.", 'P');
        this.ABM.insert("__._", 'Q');
        this.ABM.insert("._.", 'R');
        this.ABM.insert("...", 'S');
        this.ABM.insert("_", 'T');
        this.ABM.insert(".._", 'U');
        this.ABM.insert("..._", 'V');
        this.ABM.insert(".__", 'W');
        this.ABM.insert("_.._", 'X');
        this.ABM.insert("_.__", 'Y');
        this.ABM.insert("__..", 'Z');

        this.ABM.insert("_____", '0');
        this.ABM.insert(".____", '1');
        this.ABM.insert("..___", '2');
        this.ABM.insert("...__", '3');
        this.ABM.insert("...._", '4');
        this.ABM.insert(".....", '5');
        this.ABM.insert("_....", '6');
        this.ABM.insert("__...", '7');
        this.ABM.insert("___..", '8');
        this.ABM.insert("____.", '9');
    }

    public boolean app(){
        showOptions();
        return chooseBetweenOpitions(choosingOption());
    }

    private void showOptions(){
        System.out.println("[1] - Realizar uma consulta \n[2] - Exibir a árvore \n[3] - Sair");
    }

    private boolean chooseBetweenOpitions(int choosedOption){
        switch (choosedOption){
            case 1:
                realizarConsulta();
                return true;
            case 2:
                exibirArvore();
                return true;
            case 3:
                adeus();
                return false;
            default:
                errorMensage();
                return true;
        }
    }

    private int choosingOption(){
        Scanner teclado = new Scanner(System.in);
        int option;
        try {
            System.out.print(">>> ");
            option = teclado.nextInt();
            return option;
        } catch (Exception e) {
            e.printStackTrace();
            errorMensage();
            return 0;
        }
    }

    private void errorMensage(){
        System.out.println("Parece que ocorreu algo errado, tente novamente!");
    }

    private void realizarConsulta(){
        Scanner teclado = new Scanner(System.in);
        String palavra = "";
        try {
            System.out.print(
                    "Digite o codigo morse no padrao \".\" \"_\" " +
                    "\nPara alternar entre palavras, basta inserir " +
                    "um espaco entre os codigos morses" +
                    "\nLembrando que ! representa desconhecido/nenhum caracter  \n>>> "
            );
            palavra = teclado.nextLine();
            ABM.consulta(palavra);
        } catch (Exception e){
            e.printStackTrace();
            errorMensage();
        }
    }

    public void exibirArvore(){
        System.out.println("0   1   2   3   4   5");
        ABM.exibirArvore();
    }

    private void adeus(){
        System.out.println("Obrigado por utilizar nosso aplicativo!!");
        System.out.println("Feito por: \n --- Luiz Mathias Rivabem Filho --- \n >>> Rafaela Vecchi <<< \n === Tiago de Brito Follador === ");
    }

}
