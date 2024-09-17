package Calculadora;

import modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme filme) {
//        this.tempoTotal += filme.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie serie) {
//        this.tempoTotal += serie.getMinutosPorEpisodio();
//    }

    public void inclui(Titulo titulo){
        System.out.println("adiconando duração em minutos de " + titulo.getNome());
        tempoTotal += titulo.getDuracaoEmMinutos();
    }



   /* public void tempoDeMaratona(int tempo){
        tempoTotal = tempo + tempo;
    }*/

    @Override
    public String toString() {
        return "Calculadora De Tempo" +
                " tempoTotal= " + tempoTotal;
    }
}
