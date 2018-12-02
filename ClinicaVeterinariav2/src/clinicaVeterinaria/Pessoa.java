package clinicaVeterinaria;

public class Pessoa extends EntidadeBase implements Controlador{
    private String email;
    private String telefone;
    private Endereco endereco;

    public Pessoa(String email, String telefone, Endereco endereco){
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    @Override
    public void cadastrar(){
        // aqui tem a entrada de dados do Totó
    }
    
    @Override
    public void excluir(int id){
        // aqui o totó é excluido
    }
    
    @Override
    public void editar(Object object){
        // aqui totó pode virar belinha
    }
    
    @Override
    public Object buscar(int id){
        // cade o totó?
        return new Object();
    }
    
    //@Override;;
    //public String toString() {
      //  return "Pessoa{" + "nome=" +  + ", email=" + email + ", telefone=" + telefone + ", id=" + id + ", endereco=" + endereco + '}';
    //}
}
