package clinicaVeterinaria;

import java.time.LocalDateTime;

public class Tratamento {
    private int id;
    private String descricao;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;

    public Tratamento(int id, String descricao, LocalDateTime dataInicio, LocalDateTime dataFim) {
        this.id = id;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
    }
    
}
