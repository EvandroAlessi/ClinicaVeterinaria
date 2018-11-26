package clinicaVeterinaria;

public class Veterinario extends Pessoa{
    private String registro;
    private double salario;

    public Veterinario(String nome, String email, String telefone, int id, Endereco endereco) {
        super(nome, email, telefone, id, endereco);
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    @Override
    public String toString() {
        return super.toString()+"Veterinario{" + "registro=" + registro + ", salario=" + salario + '}';
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
