package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1972);
        meuFilme.avalia(10);
        Filme outroFilme = new Filme("Avatar", 2020);
        outroFilme.avalia(8);
        Serie minhaSerie = new Serie("Lost", 2004);
        minhaSerie.avalia(9);
        var filme3 = new Filme("Dogville", 2003);
        filme3.avalia(8);

        List<Titulo> lista = new LinkedList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filme3);
        lista.add(minhaSerie);
        for(Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() >2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
        //lista.forEach(item -> System.out.println(item.getNome()));
        //lista.forEach(System.out::println);

        Collections.sort(lista);
        System.out.println("Títulos em ordem alfabética: " + lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Titulos ordenados por ano: " + lista);
    }
}
