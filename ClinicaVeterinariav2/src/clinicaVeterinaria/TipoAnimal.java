package clinicaVeterinaria;

import java.util.List;

public class TipoAnimal implements Controlador{
    private String nome;
    private List<Raca> raca;
    
    public TipoAnimal(List<Raca> raca, String nome) {
        this.raca = raca;
        this.nome = nome;
    }

    public TipoAnimal buscarTipoAnimal(String nome){
        return this;
    }
    
    public String getNome() {
        return nome;
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
