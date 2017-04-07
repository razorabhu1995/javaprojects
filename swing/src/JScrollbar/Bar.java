package JScrollbar;

import javax.swing.JFrame;

public class Bar {
	public static void main(String[] args){
		Scroll sl = new Scroll();
		sl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sl.setLayout(null);
		sl.setSize(500,300);
		sl.setVisible(true);
	}
}
