// Main.java
public class Main {
    public static void main(String[] args) {
        final int NUM_DIGITS = 12;

        // Constrói o grafo de objetos
        PhoneModel model = new PhoneModel();
        Screen screen = new Screen(model); // O Screen agora registra seus próprios observadores
        KeyPad keyPad = new KeyPad(model);

        // Executa o programa
        keyPad.simulateKeyPresses(NUM_DIGITS);
    }
}