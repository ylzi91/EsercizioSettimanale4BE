package YuriLenzi.EsercizioSettimanale4BE.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name = "prenotazioni")
@Getter
@ToString
public class Prenotazione {
    @Id
    @GeneratedValue
    @Column(name= "id_prenotazione")
    private long idPrenotazione;
    private LocalDate localDate;
    @ManyToOne
    private Utente utente;
    @ManyToOne
    private Postazione postazione;

    public Prenotazione(){}
    public Prenotazione(LocalDate localDate, Utente utente, Postazione postazione) {
        this.localDate = localDate;
        this.utente = utente;
        this.postazione = postazione;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public void setPostazione(Postazione postazione) {
        this.postazione = postazione;
    }
}
