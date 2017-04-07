package swingtools;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class butt extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  JButton butt1;
	private JButton butt2;
	public butt(){
		super("buttons");
		Icon a = new ImageIcon(getClass().getResource("logo1.png"));
		Icon b = new ImageIcon(getClass().getResource("logo2.png"));
		
		butt1= new JButton("click me");
		butt1.setBounds(150, 150, 150, 30);
		butt2=new JButton("click", a);
		butt2.setRolloverIcon(b);
		butt2.setBounds(150, 190, 150, 50);	
			
		add(butt1);
		add(butt2);
		
		
		
		
		
		
		
		
		
	}

}
