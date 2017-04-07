package password;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Password extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel l1,l2,l3;
	private JTextField tf1;
	private JPasswordField p;
	
	public Password(){
		super("LOGIN FORM");
		Image icon = Toolkit.getDefaultToolkit().getImage("E:\\6th\\project wt\\logo1.png");
		setIconImage(icon);
		l1= new JLabel("Username:");
		l1.setBounds(100, 20, 120, 30);
		l2 = new JLabel("Password:");
		l2.setBounds(100,70, 120,30);
		tf1 = new JTextField();
		tf1.setBounds(230, 20, 150, 30);
		p= new JPasswordField();
		p.setBounds(230, 70, 150, 30);
		JButton b = new JButton("Login");
		b.setBounds(180,110,100,30);
		l3 = new JLabel();
		l3.setBounds(120,150,300,40);
		b.addActionListener(this);
		add(l1);
		add(l2);
		add(l3);
		add(tf1);
		add(b);
		add(p);
		
		
		
		
		
	}

	public void actionPerformed(ActionEvent e) {
		String text = "Username: "+tf1.getText();
		text += "  &  Password: "+new String(p.getPassword()); 
		l3.setText(text);
		
	}

}
