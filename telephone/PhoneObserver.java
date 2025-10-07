public interface PhoneObserver {
    /**
     * Este método é chamado sempre que o PhoneModel (o sujeito) é atualizado.
     * @param model O modelo que foi atualizado.
     */
    void update(PhoneModel model);
}