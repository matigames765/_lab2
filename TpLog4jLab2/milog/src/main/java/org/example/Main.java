package org.example;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
/*import org.apache.logging.log4j.log4j-cron-appender;*/

public class Main {
    final Level miLogLevel = Level.forName("miLogLevel",150);
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        Main app = new Main();
        System.out.println("La aplicacion se ha iniciado");

        if (logger.isErrorEnabled()){
            logger.error("Esto es un error");
            logger.info("Entering aplication");
            logger.debug("Esto es debug logging");
            logger.log(app.miLogLevel,"mensaje de miLogLevel");
        }
    }

    /* Investigue, documente y aplique un ejemplo de la clase ThreadContext */
    public void myMethod() {
        // Agregar datos al contexto de hilo
        ThreadContext.put("userId", "123");
        ThreadContext.put("sessionId", "abc");

        // Logear un mensaje que incluya datos del contexto de hilo

        logger.info("User {} is performing an action", ThreadContext.get("userId"));


    }
}