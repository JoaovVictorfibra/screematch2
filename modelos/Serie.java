package modelos;

public class Serie extends Filme {
   private int temporadas;
   private int episodiosPorTemporadas;
   private boolean ativa;
   private int minutosPorEpisodio;

   public Serie(){}

    public Serie(int temporadas, int episodiosPorTemporadas, boolean ativa, int minutosPorEpisodio) {
       this.temporadas = temporadas;
       this.episodiosPorTemporadas = episodiosPorTemporadas;
       this.ativa = ativa;
       this.minutosPorEpisodio = minutosPorEpisodio;

    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }

    public int getDuracaoEmMinutos() {
        return minutosPorEpisodio * temporadas * episodiosPorTemporadas;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }



    @Override
    public String toString() {
        return "titulo= " + getNome()+ ", Lançamento= "+ getAnoDeLancamento()+ ", Incluido no plano= "+ isIncluidoNoPlano()+
                ", total de avaliações = "+ getTottalDeAvalicoes()+ ", Duração total da seire em minutos= " + getDuracaoEmMinutos() +
                ", temporadas= " + temporadas + ", episodios por temporada= " + episodiosPorTemporadas + ", plano " + ativa;
    }
}
