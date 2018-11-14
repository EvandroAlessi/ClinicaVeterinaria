package clinicaveterinaria;

import java.util.List;
import java.util.Objects;

public class Animal {
    private String nome;
    private String sexo;
    private int idade;
    private Raca raca;

    public Animal(String nome, String sexo, int idade, Raca raca) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.raca = raca;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Raca getRaca() {
        return this.raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public Animal nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Animal sexo(String sexo) {
        this.sexo = sexo;
        return this;
    }

    public Animal idade(int idade) {
        this.idade = idade;
        return this;
    }

    public Animal raca(Raca raca) {
        this.raca = raca;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Animal)) {
            return false;
        }
        Animal animal = (Animal) o;
        return Objects.equals(nome, animal.nome) && Objects.equals(sexo, animal.sexo) && idade == animal.idade && Objects.equals(raca, animal.raca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sexo, idade, raca);
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", sexo='" + getSexo() + "'" +
            ", idade='" + getIdade() + "'" +
            ", raca='" + getRaca() + "'" +
            "}";
    }
}
