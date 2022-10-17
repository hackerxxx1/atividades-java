import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
               Login x = new Login();
               x.nav(true);
                
            }
            });
           
            
        }
      
}
