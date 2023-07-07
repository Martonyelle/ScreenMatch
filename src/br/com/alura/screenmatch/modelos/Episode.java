package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Sortable;

public class Episode implements Sortable {
    private int number;
    private String name;
    private Series serie;
    private int totalOfVisualization;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    public int getTotalOfVisualization() {
        return totalOfVisualization;
    }

    @Override
    public int getSortable() {
        if(totalOfVisualization > 100)
            return 4;
        else
            return 2;
    }
}
