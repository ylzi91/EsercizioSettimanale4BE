package YuriLenzi.EsercizioSettimanale4BE.runners;

import YuriLenzi.EsercizioSettimanale4BE.entities.Postazione;
import YuriLenzi.EsercizioSettimanale4BE.entities.Prenotazione;
import YuriLenzi.EsercizioSettimanale4BE.repositories.PrenotazioneRepository;
import YuriLenzi.EsercizioSettimanale4BE.servicies.PostazioneService;
import YuriLenzi.EsercizioSettimanale4BE.servicies.PrenotazioneService;
import YuriLenzi.EsercizioSettimanale4BE.servicies.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class PrenotazioneRunner implements CommandLineRunner {
    @Autowired
    PrenotazioneService prenotazioneService;
    @Autowired
    UtenteService utenteService;
    @Autowired
    PostazioneService postazioneService;

    @Override
    public void run(String... args) throws Exception {
//        prenotazioneService.salvaNuovaPrenotazione(new Prenotazione(LocalDate.now(), utenteService.findById("avide.sala"), postazioneService.findById(2)));

    }
}
