import java.util.logging.Logger;
import java.util.logging.Level;

public class JavaClass {
    static Logger logger = Logger.getLogger(JavaClass.class.getName());
    public static void main(String[] args) {
        logger.log(Level.INFO, "Bonjour, Bienvenue !");
        //System.out.println("Bonjour, Bienvenue !");
    }
}
