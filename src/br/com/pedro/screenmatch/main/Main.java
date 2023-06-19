package br.com.pedro.screenmatch.main;

import br.com.pedro.screenmatch.calculation.RecommendationFilter;
import br.com.pedro.screenmatch.calculation.TimeCalculator;
import br.com.pedro.screenmatch.model.Episodes;
import br.com.pedro.screenmatch.model.Film;
import br.com.pedro.screenmatch.model.Serie;
import br.com.pedro.screenmatch.model.Title;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Film myFilm = new Film("Harry Potter", 2001);
        myFilm.setDurationMinutes(180);
        System.out.println("Duração do filme: " + myFilm.getDurationMinutes());

        Film myFilm2 = new Film("Avatar", 2023);
        myFilm2.setDurationMinutes(200);

        Film myFilm3 = new Film("Top Gun: Maverick", 2022);
        myFilm3.setDurationMinutes(180);
        myFilm3.rate(10);

        myFilm.showDatasTitle();
        myFilm.rate(8);
        myFilm.rate(5);
        myFilm.rate(10);
        System.out.println("Total de avaliações: " + myFilm.getTotalRating());
        System.out.println(myFilm.averageRating());

        Serie mySerie = new Serie("Lost", 2000);
        mySerie.showDatasTitle();
        mySerie.setSeasons(10);
        mySerie.setEpisodesPerSeason(10);
        mySerie.setMinutesPerEpisode(50);
        System.out.println("Duração para maratonar a série: " + mySerie.getDurationMinutes());

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myFilm);
        calculator.include(myFilm2);
        calculator.include(mySerie);
        System.out.println(calculator.getTotalTime());

        RecommendationFilter filter = new RecommendationFilter();
        filter.filters(myFilm);

        Episodes episode = new Episodes();
        episode.setNumber(1);
        episode.setSerie(mySerie);
        episode.setTotalViews(300);
        filter.filters(episode);

//        ArrayList<Film> listFilm = new ArrayList<>();
//        listFilm.add(myFilm);
//        listFilm.add(myFilm2);
//        listFilm.add(myFilm3);
//        System.out.println("Tamanho da lista de filmes " + listFilm.size());
//        System.out.println("Nome do primeiro filme da lista " + listFilm.get(0).getName());
//        System.out.println("Testando override no toString " + listFilm.toString());

    }
}
