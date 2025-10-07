
import java.util.ArrayList;
import java.util.List;

/**
 * Armazena um número de telefone, dígito por dígito, e notifica os observadores sobre as mudanças.
 */
public class PhoneModel {
    private List<Integer> digits = new ArrayList<>();
    private List<PhoneObserver> observers = new ArrayList<>();

    /**
     * Adiciona um novo dígito e notifica todos os observadores registrados.
     * @param newDigit O novo dígito a ser adicionado.
     */
    public void addDigit(int newDigit) {
        digits.add(newDigit);
        notifyObservers();
    }

    public List<Integer> getDigits() {
        return digits;
    }

    /**
     * Adiciona um observador à lista.
     * @param observer O observador a ser adicionado.
     */
    public void addObserver(PhoneObserver observer) {
        observers.add(observer);
    }

    /**
     * Notifica todos os observadores chamando seu método update.
     */
    private void notifyObservers() {
        for (PhoneObserver observer : observers) {
            observer.update(this);
        }
    }
}