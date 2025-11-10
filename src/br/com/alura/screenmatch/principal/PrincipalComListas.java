package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1972);
        Filme outroFilme = new Filme("Avatar", 2020);
        Serie minhaSerie = new Serie("Lost", 2004);
        var filme3 = new Filme("Dogville", 2003);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filme3);
        lista.add(minhaSerie);
        for(Titulo item: lista){
            System.out.println(item.getNome());
            Filme filme = (Filme) item;
            System.out.println("Classificação: " + filme.getClassificacao());
        }
    }
}
