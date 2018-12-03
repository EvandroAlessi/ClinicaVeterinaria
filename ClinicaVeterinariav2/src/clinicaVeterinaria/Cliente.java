package clinicaVeterinaria;

import java.util.List;

public class Cliente extends Pessoa implements Controlador{
    private String CPF;
    private List<Pet> pets;
    
    public Cliente(String CPF, String nome, Endereco endereco, String email, String telefone, List<Pet> pets) {
        super(email, nome, telefone, endereco);
        this.CPF = CPF;
        this.pets = pets;
    }
    
    public Cliente buscarCliente(String cpf){
        return this;
    }
    
    public String getCPF() {
        return this.CPF;
    }

    public void setPets(String CPF) {
        this.CPF = CPF;
    }
    public List<Pet> getPets() {
        return this.pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
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
