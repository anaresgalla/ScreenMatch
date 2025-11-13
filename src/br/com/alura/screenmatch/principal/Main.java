package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1972);
        //meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setGenero("Crime");
        meuFilme.setDuracao(175);
        //meuFilme.setAnoDeLancamento(1972); -> --> o ano está sendo passado no construtor
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

        Filme outroFilme = new Filme("Avatar", 2020);
        //outroFilme.setNome("Avatar");
        outroFilme.setGenero("Aventura");
        outroFilme.setDuracao(200);
        //outroFilme.setAnoDeLancamento(2020); -> o ano está sendo passado no construtor
        //outroFilme.somaDasAvaliacoes = 0;
        //outroFilme.totalDeAvaliacoes = 0;

        Serie minhaSerie = new Serie("Lost", 2004);
        // minhaSerie.setNome("Lost"); -> nome passado no construtor
        // minhaSerie.setAnoDeLancamento(2004); --> ano passado no construtor
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

        var filme3 = new Filme("Dogville", 2003);
        //filme3.setNome("Dogville"); --> o nome está sendo passado no construtor
        filme3.setGenero("Drama");
        filme3.setDuracao(200);
        //filme3.setAnoDeLancamento(2003); --> o ano está sendo passado no construtor
        filme3.avalia(10);

        List<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(filme3);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Nome do primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes); //usou o toString antes
    }

}

