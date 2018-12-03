package clinicaVeterinaria;

import java.util.List;

public class Raca implements Controlador{
    private TipoAnimal tipoAnimal;
    private List<Pet> pets;
    private String nome;

    public Raca(TipoAnimal tipoAnimal, String nome, List<Pet> pets) {
        this.tipoAnimal = tipoAnimal;
        this.nome = nome;
        this.pets = pets;
    }

    public void setTipoAnimal(TipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(Pet pets) {
        this.pets = (List<Pet>) pets;
    }
    
    @Override
    public Object buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Object object) {
        Validate validate = new Validate();
        validate.validarUsuario();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(int id) {
        Validate validate = new Validate();
        validate.validarUsuario();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cadastrar() {
        Validate validate = new Validate();
        validate.validarUsuario();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
