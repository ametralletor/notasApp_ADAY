 import login.Login;
public class App {
    public static void main(String[] args) throws Exception {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}
