package YuriLenzi.EsercizioSettimanale4BE.repositories;

import YuriLenzi.EsercizioSettimanale4BE.entities.Postazione;
import YuriLenzi.EsercizioSettimanale4BE.myEnum.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Long> {

    @Query("select p from Postazione p join fetch p.edifici e where e.citta like :citta and p.tipoPostazione like :tipoPostazione")
    List<Postazione> filtraperTipoeCitta(TipoPostazione tipoPostazione, String citta);


}
