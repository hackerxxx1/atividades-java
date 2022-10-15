import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
               Login x = new Login();
               Cadastro y = new Cadastro();
               Cadastroc z = new Cadastroc();
               x.nav(false);
               y.nav(false);
               z.nav(true);
                
            }
            });
            String url = "jdbc:mysql://localhost/jeduk?useTimeZone=true&serverTimezone=UTC";
            String user = "root";
            String password= "root123";
    
            Connection con = DriverManager.getConnection(url, user, password);
            con.close();
        }
      
}
