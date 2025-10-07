
import java.util.List;

/**
 * Imprime coisas na tela.
 * Cria e gerencia os observadores que reagem às mudanças no PhoneModel.
 */
public class Screen {
    private final PhoneModel model;

    public Screen(PhoneModel model) {
        this.model = model;

        // 1. Observador que imprime o dígito mais recente
        model.addObserver(new PhoneObserver() {
            @Override
            public void update(PhoneModel model) {
                List<Integer> digits = model.getDigits();
                int latestDigit = digits.get(digits.size() - 1);
                System.out.println("Pressionando: " + latestDigit);
                System.out.println(latestDigit);
            }
        });

        // 2. Observador que imprime a mensagem de discagem quando o número está completo
        model.addObserver(new PhoneObserver() {
            @Override
            public void update(PhoneModel model) {
                List<Integer> digits = model.getDigits();
                if (digits.size() == 12) {
                    StringBuilder phoneNumber = new StringBuilder();
                    for (Integer digit : digits) {
                        phoneNumber.append(digit);
                    }
                    System.out.println("Agora discando " + phoneNumber.toString() + "...");
                }
            }
        });
    }
}