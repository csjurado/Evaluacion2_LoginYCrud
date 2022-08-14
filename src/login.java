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
                    JOptionPane.showMessageDialog(login.this,"email o password incorrectos","Intente Nuevamente",JOptionPane.ERROR_MESSAGE);
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

            ImageIcon icono = new ImageIcon("src/images/user.png");
            JOptionPane.showMessageDialog(null, "Atenticacion correcta :+user.nombre \n email : +user.email  celular : +user.celular \n direccion : +user.direccion \n password : +user.password",
                "Mi titulo", JOptionPane.INFORMATION_MESSAGE, icono);


            /*
             System.out.println("Atenticacion correcta:"+user.nombre);
            System.out.println("email: "+user.email);
            System.out.println("celular: "+user.celular);
            System.out.println("direccion : "+user.direccion);
            System.out.println("password : "+user.password);
             */

        }else{

            System.out.println("Autenticacion fallida");
        }
    }
}

