package io.github.lorena.grupostrabalho.model.dtos;

import java.time.LocalDate;

public class MembroDto {
    private String grupo;
    private String nome;
    private LocalDate inicio;

    //<editor-fold defaultstate="collapsed" desc="Constructors">

    public MembroDto(String nomeGrupo, LocalDate dataInicio, String nomeMembro) {
        this.grupo = nomeGrupo;
        this.inicio = dataInicio;
        this.nome = nomeMembro;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    //</editor-fold>
}
