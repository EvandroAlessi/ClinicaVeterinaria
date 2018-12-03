package clinicaVeterinaria;

import java.sql.Time;
import java.time.LocalDateTime;

public class Agenda {

    public Agenda() {
        
    }
     
    public boolean verificarDisponibilidade(LocalDateTime data, Time hora, Veterinario veterinario){
        return true;
    }
    
    public void exibirAgenda(Veterinario veterinario){
        
    }
    
    public void adicionarConsulta(Consulta consulta, Veterinario veterinario){
        
    }
    
    public void desmarcarConsulta(Consulta consulta){
        
    }
}
