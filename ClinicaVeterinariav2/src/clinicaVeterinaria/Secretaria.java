package clinicaVeterinaria;

public class Secretaria extends Pessoa implements Controlador{
    private int ID;
    
    public Secretaria(int id; String email, String nome, String telefone, Endereco endereco) {
        super(email, nome, telefone, endereco);
        this.ID = id;
    }
    
    public int getID(){
        return this.ID;
    }
    
    public void setID(int id){
        this.ID = id;
    }
    
    @Override
    public Object buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cadastrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
