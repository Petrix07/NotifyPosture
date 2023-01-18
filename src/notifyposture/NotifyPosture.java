package notifyposture;

import javax.swing.JOptionPane;

/**
 * @author Luiz Fernando Petris
 */
public class NotifyPosture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            // Executar a lógica do método aqui
            try {
                Thread.sleep(600000); // espera 10 segundos 10000
                JOptionPane.showMessageDialog(null, "Corrigir a postura!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } catch (InterruptedException e) {
                // tratar a exceção
            }
        }

    }

}
