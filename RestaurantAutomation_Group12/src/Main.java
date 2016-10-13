
import Interface.RestaurantMainPage;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import static java.util.concurrent.TimeUnit.*;

public class Main {
    
    private final static ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public static void scheduleTask() {
        final Runnable beeper = new Runnable() {
            public void run() {
              
            }   
        };
        
        final ScheduledFuture schedulerHandle = scheduler.scheduleAtFixedRate(beeper, 0, 1, SECONDS);

        scheduler.schedule(new Runnable() {
            public void run() {
                schedulerHandle.cancel(true);
            }
        }, 24, HOURS);
    }
    
    public static void main(String[] args) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RestaurantMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaurantMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaurantMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurantMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        scheduleTask();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RestaurantMainPage temp = new RestaurantMainPage();
                temp.hideAll();
                temp.setVisible(true);
                temp.begin();
            }
        });
    } 
}
