package clinicaveterinaria;

public class EntidadeBase {
    protected int ID;
    protected String nome;

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "EntidadeBase{" + "ID=" + ID + ", nome=" + nome + '}';
    }
}
