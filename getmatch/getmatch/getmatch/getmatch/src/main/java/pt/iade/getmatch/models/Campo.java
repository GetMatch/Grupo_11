package pt.iade.getmatch.models;


import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
    
@Entity
@Table(name = "campo")
public class Campo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "campo_id")
    private int id;
    
    @Column(name = "campo_nome")
    private String name;
    
    @Column(name = "campo_localizacao")
    private String localizacao;

    @Column(name = "campo_endereco")
    private String endereco;
    
    @Column(name = "campo_telefone")
    private int nmrTelefone;

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

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNmrTelefone() {
        return nmrTelefone;
    }

    public void setNmrTelefone(int nmrTelefone) {
        this.nmrTelefone = nmrTelefone;
    }

    
    
}
