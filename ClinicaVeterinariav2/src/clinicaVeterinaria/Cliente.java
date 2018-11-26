package clinicaVeterinaria;

public class Cliente extends Pessoa{
    private String CPF;

    public Cliente(String nome, String email, String telefone, int id, Endereco endereco) {
        super(nome, email, telefone, id, endereco);
    }

    @Override
    public String toString() {
        return super.toString()+"Cliente{" + "CPF=" + CPF + '}';
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}