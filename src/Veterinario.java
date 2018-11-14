package clinicaveterinaria;

import java.util.Objects;

public class Veterinario extends EntidadeBase{
    private String registro;
    private String telefone;

    public Veterinario(String registro, String telefone, int ID, String nome) {
        super(ID, nome);
        this.registro = registro;
        this.telefone = telefone;
    }

    public String getRegistro() {
        return this.registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Veterinario registro(String registro) {
        this.registro = registro;
        return this;
    }

    public Veterinario telefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            ", registro='" + getRegistro() + "'" +
            ", nome='" + getNome() + "'" +
            ", telefone='" + getTelefone() + "'" +
            "}";
    }
    
}
