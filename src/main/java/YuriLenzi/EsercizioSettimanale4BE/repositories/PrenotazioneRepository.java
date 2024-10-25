package YuriLenzi.EsercizioSettimanale4BE.repositories;

import YuriLenzi.EsercizioSettimanale4BE.entities.Postazione;
import YuriLenzi.EsercizioSettimanale4BE.entities.Prenotazione;
import YuriLenzi.EsercizioSettimanale4BE.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {

    @Query("select p from Prenotazione p where p.utente = :utente and p.postazione = :postazione and p.localDate = :localDate")
    Optional<Prenotazione> prenotazioneSiNo (Utente utente, Postazione postazione, LocalDate localDate);
}
