package JScrollbar;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class Scroll extends JFrame implements AdjustmentListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel j1;
	private JScrollBar s;
	public Scroll(){
		super("Scoll example");
		j1 = new JLabel();
		s = new JScrollBar();
		j1.setBounds(150,20,200,30);
		s.setBounds(150, 50, 50, 150);
		add(j1);
		add(s);
		s.addAdjustmentListener(this);
		
		
		
	}
	public void adjustmentValueChanged(AdjustmentEvent arg0) {
		String word = "Scroll value:"+s.getValue();
		j1.setText(word);
	}
}
