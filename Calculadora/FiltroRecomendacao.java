package Calculadora;

import modelos.Classificavel;

public class FiltroRecomendacao {


    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificavel() >=4){
            System.out.println("Está entre os preferidos do momento");
        }else if(classificavel.getClassificavel() >=2){
            System.out.println("Muito bem avaliado no momneto!");
        }else{
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
