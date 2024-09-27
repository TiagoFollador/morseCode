public class Main {
    public static void main(String[] args) {
        ArvoreBinariaMorse bin = new ArvoreBinariaMorse();

        bin.insert("._", 'A');
        bin.insert("_...", 'B');
        bin.insert("_._.", 'C');
        bin.insert("_..", 'D');
        bin.insert(".", 'E');
        bin.insert(".._.", 'F');
        bin.insert("__.", 'G');
        bin.insert("....", 'H');
        bin.insert("..", 'I');
        bin.insert(".___", 'J');
        bin.insert("_._", 'K');
        bin.insert("._..", 'L');
        bin.insert("__", 'M');
        bin.insert("_.", 'N');
        bin.insert("___", 'O');
        bin.insert(".__.", 'P');
        bin.insert("__._", 'Q');
        bin.insert("._.", 'R');
        bin.insert("...", 'S');
        bin.insert("_", 'T');
        bin.insert(".._", 'U');
        bin.insert("..._", 'V');
        bin.insert(".__", 'W');
        bin.insert("_.._", 'X');
        bin.insert("_.__", 'Y');
        bin.insert("__..", 'Z');

        bin.insert("_____", '0');
        bin.insert(".____", '1');
        bin.insert("..___", '2');
        bin.insert("...__", '3');
        bin.insert("...._", '4');
        bin.insert(".....", '5');
        bin.insert("_....", '6');
        bin.insert("__...", '7');
        bin.insert("___..", '8');
        bin.insert("____.", '9');


        bin.consulta("__... ...__ __..."); // 737
    }
}
