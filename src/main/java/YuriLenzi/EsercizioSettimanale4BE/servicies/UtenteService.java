package YuriLenzi.EsercizioSettimanale4BE.servicies;

import YuriLenzi.EsercizioSettimanale4BE.entities.Utente;
import YuriLenzi.EsercizioSettimanale4BE.exception.UtenteGiaPresenteException;
import YuriLenzi.EsercizioSettimanale4BE.repositories.PostazioneRepository;
import YuriLenzi.EsercizioSettimanale4BE.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UtenteService {
    @Autowired
    UtenteRepository utenteRepository;


    public void salvaUtente(Utente newUtente){
        Optional<Utente> utenteSioNo = utenteRepository.findById(newUtente.getUsername());
        if(utenteSioNo.isPresent()){
            throw new UtenteGiaPresenteException(newUtente.getUsername());
        }
        else {
            utenteRepository.save(newUtente);
            System.out.println("Utente " + newUtente.getNome() + " è stato salvato");
        }


    }
}
