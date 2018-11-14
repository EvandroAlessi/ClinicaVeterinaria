package clinicaveterinaria;

import java.util.Objects;

public class Raca {
    private String Nome;
    private Especie especie;
    
    public Raca(String Nome) {
        this.Nome = Nome;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Raca Nome(String Nome) {
        this.Nome = Nome;
        return this;
    }

    public Especie getEspecie() {
        return this.especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Raca)) {
            return false;
        }
        Raca raca = (Raca) o;
        return Objects.equals(Nome, raca.Nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Nome);
    }

    @Override
    public String toString() {
        return "{" +
            " Nome='" + getNome() + "'" +
            ", especie='" + getEspecie() + "'" +
            "}";
    }
}
