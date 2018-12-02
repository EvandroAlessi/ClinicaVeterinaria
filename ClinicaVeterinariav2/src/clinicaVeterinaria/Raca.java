package clinicaVeterinaria;

public class Raca extends EntidadeBase {
    private TipoAnimal tipoAnimal;

    public Raca(TipoAnimal tipoAnimal, int ID, String nome) {
        super(ID, nome);
        this.tipoAnimal = tipoAnimal;
    }

    public TipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(TipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

   
    public String toString() {
        return "Raca{" + "tipoAnimal=" + tipoAnimal + '}';
    }
    
}
