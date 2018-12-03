package clinicaVeterinaria;

public class Exame{
    private int id;
    private String descricao;
    private String resultado;

    public Exame(int id, String descricao, String resultado) {
        this.id = id;
        this.descricao = descricao;
        this.resultado = resultado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
}
