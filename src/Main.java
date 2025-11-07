import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setGenero("Crime");
        meuFilme.setDuracao(175);
        meuFilme.setAnoDeLancamento(1972);
        //meuFilme.somaDasAvaliacoes = 0;
        //meuFilme.totalDeAvaliacoes = 0;

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(9.5);
        //System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.calculaMedia());

        meuFilme.exibeFichaTecnica();

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setGenero("Aventura");
        outroFilme.setDuracao(200);
        outroFilme.setAnoDeLancamento(2020);
        //outroFilme.somaDasAvaliacoes = 0;
        //outroFilme.totalDeAvaliacoes = 0;

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("Lost");
        minhaSerie.setAnoDeLancamento(2004);
        minhaSerie.setTemporadas(6);
        minhaSerie.setDuracaoDoEpisodio(40);
        minhaSerie.setEpisodosPorTemporada(20);
        System.out.println("Duração total da série: " + minhaSerie.getDuracao() + " min.");
        minhaSerie.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal() + " minutos.");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTemporada(1);
        episodio.setTotalVisualizacoes(20);
        filtro.filtra(episodio);
    }

}

