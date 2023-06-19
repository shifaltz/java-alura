package br.com.pedro.screenmatch.model;

import br.com.pedro.screenmatch.calculation.Sortable;

public class Film extends Title implements Sortable {
    private String director;

    public Film(String name, int yearRelease) {
        super(name, yearRelease);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) (averageRating() / 2);
    }

    @Override
    public String toString() {
        return "FILME: " + this.getName() + " (" + this.getYearRelease() + ")";
    }
}