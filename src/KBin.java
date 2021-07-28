import java.io.IOException;

public class KBin {
    public static void main(String[] args) throws IOException {
        char ch;
        System.out.println("Introducir un caracter: ");
        ch= (char) System.in.read();
        System.out.println("El caracter introducido es: " + ch);
    }
}
