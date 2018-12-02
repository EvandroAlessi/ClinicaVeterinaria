package clinicaVeterinaria;

public interface Controlador {
    public Object buscar(int id);
    public void editar(Object object);
    public void excluir(int id);
    public void cadastrar();
}
