package YuriLenzi.EsercizioSettimanale4BE.repositories;

import YuriLenzi.EsercizioSettimanale4BE.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Long> {

}
