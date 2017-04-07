package Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class MenuBar extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenuBar mb;
	private JMenu File, Edit, Source;
	private JMenuItem copy, paste, cut , select;
	private JTextArea ta;
	public MenuBar(){
		super("Menu");
		mb = new JMenuBar();
		
		File = new JMenu("File");
		Edit = new JMenu("Edit");
		Source = new JMenu("Source");
		mb.add(File);
		mb.add(Edit);
		mb.add(Source);
		
		copy = new JMenuItem("Copy");
		paste = new JMenuItem("Paste");
		cut= new JMenuItem("Cut");
		select = new JMenuItem("Select All");
		Edit.add(copy);
		Edit.addSeparator();
		Edit.add(paste);
		Edit.addSeparator();
		Edit.add(cut);
		Edit.addSeparator();
		Edit.add(select);
		
		ta = new JTextArea();
		ta.setBounds(30, 30, 450, 250);
		add(ta);
		copy.addActionListener(this);
		paste.addActionListener(this);
		cut.addActionListener(this);
		select.addActionListener(this);
		add(mb);
		setJMenuBar(mb);
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			if(e.getSource()==copy){
				ta.copy();
			}
			else if(e.getSource()==paste){
				ta.paste();
			}
			else if(e.getSource()==cut){
				ta.cut();
			}
			else if(e.getSource()==select){
				ta.selectAll();
			}
}
}