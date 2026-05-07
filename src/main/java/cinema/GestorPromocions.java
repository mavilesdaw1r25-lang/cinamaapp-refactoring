package cinema;

public class GestorPromocions {
    private EstrategiaPromocio estrategia;

    // Injecció de dependències (DIP)
    public GestorPromocions(EstrategiaPromocio estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularPreuFinal(Entrada entrada) {
        return estrategia.aplicar(entrada.getPreuBase(), entrada.getClientId());
    }
}