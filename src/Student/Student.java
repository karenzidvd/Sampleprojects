package Student;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Attendance.Attendance;
import Course.Course;
import Enrollement.Enrollement;
import Grade.Grade;
import LoginAndSinup.Login;
import LoginAndSinup.Register;
import Transcript.Transcript;
public class Student implements ActionListener  {
	
	public Student() {
		customize();
	}
	private void customize() {
		fr.getContentPane().setLayout(null);
		fr.setVisible(true);
		fr.setBounds(-5, 0, 1500, 800);
		fr.getContentPane().setBackground(Color.orange);
register.addActionListener(this);update.addActionListener(this);delete.addActionListener(this);reset.addActionListener(this);
select.addActionListener(this);list.addActionListener(this);
register.setBackground(Color.blue);register.setForeground(Color.white);select.setBackground(Color.blue);
update.setBackground(Color.blue);
delete.setBackground(Color.blue);
reset.setBackground(Color.blue);reset.setForeground(Color.white);
list.setBackground(Color.blue);list.setForeground(Color.white);delete.setForeground(Color.white);update.setForeground(Color.white);select.setForeground(Color.white);
		id.setForeground(Color.blue);fn.setForeground(Color.blue);ln.setForeground(Color.blue);date.setForeground(Color.blue);
		gender.setForeground(Color.blue);address.setForeground(Color.blue);ln.setForeground(Color.blue);phone.setForeground(Color.blue);
		guadianN.setForeground(Color.blue);guadianPH.setForeground(Color.blue);email.setForeground(Color.blue);


		idf.setBackground(Color.pink);fnf.setBackground(Color.pink);lnf.setBackground(Color.pink);datef.setBackground(Color.pink);
		genderf.setBackground(Color.pink);addressf.setBackground(Color.pink);lnf.setBackground(Color.pink);phonef.setBackground(Color.pink);
		guadianNf.setBackground(Color.pink);guadianPHf.setBackground(Color.pink);emailf.setBackground(Color.pink);
		
		idf.setForeground(Color.blue);fnf.setForeground(Color.blue);lnf.setForeground(Color.blue);datef.setForeground(Color.blue);
		genderf.setForeground(Color.blue);addressf.setForeground(Color.blue);lnf.setForeground(Color.blue);phonef.setForeground(Color.blue);
		guadianNf.setForeground(Color.blue);guadianPHf.setForeground(Color.blue);emailf.setForeground(Color.blue);
		
		attendance.setBackground(Color.blue);attendance.setForeground(Color.white);
		course.setBackground(Color.blue);course.setForeground(Color.white);
		enrollement.setBackground(Color.blue);enrollement.setForeground(Color.white);
		grade.setBackground(Color.blue);grade.setForeground(Color.white);
		student.setBackground(Color.blue);student.setForeground(Color.white);
		transcript.setBackground(Color.blue);transcript.setForeground(Color.white);
		logout.setBackground(Color.blue);logout.setForeground(Color.white);
attendance.setBounds(0, 10, 200, 40);course.setBounds(200, 10, 200, 40);enrollement.setBounds(400, 10, 200, 40);	
grade.setBounds(600, 10, 200, 40);student.setBounds(800, 10, 200, 40);transcript.setBounds(1000, 10, 200, 40);	
logout.setBounds(1200, 10, 200, 40);id.setBounds(400, 100, 150, 30);fn.setBounds(400, 150, 150, 30);	
ln.setBounds(400, 200, 150, 30);date.setBounds(400, 250, 150, 30);gender.setBounds(400, 300, 150, 30);	
address.setBounds(400, 350, 150, 30);phone.setBounds(400, 400, 150, 30);email.setBounds(400, 450, 150, 30);
guadianN.setBounds(400, 500, 150, 30);guadianPH.setBounds(400, 550, 150, 30);

register.setBounds(400, 620, 80, 30);select.setBounds(500, 620, 80, 30);update.setBounds(600, 620, 80, 30);
delete.setBounds(700, 620, 80, 30);list.setBounds(800, 620, 80, 30);reset.setBounds(900, 620, 80, 30);
attendance.addActionListener(this);course.addActionListener(this);
enrollement.addActionListener(this);grade.addActionListener(this);
student.addActionListener(this);transcript.addActionListener(this);logout.addActionListener(this);
idf.setBounds(600, 100, 150, 30);fnf.setBounds(600, 150, 150, 30);	
lnf.setBounds(600, 200, 150, 30);datef.setBounds(600, 250, 150, 30);genderf.setBounds(600, 300, 150, 30);	
addressf.setBounds(600, 350, 150, 30);phonef.setBounds(600, 400, 150, 30);emailf.setBounds(600, 450, 150, 30);
guadianNf.setBounds(600, 500, 150, 30);guadianPHf.setBounds(600, 550, 150, 30);
fr.add(logout);fr.add(attendance);fr.add(course);fr.add(enrollement);fr.add(grade);fr.add(student);fr.add(transcript);		
fr.add(register);fr.add(select);fr.add(update);fr.add(delete);fr.add(list);fr.add(reset);fr.add(id);fr.add(fn);
fr.add(ln);fr.add(date);fr.add(gender);fr.add(address);fr.add(phone);fr.add(email);fr.add(guadianN);fr.add(guadianPH);	
fr.add(idf);fr.add(fnf);fr.add(lnf);fr.add(datef);fr.add(genderf);fr.add(addressf);fr.add(phonef);fr.add(emailf);fr.add(guadianNf);fr.add(guadianPHf);	
	}
	JFrame fr=new JFrame("Student");
	JButton logout=new JButton("Logout");
	JButton attendance=new JButton("Attendance");
	JButton course=new JButton("Course");
	JButton enrollement=new JButton("Enrollement");
	JButton grade=new JButton("Grade");
	JButton student=new JButton("Student");
	JButton transcript=new JButton("Transcript");
	

