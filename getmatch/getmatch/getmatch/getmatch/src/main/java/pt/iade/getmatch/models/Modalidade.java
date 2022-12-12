package pt.iade.getmatch.models;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "modalidade_jogo")
public class Modalidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "modalidade_jogo_id")
    private int id;
    
    @Column(name = "modalidade_nome")
    private String name;
    
    @Column(name = "modalidade_tipo")
    private String tipo;
    
    @Column(name = "jogador_numero_maximo")
    private int nmrJogadores;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNmrJogadores() {
        return nmrJogadores;
    }

    public void setNmrJogadores(int nmrJogadores) {
        this.nmrJogadores = nmrJogadores;
    }
  
}
