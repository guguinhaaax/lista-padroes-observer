
import java.util.Random;

/**
 * Simula a entrada de dados de um teclado de telefone,
 * enviando dígitos para o modelo.
 */
public class KeyPad {
    private final PhoneModel model;

    public KeyPad(PhoneModel model) {
        this.model = model;
    }

    public void simulateKeyPresses(int numKeyPresses) {
        final int MAX_DIGIT = 10; // Dígitos válidos são 0-9
        Random rnd = new Random();
        for (int i = 0; i < numKeyPresses; i++) {
            int newDigit = rnd.nextInt(MAX_DIGIT);
            model.addDigit(newDigit);
        }
    }
}