	JButton register=new JButton("Register");
	JButton select=new JButton("Select");
	JButton update=new JButton("Update");
	JButton delete=new JButton("Delete");
	JButton list=new JButton("List");
	JButton reset=new JButton("Reset");
	
	JLabel id=new JLabel("Student ID");
	JLabel fn=new JLabel("First Name");
	JLabel ln=new JLabel("Last Name");
	JLabel date=new JLabel("Date");
	JLabel gender=new JLabel("Gender");
	JLabel address=new JLabel("Address");
	JLabel phone=new JLabel("Phone");
	JLabel email=new JLabel("Email");
	JLabel guadianN=new JLabel("Guadian Name");
	JLabel guadianPH=new JLabel("Guadian Phone");
	
JTextField idf=new JTextField("");
JTextField fnf=new JTextField("");
JTextField lnf=new JTextField("");
JTextField datef=new JTextField("");
String [] genderS = {"Male","Female","Both"};
JComboBox genderf=new JComboBox(genderS);
String [] addressS = {"Califonia","Newyork","Tokyo"};
JComboBox addressf=new JComboBox(addressS);
JTextField phonef=new JTextField("");
JTextField emailf=new JTextField("");
JTextField guadianNf=new JTextField("");
JTextField guadianPHf=new JTextField("");
public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				Login frame = new Login();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==register) {
		cstu();
	}
	if(e.getSource()==delete) {
	dstu();
	}
	if(e.getSource()==update) {
	ustu();
	}

	if(e.getSource()==reset) {
	rstu();
	}

	if(e.getSource()==select) {
	selstu();
	}
	if(e.getSource()==list) {
	liststu();
	}
	
	if(e.getSource()==attendance) {
		new Attendance();
		fr.dispose();
	}
	if(e.getSource()==course) {
		new Course();
		fr.dispose();
	}
	if(e.getSource()==enrollement) {
		new Enrollement();
		fr.dispose();
	}

	if(e.getSource()==grade) {
		new Grade();
		fr.dispose();
	}

	if(e.getSource()==student) {
		new Student();
		fr.dispose();
	}
	if(e.getSource()==transcript) {
		new Transcript();
		fr.dispose();
	}
	
	if(e.getSource()==logout) {
		new Login();
		fr.dispose();
	}
	
			
		}
