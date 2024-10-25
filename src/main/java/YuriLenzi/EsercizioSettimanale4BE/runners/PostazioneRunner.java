package YuriLenzi.EsercizioSettimanale4BE.runners;

import YuriLenzi.EsercizioSettimanale4BE.entities.Postazione;
import YuriLenzi.EsercizioSettimanale4BE.myEnum.TipoPostazione;
import YuriLenzi.EsercizioSettimanale4BE.servicies.EdificioService;
import YuriLenzi.EsercizioSettimanale4BE.servicies.PostazioneService;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class PostazioneRunner implements CommandLineRunner {

    @Autowired
    PostazioneService postazioneService;

    @Autowired
    EdificioService edificioService;
    @Override
    public void run(String... args) throws Exception {


//        for (int i = 0; i < 5; i++) {
//            Faker faker = new Faker(Locale.ITALY);
//            postazioneService.salvaPostazione(new Postazione(faker.funnyName().name(), TipoPostazione.SALARIUNIONI, edificioService.tuttiGliEdifici()));
//        }

        postazioneService.filtraPerTipoCitta(TipoPostazione.SALARIUNIONI, "Samira lido").forEach(postazione -> {
            System.out.println("Nome sala: " + postazione.getDescrizione());
            System.out.println("Nel/Negli edificio/i: ");
            postazione.getEdifici().forEach(edificio -> {
                System.out.println(edificio.getNome());
                System.out.println("Nella citta di " + edificio.getCitta());
            });
            System.out.println("-----------------------------------");
        });


    }
}
