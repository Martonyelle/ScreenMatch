package br.com.alura.screenmatch.calculo;

public class FilterRecommend {

    public void filter(Sortable sortable){
        if (sortable.getSortable() >= 4)
            System.out.println("Está entre os preferidos do momento");
        else if(sortable.getSortable() >= 2)
            System.out.println("Muito bem avaliado no momento!");
        else
            System.out.println("Vale a pena conferir!");
    }
}
