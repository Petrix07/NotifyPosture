package notifyposture;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

/**
 * @author Luiz Fernando Petris
 */
public class NotifyPosture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(() -> {
            JOptionPane.showMessageDialog(null, "Corrigir a postura!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }, 0, 6, TimeUnit.SECONDS);
    }
 
}
