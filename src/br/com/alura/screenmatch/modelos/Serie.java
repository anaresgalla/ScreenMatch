package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodosPorTemporada;
    private int duracaoDoEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodosPorTemporada() {
        return episodosPorTemporada;
    }

    public void setEpisodosPorTemporada(int episodosPorTemporada) {
        this.episodosPorTemporada = episodosPorTemporada;
    }

    public int getDuracaoDoEpisodio() {
        return duracaoDoEpisodio;
    }

    public void setDuracaoDoEpisodio(int duracaoDoEpisodio) {
        this.duracaoDoEpisodio = duracaoDoEpisodio;
    }

    @Override
    public int getDuracao() {
        return (temporadas * episodosPorTemporada * duracaoDoEpisodio);
    }

    @Override
    public String toString() {
        return "Série: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
