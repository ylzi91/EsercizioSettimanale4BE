package YuriLenzi.EsercizioSettimanale4BE.servicies;

import YuriLenzi.EsercizioSettimanale4BE.entities.Edificio;
import YuriLenzi.EsercizioSettimanale4BE.repositories.EdificioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EdificioService {
    @Autowired
    EdificioRepository edificioRepository;

    public void saveEdificio(Edificio newEdificio){

        edificioRepository.save(newEdificio);
        System.out.println("Edificio con nome " + newEdificio.getNome() + " è stato salvato correttamente");
    }

    public List<Edificio> tuttiGliEdifici(){
        return edificioRepository.findAll();
    }
}
