package Cronometro;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            new Cronometro();
            
        }
        });
        String url = "jdbc:mysql://localhost/jeduk?useTimeZone=true&serverTimezone=UTC";
        String user = "root";
        String password= "root123";

        Connection con = DriverManager.getConnection(url, user, password);
        con.close();
    }
}
