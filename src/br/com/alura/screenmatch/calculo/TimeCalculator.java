package br.com.alura.screenmatch.calculo;
import br.com.alura.screenmatch.modelos.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

 //   public void addToCalculator(Movie f){
 //       this.totalTime += f.getDurationInMinutes();
 //   }

 //   public void addToCalculator(Series s){
 //       this.totalTime += s.getDurationInMinutes();
 //   } o que está acontecendo logo abaixo é o chamado de polimorfismo

    public void addToCalculator(Title title){
        this.totalTime += title.getDurationInMinutes();
    }

}
