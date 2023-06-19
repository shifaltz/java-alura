package br.com.pedro.screenmatch.calculation;

public class RecommendationFilter {

    public void filters(Sortable sortable){
        if (sortable.getClassification() >= 4){
            System.out.println("Está entre os preferidos do momento");
        }else if(sortable.getClassification() >= 2){
            System.out.println("Muito bem avaliado no momento");
        }else{
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
