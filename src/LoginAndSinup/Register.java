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


public class Register implements ActionListener {
	// Labels
	JFrame fr = new JFrame("Regiser");
	JLabel user = new JLabel("UserName:");
	JLabel pass = new JLabel("Password:");
	JTextField userf = new JTextField();
	JPasswordField passf= new JPasswordField();
	JButton login = new JButton("login");
	JTextField userSf = new JTextField();
	JPasswordField passSf= new JPasswordField();
	JTextField namef = new JTextField();
	//JTextField nidf = new JTextField();
	String [] catc = {"Male","Female","Both"};
	JComboBox nidf=new JComboBox(catc);
	JTextField addressf = new JTextField();
	JButton signup = new JButton("Signup");
	JButton reset = new JButton("Reset");
	JTextField contactf = new JTextField();
	JLabel userS = new JLabel("UserName:");
	JLabel passS = new JLabel("Password:");
	JLabel name = new JLabel("Name:");
	JLabel nid = new JLabel("Gender:");
	JLabel address = new JLabel("Address:");
	JLabel contact = new JLabel("Phone:");
	public Register() {
		
		a();
	}
	private void a() {
		userSf.setBounds(160, 40, 100, 20);
		passSf.setBounds(160, 80, 100, 20);
		namef.setBounds(160, 120, 100, 20);
		nidf.setBounds(160, 160, 100, 20);
		addressf.setBounds(160, 200, 100, 20);
//
		contactf.setBounds(160, 240, 100, 20);
		signup.setBounds(40, 310, 100, 30);

		reset.setBounds(160, 310, 100, 30);
		
		userS.setBounds(40, 40, 100, 20);
		passS.setBounds(40, 80, 100, 20);
		name.setBounds(40, 120, 100, 20);

		nid.setBounds(40, 160, 100, 20);
		address.setBounds(40, 200, 100, 20);
		contact.setBounds(40, 240, 100, 20);
		fr.add(userSf);
		fr.add(passSf);
		fr.add(signup);
		fr.add(reset);
		fr.add(contactf);
		fr.add(addressf);
		fr.add(nidf);
		fr.add(namef);
		reset.addActionListener(this);
		signup.addActionListener(this);
		fr.add(userS);
		fr.add(passS);
		fr.add(name);
		fr.add(contact);
		fr.add(address);
		fr.add(nid);
		login.setForeground(Color.white);
		login.setBackground(Color.blue);
		reset.setForeground(Color.white);
		reset.setBackground(Color.blue);
		signup.setForeground(Color.white);
		signup.setBackground(Color.blue);
		login.addActionListener(this);
	
		user.setBounds(20, 40, 100, 20);
		userf.setBounds(120, 40, 100, 20);
		pass.setBounds(20, 170, 100, 20);
		passf.setBounds(120, 170, 100, 20);
		login.setBounds(10, 310, 100, 30);
		fr.setBounds(400, 50, 320, 390);
		fr.getContentPane().setLayout(null);
		fr.getContentPane().setBackground(Color.orange);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setResizable(true);
		
	passSf.setBackground(Color.pink);userSf.setBackground(Color.pink);namef.setBackground(Color.pink);nidf.setBackground(Color.pink);
		addressf.setBackground(Color.pink);contactf.setBackground(Color.pink);
		
		passSf.setForeground(Color.blue);userSf.setForeground(Color.blue);namef.setForeground(Color.blue);nidf.setForeground(Color.blue);
		addressf.setForeground(Color.blue);
		
		passS.setForeground(Color.blue);userS.setForeground(Color.blue);
		name.setForeground(Color.blue);nid.setForeground(Color.blue);
		address.setForeground(Color.blue);contact.setForeground(Color.blue);
		address.setForeground(Color.blue);contact.setForeground(Color.blue);
	}

	public static void main(String[] args) {
		new Register();
	}

	@Override
	public void actionPerformed(ActionEvent i) {
	
         if(i.getSource()==login) {
        	login();
         }
        		
			if(i.getSource()==signup) {
		  signup();
			}
			
			if(i.getSource()==reset) {
				  reset();
					}
		
      }
	private void reset() {
		userSf.setText("");
		passSf.setText("");
		namef.setText("");
		nidf.setSelectedIndex(0);
	addressf.setText("");
		contactf.setText("");
		
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
      	JOptionPane.showMessageDialog(null, "Logged In Successfully","", JOptionPane.INFORMATION_MESSAGE);
      	 Student t= new   Student();
      	 fr.dispose();
      }      
      
      
      else {
         	JOptionPane.showMessageDialog(null, "Incorrect Username or Password","", JOptionPane.INFORMATION_MESSAGE);
      	
      }}
              
              
        
      }
          }catch (Exception error) {error.printStackTrace();}
 	
		userf.setText("");
		passf.setText("");
     
      
		
	}
	private void signup() {
		String db = "jdbc:mysql://localhost:3306/studentinform";
		String un = "root";
		String pass = "";

		try {
			Connection con = DriverManager.getConnection(db, un, pass);
			if (con != null) {
				System.out.println("Connection established succesfully");
				JOptionPane.showMessageDialog(null, "Connection established succesfully", "",
						JOptionPane.INFORMATION_MESSAGE);
				String sql = "INSERT INTO signup(UserName,password,Name,gender,Address,Contact) VALUES (?,?,?,?,?,?)";
				PreparedStatement st1 = con.prepareStatement(sql);
			 
				st1.setString(1,userSf.getText());
				st1.setString(2, passSf.getText());
				st1.setString(3, namef.getText());
				st1.setString(4, (String) nidf.getSelectedItem());
				st1.setString(5,addressf.getText());
				st1.setString(6, contactf.getText());
				String use=userSf.getText();

				int rows = st1.executeUpdate();
				if (rows > 0) {
					System.out.println("Created succesfully");
					JOptionPane.showMessageDialog(null,use+ " Created succesfully", "",
							JOptionPane.INFORMATION_MESSAGE);
				}

				else {
					System.out.println(" not created");
					JOptionPane.showMessageDialog(null, "Connection not established succesfully", "",
							JOptionPane.INFORMATION_MESSAGE);
				}

			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		userSf.setText("");
		passSf.setText("");
		namef.setText("");
		nidf.setSelectedItem(0);
	addressf.setText("");
		contactf.setText("");
		
		new Login();
		fr.dispose();
		
	}



		
		

	}



// }
