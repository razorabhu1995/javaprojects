package jcomponets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Counters extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel j1;
	private JLabel j2;
	private JTextArea t1;
	private JButton b;
	public Counters(){
	j1= new JLabel();
	j2= new JLabel();
	t1 = new JTextArea();
	j1.setBounds(100, 20, 100, 30);
	j2.setBounds(300, 20, 100, 30);
	t1.setBounds(50,70,500,600);
	b=new JButton("COUNT");
	b.setBounds(250, 670, 100, 30);
	b.addActionListener(this); 
	add(j1);
	add(t1);
	add(b);
	add(j2);
		
	}
	public void actionPerformed(ActionEvent e){
		String t = t1.getText();
		String words[] = t.split("\\s");
		j1.setText("word counts:"+words.length);
		j2.setText("letter counts:"+t.length());
	}
}
