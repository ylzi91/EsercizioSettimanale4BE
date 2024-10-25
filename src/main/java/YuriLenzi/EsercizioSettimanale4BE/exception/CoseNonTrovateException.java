package YuriLenzi.EsercizioSettimanale4BE.exception;

public class CoseNonTrovateException extends RuntimeException {
    public CoseNonTrovateException(Long id) {
        super(
                "L'id numero: " + id + " non è stato trovato"
        );
    }
    public CoseNonTrovateException(String username){
        super("L'username: " + username + " non è stato trovato");
    }
}