private void liststu() {
	// TODO Auto-generated method stub
	 try {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
     } catch (Exception e) {
         e.printStackTrace();
     }

     JFrame viewFrame = new JFrame();
     viewFrame.setTitle("Student List");
     viewFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     viewFrame.setBounds(-5, 0, 1500, 300);

     // Create a panel to hold the table
     JPanel panel = new JPanel(new BorderLayout());

     // Create a table model to hold the parent/guardian data
     DefaultTableModel tableModel = new DefaultTableModel();
     JTable table = new JTable(tableModel);
     table.getTableHeader().setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

     // Add columns to the table
     tableModel.addColumn("Student ID");
     tableModel.addColumn("Fname");
     tableModel.addColumn("Lname");
     tableModel.addColumn("Date");
     tableModel.addColumn("Gender");
     tableModel.addColumn("Address");
     tableModel.addColumn("Email");
     tableModel.addColumn("GuadianN");
     tableModel.addColumn("GuaianPH");

     String dbURL = "jdbc:mysql://localhost:3306/studentinform";
		String username = "root";
		String password = "";
     try (Connection connection = DriverManager.getConnection(dbURL,username, password)) {
         String query = "SELECT * FROM student";
         PreparedStatement statement = connection.prepareStatement(query);
         ResultSet resultSet = statement.executeQuery();

         // Add rows to the table using the parent/guardian data from the database
         while (resultSet.next()) {
             Object[] row = new Object[18];
             row[0] = resultSet.getString("studentid");
             row[1] = resultSet.getString("fname");
             row[2] = resultSet.getString("lname");
             row[3] = resultSet.getString("lname");
             row[4] = resultSet.getString("gender");
             row[5] = resultSet.getString("address");
             row[6] = resultSet.getString("phone");
             row[7] = resultSet.getString("email");
             row[8] = resultSet.getString("guadianN");
             row[9] = resultSet.getString("guadianPH");
           
            
             tableModel.addRow(row);
         }
     } catch (SQLException ex) {
         ex.printStackTrace();
         JOptionPane.showMessageDialog(viewFrame, "Error", "Error", JOptionPane.ERROR_MESSAGE);
     }

     JScrollPane scrollPane = new JScrollPane(table);
     panel.add(scrollPane, BorderLayout.CENTER);

     // Create a header panel with a title label
     JPanel headerPanel = new JPanel(new BorderLayout());
     JLabel titleLabel = new JLabel("Student List ");
     titleLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
     titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
     headerPanel.add(titleLabel, BorderLayout.CENTER);
     panel.add(headerPanel, BorderLayout.NORTH);

     viewFrame.getContentPane().add(panel);
     viewFrame.setVisible(true);
	
}
private void selstu() {
	// TODO Auto-generated method stub
	String dbURL = "jdbc:mysql://localhost:3306/StudentInform";
	String username = "root";
	String password = "";
	String id=idf.getText();
	try {
	 
	    Connection conn = DriverManager.getConnection(dbURL, username, password);
	 
	    if (conn != null) {
	    	   JOptionPane.showMessageDialog(null, "Connected","",JOptionPane.INFORMATION_MESSAGE);
	        String sql = "SELECT * FROM student where studentid='"+id+"'";
	        
	        Statement statement = conn.createStatement();
	        ResultSet result = statement.executeQuery(sql);
	
	        while (result.next()){
	            String fn= result.getString(2);
	            String ln = result.getString(3);
	            String date= result.getString(4);
	            String gender = result.getString(5);
	            String address = result.getString(6);
	            String phone= result.getString(7);
	            String email = result.getString(8);
	            String guadianN = result.getString(9);
	            String guadianPH = result.getString(10);

				fnf.setText(fn);
				lnf.setText(ln);
				datef.setText(date);
				genderf.setSelectedItem(gender);
			    addressf.setSelectedItem(address);
			    phonef.setText(phone);
				emailf.setText(email);
				guadianNf.setText(guadianN);
				guadianPHf.setText(guadianPH);
			   

	        }
	    }
	} catch (SQLException ex) {
	    ex.printStackTrace();
	}
	

	
	
}
private void rstu() {
	idf.setText("");
	fnf.setText("");
	lnf.setText("");
	datef.setText("");
	genderf.setSelectedIndex(0);
	addressf.setSelectedIndex(0);
	phonef.setText("");
	emailf.setText("");
	guadianNf.setText("");
	guadianPHf.setText("");
	
}
private void ustu() {
	// TODO Auto-generated method stub
	String dbURL = "jdbc:mysql://localhost:3306/StudentInform";
	String username = "root";
	String password = "";
	String id=idf.getText();
	String fn=fnf.getText();
	String ln=lnf.getText();
	String date=datef.getText();
	String gender=(String) genderf.getSelectedItem();
	String address=(String) addressf.getSelectedItem();
	String phone=phonef.getText();
	String email=emailf.getText();
	String guadianN=guadianNf.getText();
	String guadianPH=guadianPHf.getText();
	
	try {
	 
	    Connection conn = DriverManager.getConnection(dbURL, username, password);
	 
	    if (conn != null) {
	    	  JOptionPane.showMessageDialog(null, "Connected","",JOptionPane.INFORMATION_MESSAGE);
	        String sql = "UPDATE student SET Fname=?,Lname=?,Date=?,Gender=?,Address=?,Phone=?,Email=?,GuadianN=?,GuadianPH=?  WHERE studentid=?";
	        
	        PreparedStatement statement = conn.prepareStatement(sql);
	    
		    statement.setString(1, fn);
		    statement.setString(2, ln);
		    statement.setString(3, date);
		    statement.setString(4, gender);
		    statement.setString(5, address);
		    statement.setString(6, phone);
		    statement.setString(7, email);
		    statement.setString(8, guadianN);
		    statement.setString(9, guadianPH);
	        statement.setString(10, id);
	        int rowsUpdated = statement.executeUpdate();
	        if (rowsUpdated > 0) {
	        	 String fln=fn+" "+ln;
			        JOptionPane.showMessageDialog(null,fln+" is Updated","",JOptionPane.INFORMATION_MESSAGE);
	        }
	    }
	} catch (SQLException ex) {
	    ex.printStackTrace();
	}
	idf.setText("");
	fnf.setText("");
	lnf.setText("");
	datef.setText("");
	genderf.setSelectedIndex(0);
	addressf.setSelectedIndex(0);
	phonef.setText("");
	emailf.setText("");
	guadianNf.setText("");
	guadianPHf.setText("");
	
}
private void dstu() {
	// TODO Auto-generated method stub
	String dbURL = "jdbc:mysql://localhost:3306/StudentInform";
	String username = "root";
	String password = "";
	String id=idf.getText();
	try {
	 
	    Connection conn = DriverManager.getConnection(dbURL, username, password);
	 
	    if (conn != null) {
	    	  JOptionPane.showMessageDialog(null, "Connected","",JOptionPane.INFORMATION_MESSAGE);
	        String sql = "DELETE FROM Student WHERE studentid=?";
	        
	        PreparedStatement statement = conn.prepareStatement(sql);
	        statement.setString(1, id);
	         
	        int rowsDeleted = statement.executeUpdate();
	        if (rowsDeleted > 0) {
	        	
			        JOptionPane.showMessageDialog(null,"Record is Deleted","",JOptionPane.INFORMATION_MESSAGE);
	        }
	    }
	} catch (SQLException ex) {
	    ex.printStackTrace();
	}
	idf.setText("");
	fnf.setText("");
	lnf.setText("");
	datef.setText("");
	genderf.setSelectedIndex(0);
	addressf.setSelectedIndex(0);
	phonef.setText("");
	emailf.setText("");
	guadianNf.setText("");
	guadianPHf.setText("");
	
}
private void cstu() {
	// TODO Auto-generated method stub
	String dbURL = "jdbc:mysql://localhost:3306/StudentInform";
	String username = "root";
	String password = "";
	
	String id=idf.getText();
	String fn=fnf.getText();
	String ln=lnf.getText();
	String date=datef.getText();
	String gender=(String) genderf.getSelectedItem();
	String address=(String) addressf.getSelectedItem();
	String phone=phonef.getText();
	String email=emailf.getText();
	String guadianN=guadianNf.getText();
	String guadianPH=guadianPHf.getText();


	try {
	 
	    Connection conn = DriverManager.getConnection(dbURL, username, password);
	  
	    if (conn != null) {
	    	   JOptionPane.showMessageDialog(null, "Connected","",JOptionPane.INFORMATION_MESSAGE);
	        String sql = "INSERT INTO student (studentID,Fname , Lname,Date,Gender,Address,Phone,Email,GuadianN,GuadianPH) VALUES (?,?,?,?,?,?,?,?,?,?)";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, id);
		    statement.setString(2, fn);
		    statement.setString(3, ln);
		    statement.setString(4, date);
		    statement.setString(5, gender);
		    statement.setString(6, address);
		    statement.setString(7, phone);
		    statement.setString(8, email);
		    statement.setString(9, guadianN);
		    statement.setString(10, guadianPH);
           
		    int rowsInserted = statement.executeUpdate();
		    if (rowsInserted > 0) {
		    	 String fln=fn+" "+ln;
		        JOptionPane.showMessageDialog(null,fln+" is Registered","",JOptionPane.INFORMATION_MESSAGE);
		    }
	    }
	} catch (SQLException ex) {
	    ex.printStackTrace();
	}
	idf.setText("");
	fnf.setText("");
	lnf.setText("");
	datef.setText("");
	genderf.setSelectedIndex(0);
	addressf.setSelectedIndex(0);
	phonef.setText("");
	emailf.setText("");
	guadianNf.setText("");
	guadianPHf.setText("");
	
}
	
}

