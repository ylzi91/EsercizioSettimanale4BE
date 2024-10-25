package YuriLenzi.EsercizioSettimanale4BE.entities;

import YuriLenzi.EsercizioSettimanale4BE.myEnum.TipoPostazione;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@ToString
public class Postazione {
    @Id
    @GeneratedValue
    @Column(name = "id_postazione")
    private long idPostazione;
    private String descrizione;
    @Enumerated(value = EnumType.STRING)
    private TipoPostazione tipoPostazione;
    private int numMax;
    @ManyToMany
    @JoinTable(
            name = "edifici_postazioni",
            joinColumns = @JoinColumn(name = "id_postazione"),
            inverseJoinColumns = @JoinColumn(name = "id_edificio")

    )
    private List<Edificio> edifici = new ArrayList<>();

    public Postazione(){}

    public Postazione(String descrizione, TipoPostazione tipoPostazione, List<Edificio> edifici) {
        this.descrizione = descrizione;
        this.tipoPostazione = tipoPostazione;
        this.edifici = edifici;
        switch (tipoPostazione.toString()){
            case "PRIVATO":
                this.numMax = 1;
                break;
            case "OPENSPACE":
                this.numMax = 10;
                break;
            case "SALARIUNIONI":
                this.numMax = 50;
                break;
        }

    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setNumMax(int numMax) {
        this.numMax = numMax;
    }

    public void setEdifici(List<Edificio> edifici) {
        this.edifici = edifici;
    }
}
