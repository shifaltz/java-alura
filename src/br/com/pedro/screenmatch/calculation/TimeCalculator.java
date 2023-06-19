package br.com.pedro.screenmatch.calculation;

import br.com.pedro.screenmatch.model.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

//    public void include(Film film){
//        totalTime += film.getDurationMinutes();
//    }
//
//    public void include(Serie serie){
//        totalTime += serie.getDurationMinutes();
//    }

    public void include(Title title){
        totalTime += title.getDurationMinutes();
    }

}
