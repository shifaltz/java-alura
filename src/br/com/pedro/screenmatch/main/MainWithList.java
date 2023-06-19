package br.com.pedro.screenmatch.main;

import br.com.pedro.screenmatch.model.Film;
import br.com.pedro.screenmatch.model.Serie;
import br.com.pedro.screenmatch.model.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainWithList {
    public static void main(String[] args) {
        Film myFilm = new Film("Harry Potter", 2001);
        myFilm.rate(9);
        Film myFilm2 = new Film("Avatar", 2023);
        myFilm2.rate(6);
        Film myFilm3 = new Film("Top Gun: Maverick", 2022);
        myFilm3.rate(10);
        Serie mySerie = new Serie("Lost", 2000);

        ArrayList<Title> listWatched = new ArrayList<>();
        listWatched.add(myFilm);
        listWatched.add(myFilm2);
        listWatched.add(myFilm3);
        listWatched.add(mySerie);

        for (Title item: listWatched) {
            System.out.println(item.getName());
            System.out.println(item.getYearRelease());
            if(item instanceof Film film && film.getClassification() > 2){
                System.out.println("Classificação " + film.getClassification());
            }
        }

        ArrayList<String> searchForArtist = new ArrayList<>();
        searchForArtist.add("Adam Sandler");
        searchForArtist.add("Jamie Foxx");
        searchForArtist.add("Ben Affleck");
        System.out.println("Lista de atores SEM ordem " + searchForArtist);

        Collections.sort(searchForArtist);
        System.out.println("Lista de atores POR ordem alfabetica " + searchForArtist);

        Collections.sort(listWatched);
        System.out.println("Lista de filmes SEM ordem de lançamento " + listWatched);
        listWatched.sort(Comparator.comparing(Title::getYearRelease));
        System.out.println("Lista de filmes POR ordem de lançamento " + listWatched);
    }
}
