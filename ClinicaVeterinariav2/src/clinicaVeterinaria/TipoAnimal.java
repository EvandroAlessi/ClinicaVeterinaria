package clinicaVeterinaria;

import java.util.List;

public class TipoAnimal extends EntidadeBase{
    private List<Raca> raca;

    public TipoAnimal(List<Raca> raca) {
        this.raca = raca;
    }

    public List<Raca> getRaca() {
        return this.raca;
    }

    public void setRaca(List<Raca> raca) {
        this.raca = raca;
    }

    public String toString() {
        return "TipoAnimal{" + "raca=" + raca + '}';
    }
}
