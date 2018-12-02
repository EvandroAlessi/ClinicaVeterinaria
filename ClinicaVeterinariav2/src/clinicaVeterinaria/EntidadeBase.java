package clinicaveterinaria;

public class EntidadeBase {
    private int ID;
    private String nome;
    private Endereco endereco;
    private String email;

    public EntidadeBase(int ID, String nome) {
        this.ID = ID;
        this.nome = nome;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }
}
