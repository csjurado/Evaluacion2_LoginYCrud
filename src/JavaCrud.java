import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class JavaCrud {
    JPanel Main;
    private JTextField textNombre;
    private JTextField textPais;
    private JTextField textTelefono;
    private JButton createButton;
    private JButton deleteButton;
    private JButton updateButton;
    private JTextField textID;
    private JTextField textCiudad;
    private JButton limpiarButton;
    private JButton buscarButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCrud");
        frame.setContentPane(new JavaCrud().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public JavaCrud() {
        Connect();
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            Create();
            Limpiar();
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            Limpiar();
            }
        });
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Limpiar();
            }
        });

        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Buscar();
            }
        });
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Update();
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Delete();
            }
        });
    }
    Connection con;
    PreparedStatement pst;
    public void Connect(){
        final String DB_URL="jdbc:mysql://localhost/banco?serverTimezone=UTC";
        final String USERNAME="csjurado";
        final String PASSWORD="12345";


        try{
            Connection conn= DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            Statement stmt= conn.createStatement();

            System.out.println("Conexion exitosa");

        } catch(SQLException ex){
            ex.printStackTrace();
            System.out.println("SQL incorrecto");

        }
    }

    public void Create(){
        String id,IDusuario, nombre,pais, telefono, ciudad;
        nombre=textNombre.getText();
        pais=textPais.getText();
        telefono=textTelefono.getText();
        ciudad= textCiudad.getText();
        id= textID.getText();


        final String DB_URL="jdbc:mysql://localhost/banco?serverTimezone=UTC";
        final String USERNAME="csjurado";
        final String PASSWORD="12345";


        try{
            Connection conn= DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            Statement stmt= conn.createStatement();
            String sql="insert into clientes(Nombre, Pais,Telefono,Ciudad)values(?,?,?,?)";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setString(1,nombre);
            pst.setString(2,pais);
            pst.setString(3,telefono);
            pst.setString(4,ciudad);
            //ResultSet resultSet=pst.executeQuery();
            ImageIcon icono = new ImageIcon("src/images/user.png");
            JOptionPane.showMessageDialog(null, "USUARIO CREADO CON EXITO  ",
                    "AYUDA PARA INGRESAR ", JOptionPane.PLAIN_MESSAGE, icono);
            pst.executeUpdate();
            stmt.close();
            conn.close();

        } catch(SQLException ex){
            ex.printStackTrace();
            System.out.println("SQL incorrecto");

        }
    }
    public void Limpiar(){
        textNombre.setText("");
        textPais.setText("");
        textTelefono.setText("");
        textID.setText("");
        textCiudad.setText("");
    }
    public void Buscar(){
        String id="0";
        id=textID.getText();

        final String DB_URL="jdbc:mysql://localhost/banco?serverTimezone=UTC";
        final String USERNAME="csjurado";
        final String PASSWORD="12345";


        try{
            Connection conn= DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            Statement stmt= conn.createStatement();
            String sql="select * from clientes where pid=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setString(1,id);
            //System.out.println(sql);


            ResultSet rs=pst.executeQuery();


            if(rs.next()==true){
                String nombre, pais, telefono, ciudad;
                nombre=rs.getString(2);
                pais=rs.getString(3);
                telefono=rs.getString(4);
                ciudad=rs.getString(5);

                System.out.println();
                textID.setText(id);
                textNombre.setText(nombre);
                textPais.setText(pais);
                textTelefono.setText(telefono);
                textCiudad.setText(ciudad);


            }
            else {
                ImageIcon icono = new ImageIcon("src/images/user.png");
                JOptionPane.showMessageDialog(null, "El usuario NO SE ENCUENTRA EN LA BASE DE DATOS",
                        "BUSCAR  ", JOptionPane.PLAIN_MESSAGE, icono);
                Limpiar();
            }
            stmt.close();
            conn.close();

        } catch(SQLException ex){
            ex.printStackTrace();
            System.out.println("SQL incorrecto");

        }
    }
    public void Update(){
        String id, nombre,pais, telefono, ciudad;
        id=textID.getText();
        nombre=textNombre.getText();
        telefono= textTelefono.getText();
        pais= textPais.getText();
        ciudad= textCiudad.getText();



        final String DB_URL="jdbc:mysql://localhost/banco?serverTimezone=UTC";
        final String USERNAME="csjurado";
        final String PASSWORD="12345";


        try{
            Connection conn= DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            Statement stmt= conn.createStatement();
            String sql="update clientes set Nombre=?,Pais=?,Telefono=?,Ciudad=? where pid=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setString(1,nombre);
            pst.setString(2,pais);
            pst.setString(3,telefono);
            pst.setString(4,ciudad);
            pst.setString(5,id);
            //ResultSet resultSet=pst.executeQuery();
            pst.executeUpdate();
            ImageIcon icono = new ImageIcon("src/images/user.png");
            JOptionPane.showMessageDialog(null, "REGISTRO ACTUALIZADO",
                    "BUSCAR  ", JOptionPane.PLAIN_MESSAGE, icono);
            stmt.close();
            conn.close();
            Limpiar();

        } catch(SQLException ex){
            ex.printStackTrace();
            System.out.println("SQL incorrecto");

        }
    }

    public void Delete(){
        final String DB_URL="jdbc:mysql://localhost/banco?serverTimezone=UTC";
        final String USERNAME="csjurado";
        final String PASSWORD="12345";
        String borrarid=textID.getText();

        try{
            Connection conn= DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            Statement stmt= conn.createStatement();
            String sql="delete from clientes where pid=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setString(1,borrarid);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registro borrado");
            stmt.close();
            conn.close();

        } catch(SQLException ex){
            ex.printStackTrace();
            System.out.println("SQL incorrecto");

        }
    }
}
