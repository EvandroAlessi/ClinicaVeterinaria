package clinicaVeterinaria;

public class Veterinario extends Pessoa implements Controlador{
    private String registro;
    private double salario;

    public Veterinario(String registro, double salario, String email, String nome, String telefone, Endereco endereco) {
        super(email, nome, telefone, endereco);
        this.registro = registro;
        this.salario = salario;
    }
    
    public Veterinario buscarVeterinario(){
        return this;
    }
    
    public void realizarConsulta(int id){
        
    }
    
    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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
