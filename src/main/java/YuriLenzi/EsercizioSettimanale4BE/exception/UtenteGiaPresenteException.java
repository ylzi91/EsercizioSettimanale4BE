package YuriLenzi.EsercizioSettimanale4BE.exception;

public class UtenteGiaPresenteException extends RuntimeException {
    public UtenteGiaPresenteException(String username) {
        super("L'username " + username + " è già presente nel db");
    }
}
