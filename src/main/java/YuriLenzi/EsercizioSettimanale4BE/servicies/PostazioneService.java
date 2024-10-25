package YuriLenzi.EsercizioSettimanale4BE.servicies;

import YuriLenzi.EsercizioSettimanale4BE.entities.Postazione;
import YuriLenzi.EsercizioSettimanale4BE.myEnum.TipoPostazione;
import YuriLenzi.EsercizioSettimanale4BE.repositories.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostazioneService {
    @Autowired
    PostazioneRepository postazioneRepository;

    public void salvaPostazione(Postazione newPostazione){
        postazioneRepository.save(newPostazione);
    }

    public List<Postazione> filtraPerTipoCitta(TipoPostazione tipoPostazione, String citta){
        return postazioneRepository.filtraperTipoeCitta(tipoPostazione, citta);
    }
}
