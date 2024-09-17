package modelos;

public class Filme extends Titulo implements Classificavel{

    private String diretor;

    public Filme() {
        super();
    }
    public Filme(String titulo, String descricao, String diretor) {
        super();

    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificavel() {
        return (int) media() /2;
    }


    @Override
    public String toString() {
        return "Filem: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")"; 
    }
}
