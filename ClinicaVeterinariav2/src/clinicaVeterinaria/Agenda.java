package clinicaVeterinaria;

import java.sql.Time;
import java.time.LocalDateTime;

public class Agenda {
    private LocalDateTime data;
    private Time hora;

    public Agenda(LocalDateTime data, Time hora) {
        this.data = data;
        this.hora = hora;
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
    
    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }
}
