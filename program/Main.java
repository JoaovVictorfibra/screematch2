package program;

import java.util.ArrayList;

import Calculadora.CalculadoraDeTempo;
import Calculadora.FiltroRecomendacao;
import modelos.Episodio;
import modelos.Filme;
import modelos.Serie;

public class Main {
    public static void main(String[] args) {



    Serie lost = new Serie();
    lost.setNome("Lost");
    lost.setAnoDeLancamento(2020);
    lost.setIncluidoNoPlano(true);
    lost.setMinutosPorEpisodio(50);
    lost.setAtiva(true);
    lost.setTemporadas(4);
    lost.avalia(10);
    lost.avalia(10);
    lost.setEpisodiosPorTemporadas(20);

    Filme capitao = new Filme();
    capitao.setNome("Capitao America primeiro vingador");
    capitao.avalia(10);
    capitao.avalia(8);
    capitao.setDuracaoEmMinutos(180);
    capitao.setAnoDeLancamento(2020);
    capitao.setIncluidoNoPlano(true);

    Filme capitao2 = new Filme();
    capitao2.setNome("Capitao America 2 soldado infernal");
    capitao2.setDuracaoEmMinutos(160);
    capitao2.setAnoDeLancamento(2021);
    capitao2.setIncluidoNoPlano(true);

    var filmedopaulo = new Filme();
    filmedopaulo.setNome("Dogville");
    filmedopaulo.setDuracaoEmMinutos(200);
    filmedopaulo.setAnoDeLancamento(2003);
    filmedopaulo.avalia(10);
    

    ArrayList<Filme>listaDeFilemes = new ArrayList<>();
    listaDeFilemes.add(capitao2);
    listaDeFilemes.add(capitao);
    listaDeFilemes.add(filmedopaulo);

    //System.out.println("tamanho da lista " + listaDeFilemes.size());
    //System.out.println("primeiro filem " + listaDeFilemes.get(0).getNome());
    System.out.println(listaDeFilemes);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(capitao);
        calculadora.inclui(capitao2);
        calculadora.inclui(lost);


        Episodio episodio = new Episodio();
        episodio.setSerie(lost);
        episodio.setNumero(5);
        episodio.setTotalVisualizacoes(300);

        /*System.out.println(calculadora);
        System.out.println(lost);
        System.out.println(capitao);
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(capitao);
        filtro.filtra(lost);*/
    }
}