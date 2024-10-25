package YuriLenzi.EsercizioSettimanale4BE.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

@Entity
@Getter
@ToString
@Table(name = "utenti")
public class Utente {
    @Id
    private String username;
    private String nome;
    private String email;

    public Utente() {

    }

    public Utente(String username, String nome, String email) {
        this.username = username;
        this.nome = nome;
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
