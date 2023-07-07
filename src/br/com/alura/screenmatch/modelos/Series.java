package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Sortable;

public class Series extends Title implements Sortable {
    private int season;
    private boolean active;
    private int epsForSeason;
    private int minutesForEps;

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpsForSeason() {
        return epsForSeason;
    }

    public void setEpsForSeason(int epsForSeason) {
        this.epsForSeason = epsForSeason;
    }

    public int getMinutesForEps() {
        return minutesForEps;
    }

    public void setMinutesForEps(int minutesForEps) {
        this.minutesForEps = minutesForEps;
    }

    @Override
    public int getDurationInMinutes() {
        return season * epsForSeason * minutesForEps;
    }

    @Override
    public int getSortable() {
        return (int)gotAverage() / 2;
    }
}
