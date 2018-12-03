package clinicaVeterinaria;

public class Cliente extends Pessoa implements Controlador{
    private String CPF;
    
    public Cliente(String CPF, String nome, Endereco endereco, String email, String telefone) {
        super(email, nome, telefone, endereco);
        this.CPF = CPF;
    }
    
    public Cliente buscarCliente(String cpf){
        return this;
    }
    
    public String getCPF() {
        return this.CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
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
