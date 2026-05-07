package cinema;

public class ProjectorCinema implements ReproductorBasic, ServeiSubtitols {
    @Override
    public void reproduir() { /* Lògica de reproducció */ }

    @Override
    public void aturar() { /* Aturar projector */ }

    @Override
    public void ajustarVolum(int nivell) { /* Ajustar volum */ }

    @Override
    public void activarSubtitols(String idioma) { /* Mostrar subtítols */ }
    
  