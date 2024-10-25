package YuriLenzi.EsercizioSettimanale4BE.runners;

import YuriLenzi.EsercizioSettimanale4BE.entities.Utente;
import YuriLenzi.EsercizioSettimanale4BE.servicies.UtenteService;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Locale;


@Component
public class UtenteRunner implements CommandLineRunner {

    @Autowired
    UtenteService utenteService;

    @Override
    public void run(String... args) throws Exception {
        Faker faker = new Faker(Locale.ITALY);
//        for (int i = 0; i < 10; i++) {
//            utenteService.salvaUtente(new Utente(faker.name().username(), faker.lordOfTheRings().character(), faker.internet().emailAddress()));
//
//        }

    }
}
