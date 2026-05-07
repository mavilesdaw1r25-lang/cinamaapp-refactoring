package cinema;
import java.util.ArrayList;

public class GestorReserves {

    public enum TipusReserva { ESTANDARD, PREESTRENA, VIP }

    // Constants de descompte (valors d'exemple lògics)
    private static final double DESCOMPTE_PREESTRENA = 0.20;
    private static final double BONUS_GRUP_GRAN = 0.10;
    private static final double DESCOMPTE_VIP = 0.15;
    private static final int MIDA_GRUP_GRAN = 5;

    private ArrayList<int[]> reservesRegistrades = new ArrayList<>();

    public boolean reservar(TipusReserva tipus, int[] seients, double preuPerSeient) {
        // Clàusula de guarda: retorna false si seients és null o buit
        if (seients == null || seients.length == 0) {
            return false;
        }

        double total = calcularTotal(tipus, seients.length, preuPerSeient);
        registrarReserva(seients);
        mostrarResum(tipus, seients.length, total);
        return true;
    }

    private double calcularTotal(TipusReserva tipus, int numSeients, double preuBase) {
        double total = numSeients * preuBase;
        
        // Apliquem descomptes per tipus
        if (tipus == TipusReserva.PREESTRENA) {
            total -= total * DESCOMPTE_PREESTRENA;
        } else if (tipus == TipusReserva.VIP) {
            total -= total * DESCOMPTE_VIP;
        }

        // Apliquem bonus per grup gran
        if (numSeients >= MIDA_GRUP_GRAN) {
            total -= total * BONUS_GRUP_GRAN;
        }
        
        return total;
    }

    private void registrarReserva(int[] seients) {
        reservesRegistrades.add(seients);
    }

    private void mostrarResum(TipusReserva tipus, int numSeients, double total) {
        System.out.println("Reserva " + tipus + " registrada. Seients: " + numSeients + ". Total a pagar: " + total + "€");
    }
}