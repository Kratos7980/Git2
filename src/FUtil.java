import java.io.File;
public class FUtil {
    /**
     * Verifica si un objeto File existe.
     *
     * @param filename nombre del objeto
     * @return true si existe, de lo contrario devuelve false.
     * @throws IllegalArgumentException si le pasamos una cadena vacía como argumento.
     * @author Carlos
     */
    public static boolean existe(String filename) throws IllegalArgumentException {

        if(filename.isBlank()) {
            throw new IllegalArgumentException("Está vacío");
        }
        File file = new File(filename);
        if (file.exists()) {
            return true;
        }
        return false;
    }
}