package br.com.alura.screenmatch.modelos;

public class Title {
    private String name;
    private int yerOfRelease;
    private double sumOfRatings;
    private int totalOfAvaliation;
    private int durationInMinutes;
    private boolean includeOnPlan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYerOfRelease() {
        return yerOfRelease;
    }

    public void setYerOfRelease(int yerOfRelease) {
        this.yerOfRelease = yerOfRelease;
    }

    public double getSumOfRatings() {
        return sumOfRatings;
    }

    public void setSumOfRatings(double sumOfRatings) {
        this.sumOfRatings = sumOfRatings;
    }

    public int getTotalOfAvaliation() {
        return totalOfAvaliation;
    }

    public void setTotalOfAvaliation(int totalOfAvaliation) {
        this.totalOfAvaliation = totalOfAvaliation;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public boolean isIncludeOnPlan() {
        return includeOnPlan;
    }

    public void setIncludeOnPlan(boolean includeOnPlan) {
        this.includeOnPlan = includeOnPlan;
    }

    public void showDatasheet(){
        System.out.println("Nome do Filme: " + getName() + "\nAno de Lançamento: " + getYerOfRelease() +
                "\nDuração do filme em minutos: " + getDurationInMinutes() + "\nAvaliação do filme: " + gotAverage() + "\nTotal de avaliações: " + getTotalOfAvaliation());

    }

    public void avaliation(double note){
        sumOfRatings += note;
        totalOfAvaliation++;
    }

    protected double gotAverage(){
        return sumOfRatings / totalOfAvaliation;
    }
}
