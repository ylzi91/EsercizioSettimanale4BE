package YuriLenzi.EsercizioSettimanale4BE.servicies;

import YuriLenzi.EsercizioSettimanale4BE.entities.Postazione;
import YuriLenzi.EsercizioSettimanale4BE.entities.Prenotazione;
import YuriLenzi.EsercizioSettimanale4BE.entities.Utente;
import YuriLenzi.EsercizioSettimanale4BE.repositories.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class PrenotazioneService {
    @Autowired
    PrenotazioneRepository prenotazioneRepository;

    public void salvaNuovaPrenotazione(Prenotazione nuovaPrenotazione){
        Optional<Prenotazione> prenotazioni = prenotazioneRepository.prenotazioneSiNo(nuovaPrenotazione.getUtente(), nuovaPrenotazione.getPostazione(), nuovaPrenotazione.getLocalDate());
        if(prenotazioni.isPresent()){
            System.out.println("Posto già prenotato, non puoi prenotarti");
        }
        else {
            prenotazioneRepository.save(nuovaPrenotazione);
            System.out.println("Prenotazione salvata");
        }

    }

}
