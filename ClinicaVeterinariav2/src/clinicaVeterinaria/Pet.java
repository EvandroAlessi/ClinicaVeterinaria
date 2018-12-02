package clinicaVeterinaria;

public class Pet extends EntidadeBase implements Controlador {
    private String sexo;
    private int idade;

    public Pet(String sexo, int idade, String nome, int id) {
        this.sexo = sexo;
        this.idade = idade;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
