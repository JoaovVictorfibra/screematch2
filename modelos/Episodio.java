package modelos;

public class Episodio  extends Serie implements Classificavel {
    private int numero;
    private String nome;
    private String serie;
    private int totalVisualizacoes;

    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSerie(){
        return serie;

    }
    public void setSerie(Serie serie){
        this.serie = serie.getNome();
    }
    public int getTotalVisualizacoes(){
        return totalVisualizacoes;
    }
    public void setTotalVisualizacoes(int totalVisualizacoes){
        this.totalVisualizacoes = totalVisualizacoes;
    }

    @Override
    public int getClassificavel() {
        if(totalVisualizacoes > 100){
            return 4;
        }else{
        return 2;
    }
}
}
