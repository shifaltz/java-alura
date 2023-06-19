package br.com.pedro.screenmatch.model;

public class Title implements Comparable<Title>{
    private String name;
    private int yearRelease;
    private boolean includedPlan;
    private double sumRating;
    private int totalRating;
    private int durationMinutes;

    public Title(String name, int yearRelease) {
        this.name = name;
        this.yearRelease = yearRelease;
    }

    public String getName() {
        return name;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public boolean isIncludedPlan() {
        return includedPlan;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public int getTotalRating() {
        return totalRating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public void setIncludedPlan(boolean includedPlan) {
        this.includedPlan = includedPlan;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public void showDatasTitle(){
        System.out.println("NOME DO TITULO: " + name);
        System.out.println("ANO DE LANÇAMENTO: " + yearRelease);
    }
    public void rate(double rating){
        sumRating += rating;
        totalRating++;
    }
    public double averageRating(){
        return sumRating / totalRating;
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }
}
