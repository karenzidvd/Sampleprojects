package LoginAndSinup;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Student.Student;


public class Login implements ActionListener {
	// Labels
	JFrame fr = new JFrame();
	JLabel user = new JLabel("UserName:");
	JLabel pass = new JLabel("Password:");
	JTextField userf = new JTextField();
	JPasswordField passf= new JPasswordField();
	JButton login = new JButton("login");
	JButton register = new JButton("Register");
	public Login() {
		
		a();
	}
	private void a() {
		register.addActionListener(this);
		login.addActionListener(this);
		fr.add(user);
		fr.add(pass);
		fr.add(userf);
		fr.add(passf);
		fr.add(register);
		fr.add(login);
		user.setBounds(30, 10, 150, 30);
		userf.setBounds(130, 10, 150, 30);
		pass.setBounds(30, 55, 150, 30);
		passf.setBounds(130, 55, 150, 30);
		login.setBounds(20, 100, 100, 30);
		register.setBounds(210, 100, 100, 30);
		register.setForeground(Color.white);
		register.setBackground(Color.blue);
		
		login.setForeground(Color.white);
		login.setBackground(Color.blue);
		passf.setForeground(Color.blue);
		userf.setForeground(Color.blue);
		pass.setForeground(Color.blue);
		user.setForeground(Color.blue);
		passf.setBackground(Color.pink);
		userf.setBackground(Color.pink);
		fr.setTitle("Login");
		fr.setBounds(500, 50, 350, 185);
		fr.getContentPane().setLayout(null);
		fr.setVisible(true);
		fr.setResizable(true);
		fr.getContentPane().setBackground(Color.gray);
	}

	public static void main(String[] args) {
		new Login();
	}

	@Override
	public void actionPerformed(ActionEvent i) {
	
         if(i.getSource()==login) {
        	login();
         }
         if(i.getSource()==register) {
         	register();
          }		
			
		
		
      }
	private void register() {
  Register r=new Register();
  fr.dispose();
		
	}
	private void login() {
		 String userID = userf.getText();
         String word = passf.getText();
   
      try
      {
    	  if(userID.equals("") && word.equals("")) {
	          	JOptionPane.showMessageDialog(null, "Please Fill All The Fieds","", JOptionPane.INFORMATION_MESSAGE);
	          }else {
    	Connection  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinform", "root", "");
    	String sql = "select Username,password from signup where Username = '" + userID + "';";
          PreparedStatement ps = connection.prepareStatement(sql);
          ResultSet rs = ps.executeQuery();
          while(rs.next())
          {
     
      
      if(userID.equals(rs.getString("Username")) && word.equals(rs.getString("password")) ) {
      	JOptionPane.showMessageDialog(null, userID+" Logged In Successfully","", JOptionPane.INFORMATION_MESSAGE);
      	 Student t= new   Student();
      	 fr.dispose();
      }      
      
      
     }
              
              
        
      }
          }catch (Exception error) {error.printStackTrace();}
 	
		userf.setText("");
		passf.setText("");
     
      
		
	}




		
		

	}



// }
