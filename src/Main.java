import br.com.alura.screenmatch.calculo.FilterRecommend;
import br.com.alura.screenmatch.modelos.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.setName("O poderoso Chefão");
        myMovie.setYerOfRelease(1970);
        myMovie.setDurationInMinutes(180);
        myMovie.setSumOfRatings(56000);
        myMovie.setTotalOfAvaliation(5600);
        myMovie.setIncludeOnPlan(true);

        myMovie.avaliation(1);
        myMovie.showDatasheet();

        FilterRecommend filter = new FilterRecommend();
        filter.filter(myMovie);
    }
}
