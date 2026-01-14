package MyGrud;

import java.awt.EventQueue;

/*
 * Main Class
 * ----------
 * Ang class na ito ang entry point ng GRUD application.
 * Responsable ito sa pagsimula at pagpapakita ng program.
 */
public class grudMen {

    /*
     * main Method
     * -----------
     * Ito ang unang method na tinatawag kapag pinatakbo ang programa.
     */
    public static void main(String[] args) {

        /*
         * EventQueue.invokeLater()
         * ------------------------
         * Sinisiguro nitong ang GUI ng Swing ay nilikha at pinatakbo
         * sa Event Dispatch Thread (EDT),
         * na kinakailangan para sa ligtas na operasyon ng GUI sa multithreading.
         */
        EventQueue.invokeLater(() -> {

            // Gumagawa ng instance ng ScheduleGRUD application
            ScheduleGRUD app = new ScheduleGRUD();

            // Ipinapakita ang main application window
            app.show();
        });
    }
}
