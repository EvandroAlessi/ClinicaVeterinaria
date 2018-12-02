package clinicaveterinaria;

public class Cliente extends Pessoa{
    private String CPF;
    
    public Cliente(String CPF, int ID, String nome) {
        super(ID, nome);
        this.CPF = CPF;
    }
    
    public String getCPF() {
        return this.CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Cliente CPF(String CPF) {
        this.CPF = CPF;
        return this;
    }

    public String toString() {
        return "{" +
            " CPF='" + getCPF() + "'" +
            "}";
    }
}
