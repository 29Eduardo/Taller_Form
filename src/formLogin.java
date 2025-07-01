import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formLogin extends JFrame {
    private JPanel loginPanel;
    private JTextField txtUsuario;
    private JComboBox comboRol;
    private JButton accesoButton;
    private JPasswordField txtPasword;

    public formLogin() {
        setTitle("Login");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(loginPanel);
        setVisible(true);

        accesoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText();
                String contrasena = String.valueOf(txtPasword.getPassword());
                String rol= (String) comboRol.getSelectedItem();

                if( usuario.isEmpty() || contrasena.isEmpty()){
                    JOptionPane.showMessageDialog(null,"LLENAR LOS CAMPOS");
                    return;
                }

                if(rol.equals("Administrador")&& usuario.equals("admin")&& contrasena.equals("123")){
                    new formAdministrador().setVisible(true);
                    dispose();
                }
            }

        });
    }
    public static void main (String[]args){
        new formLogin();
    }
}

