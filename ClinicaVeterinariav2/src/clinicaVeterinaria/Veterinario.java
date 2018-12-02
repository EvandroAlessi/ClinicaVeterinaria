package clinicaVeterinaria;

public class Veterinario extends Pessoa{
    private String registro;
    private double salario;

    public Veterinario(String registro, double salario, String email, String nome, String telefone, Endereco endereco) {
        super(email, nome, telefone, endereco);
        this.registro = registro;
        this.salario = salario;
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
