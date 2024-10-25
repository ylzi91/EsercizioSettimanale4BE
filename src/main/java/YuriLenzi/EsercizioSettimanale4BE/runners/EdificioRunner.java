package YuriLenzi.EsercizioSettimanale4BE.runners;

import YuriLenzi.EsercizioSettimanale4BE.entities.Edificio;
import YuriLenzi.EsercizioSettimanale4BE.servicies.EdificioService;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class EdificioRunner implements CommandLineRunner {

    @Autowired
    EdificioService edificioService;
    @Override
    public void run(String... args) throws Exception {
//        for (int i = 0; i < 10; i++) {
//            Faker faker = new Faker(Locale.ITALY);
//            edificioService.saveEdificio(new Edificio(faker.company().name(), faker.address().fullAddress(), faker.address().cityName()));
//
//        }

    }
}
