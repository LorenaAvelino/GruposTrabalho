package io.github.lorena.grupostrabalho.model.entities;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Atuacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate inicio;
    private LocalDate termino;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pessoa_id")
    @JsonbTransient
    private Pessoa pessoa;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "grupo_id")
    @JsonbTransient
    private Grupo grupo;


    //<editor-fold defaultstate="collapsed" desc="Constructors">

    public Atuacao() {
    }

    public Atuacao(LocalDate inicio, Grupo grupo) {
        this.inicio = inicio;
        this.grupo = grupo;
    }

    public Atuacao(LocalDate inicio, LocalDate termino, Grupo grupo) {
        this.inicio = inicio;
        this.termino = termino;
        this.grupo = grupo;
    }

    //</editor-fold>>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getTermino() {
        return termino;
    }

    public void setTermino(LocalDate termino) {
        this.termino = termino;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    //</editor-fold>
}
