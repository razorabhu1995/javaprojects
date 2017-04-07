package addSub;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class AddSub extends JFrame implements ActionListener{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel l1,l2,l3;
	JTextField jf1;
	 JTextField jf2;
	 JTextField jf3;
	JButton b1,b2,b3,b4;
	
	
	public AddSub(){
		super("Calculator");
		l1= new JLabel("Enter 1st value: ");
		l1.setBounds(50,20,120,30);
		jf1 = new JTextField();
		jf1.setBounds(160,20,100,30);
		
		l2= new JLabel("Enter 2st value: ");
		l2.setBounds(50,60,120,30);
		jf2 = new JTextField();
		jf2.setBounds(160, 60, 100, 30);
		
		l3= new JLabel("result: ");
		l3.setBounds(100,100,120,30);
		jf3 = new JTextField();
		jf3.setBounds(160, 100, 100, 30);
		
		jf3.setEditable(false);
		b1 = new JButton("+");
		b1.setBounds(160,140,50,30);
		b2 = new JButton("-");
		b2.setBounds(220,140,50,30);
		
		b3 = new JButton("x");
		b3.setBounds(160, 180, 50, 30);
		
		b4 = new JButton("/");
		b4.setBounds(220,180,50,30);
		
		JSeparator s = new JSeparator();
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		add(jf1);
		add(jf2);
		add(jf3);
		add(b1);
		add(s);
		add(b2);
		add(s);
		add(b3);
		add(b4);
		add(l1);
		add(l2);
		add(l3);
	}
	
		public void actionPerformed(ActionEvent e){
			String a = jf1.getText();
			String b = jf2.getText();
			int x = Integer.parseInt(a);
			int y = Integer.parseInt(b);
			int z=0;
			if(e.getSource()==b1){
				z=x+y;
				
			}
			else if(e.getSource()==b2){
				z=x-y;
			}
			else if(e.getSource()==b3){
				z=x*y;
			}
			else if(e.getSource()==b4){
				z=x/y;
			}
			String result = Integer.toString(z);
			
			jf3.setText(result);
	}

	

}
