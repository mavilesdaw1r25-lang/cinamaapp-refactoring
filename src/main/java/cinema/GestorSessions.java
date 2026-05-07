package cinema;
import java.util.ArrayList;

public class GestorSessions {
    private static final int MIN_AFORAMENT = 10;
    
    // Responsabilitats identificades:
    // 1. Cercar la sala pel seu ID.
    // 2. Cercar la pel·lícula pel seu títol.
    // 3. Validar si l'aforament és suficient.
    // 4. Comprovar conflictes horaris a la sala.
    // 5. Registrar la sessió i notificar al personal.

    public boolean programarSessio(int idSala, String titol, String hora, int aforament) {
        Sala sala = cercarSala(idSala);
        Film film = cercarFilm(titol);

        if (sala == null || film == null) return false;
        if (!validarAforament(aforament, sala)) return false;
        if (hiHaConflicteHorari(idSala, hora)) return false;

        Sessio novaSessio = new Sessio(sala, film, hora);
        notificarPersonal(sala, film, hora, novaSessio);
        return true;
    }

    private Sala cercarSala(int idSala) {
        // Lògica simulada de cerca
        return new Sala(idSala); 
    }

    private Film cercarFilm(String titol) {
        // Lògica simulada de cerca
        return new Film(titol);
    }

    private boolean hiHaConflicteHorari(int idSala, String hora) {
        // Simulem que no hi ha conflicte per a l'exemple
        return false;
    }

    private boolean validarAforament(int aforament, Sala sala) {
        return aforament >= MIN_AFORAMENT;
    }

    private void notificarPersonal(Sala sala, Film film, String hora, Sessio s) {
        System.out.println("Notificant personal per a la sessió de " + film.getTitol());
    }
}