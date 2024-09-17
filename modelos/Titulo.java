package modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvalicoes;
    private int duracaoEmMinutos;


    public Titulo() {}

    public Titulo(String nome, int anoDeLancamento, boolean incluidoNoPlano, int tottalDeAvalicoes, int duracaoEmMinutos) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.incluidoNoPlano = incluidoNoPlano;
        this.totalDeAvalicoes = tottalDeAvalicoes;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }
    public int getTottalDeAvalicoes() {
        return totalDeAvalicoes;
    }
    public void setTotalDeAvalicoes(int tottalDeAvalicoes) {
        this.totalDeAvalicoes = tottalDeAvalicoes;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }


    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }


   /* public void exibiFichaTecnica(){
        System.out.println("Nome: " + nome + " Lancamento: " + anoDeLancamento + " Incluido no plano:" + incluidoNoPlano + " Duracao:" + duracaoEmMinutos);

    }*/

    public void avalia(double nota){
        somaDasAvaliacoes+=nota;
        totalDeAvalicoes++;
    }

    public double media(){
        if(somaDasAvaliacoes==0){
            return 0;
        }
        return somaDasAvaliacoes/totalDeAvalicoes;
    }

    @Override
    public String toString() {
        return "titulo " + nome +
            ", Lancamento= " + anoDeLancamento +
                ", incluido no Plano= " + incluidoNoPlano +
                ", soma das avaliacoes= " + somaDasAvaliacoes +
                ", total de avalicoes= " + totalDeAvalicoes +
                ", duracao em Minutos= " + duracaoEmMinutos ;
    }
}

