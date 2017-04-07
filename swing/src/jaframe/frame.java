package jaframe;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class frame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label1;
	private JTextField tf1;
	public frame(){
		super("the title bar");
		setLayout(null);
		label1=new JLabel("abhishek tamrakar");
		label1.setBounds(140, 100, 150, 20);
		label1.setToolTipText("this is my name");
		tf1=new JTextField("Welcome");
		tf1.setBounds(150,50,90,20);
		JButton b = new JButton("click me");
		b.setBounds(115, 150,150,30);
		
		b.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				label1.setText("he is good");
				tf1.setText("suck it");
				
			}
		});
		
		add(b);
		add(label1);
		add(tf1);
	}
	

}
