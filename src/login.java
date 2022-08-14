import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class login extends JDialog{
    private JTextField emailTF;
    private JPasswordField passwordTF;
    private JButton okBTN;
    private JPanel loginpanel;
    private JButton cancelButton;
    private JButton recordarBTN;


    public login(JFrame parent) {
        super(parent);
        setTitle("Login");
        setContentPane(loginpanel);
        setMinimumSize(new Dimension(640,480));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        okBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailTF.getText();
                String password = String.valueOf(passwordTF.getPassword());
                System.out.println("boton ok");

                user = getAuthenticationUser(email,password);
                if(user!= null){
                    dispose();
                }else {
                    JOptionPane.showMessageDialog(login.this,"Email o Password incorrectos","ERROR",JOptionPane.ERROR_MESSAGE);
                    Limpiar();
                }
            }
        });


        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Boton Cancel");
                dispose();;
            }
        });
        recordarBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon icono = new ImageIcon("src/images/user.png");
                JOptionPane.showMessageDialog(null, "El usuario es : csjurado@epn.edu.ec \n El password es : 852046 ",
                        "AYUDA PARA INGRESAR ", JOptionPane.PLAIN_MESSAGE, icono);
            }
        });
        setVisible(true);
    }

    public User user;
    private User getAuthenticationUser(String email,String password){
        User user = null;

        final String DB_URL="jdbc:mysql://localhost/mitienda?serverTimezone=UTC";
        final String USERNAME= "root";
        final String PASSWORD= "";
        try{
            Connection conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            Statement stmt=conn.createStatement();
            String sql="SELECT * FROM users WHERE email=? AND password=?";
            PreparedStatement preparedStatement=conn.prepareStatement(sql);
            preparedStatement.setString(1,email);
            preparedStatement.setString(2,password);
            System.out.println("Conexion ok ");
            ResultSet resultSet=preparedStatement.executeQuery();
            if(resultSet.next()){
                user= new User();

                user.nombre=resultSet.getString("nombre");
                user.email=resultSet.getString("email");
                user.celular=resultSet.getString("celular");
                user.direccion=resultSet.getString("direccion");
                user.password=resultSet.getString("password");
            }
            stmt.close();
            conn.close();
        }catch (Exception e){
            System.out.println("Error de conexion");
            e.printStackTrace();
        }

        return user;
    }
    public static void main(String[] args) {
        login loginForm = new login(null);
        User user = loginForm.user;

        if(user!=null){

            ImageIcon usuarioimg = new ImageIcon("src/images/user.png");
            JOptionPane.showMessageDialog(null, "Atenticacion correcta :"+user.nombre +"\n Email : "+user.email+"\n Celular : "+user.celular +"\n Direccion : "+user.direccion +"\n Password : "+user.password,
                "ACCESO PERMITIDO", JOptionPane.INFORMATION_MESSAGE, usuarioimg);




        }else{

            System.out.println("Autenticacion fallida");
        }
    }
    public void Limpiar(){
        emailTF.setText("");
        passwordTF.setText("");
    }
}

