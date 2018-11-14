package clinicaveterinaria;

import java.util.List;
import java.util.Objects;

public class Especie {
    private String nome;
    private List<Raca> raca;

    public Especie(String nome, List<Raca> raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Raca> getRaca() {
        return this.raca;
    }

    public void setRaca(List<Raca> raca) {
        this.raca = raca;
    }

    public Especie nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Especie raca(List<Raca> raca) {
        this.raca = raca;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Especie)) {
            return false;
        }
        Especie especie = (Especie) o;
        return Objects.equals(nome, especie.nome) && Objects.equals(raca, especie.raca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, raca);
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", raca='" + getRaca() + "'" +
            "}";
    }
}
