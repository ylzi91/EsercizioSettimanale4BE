package YuriLenzi.EsercizioSettimanale4BE.repositories;

import YuriLenzi.EsercizioSettimanale4BE.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, String> {

}
